package org.n3r.demo.avro;

import org.apache.avro.Schema;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.GenericDatumReader;
import org.apache.avro.generic.GenericDatumWriter;
import org.apache.avro.generic.GenericRecord;
import org.apache.avro.io.*;
import org.apache.avro.util.Utf8;
import org.junit.Test;

import javax.xml.bind.DatatypeConverter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import static org.junit.Assert.assertEquals;

// https://sites.google.com/site/developertips/Home/java/apache-avro
// Use a JSON schema to encode the data and use the same/similar schema to decode the data.
public class AvroHelloWorldTest {
    @Test
    public void testJsonEncode() throws IOException {
        String schemaDescription =
                " {    \n" +
                        " \"name\": \"FacebookUser\", \n" +
                        " \"type\": \"record\",\n" +
                        " \"fields\": [\n" +
                        "   {\"name\": \"name\", \"type\": \"string\"},\n" +
                        "   {\"name\": \"num_likes\", \"type\": \"int\"},\n" +
                        "   {\"name\": \"num_photos\", \"type\": \"int\"},\n" +
                        "   {\"name\": \"num_groups\", \"type\": \"int\"} ]\n" +
                        "}";

        Schema s = Schema.parse(schemaDescription);

        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        GenericDatumWriter w = new GenericDatumWriter(s);
        Encoder e =  EncoderFactory.get().jsonEncoder(s,
                new FileOutputStream(new File("test_data.avro")));

        GenericRecord r = new GenericData.Record(s);
        r.put("name", new org.apache.avro.util.Utf8("Doctor Who"));
        r.put("num_likes", 1);
        r.put("num_photos", 0);
        r.put("num_groups", 423);

        w.write(r, e);
        e.flush();
    }
    @Test
    public void testBinaryEncoder() throws IOException {
        // Schema
        String schemaDescription = " {    \n"
                + " \"name\": \"FacebookUser\", \n"
                + " \"type\": \"record\",\n" + " \"fields\": [\n"
                + "   {\"name\": \"name\", \"type\": \"string\"},\n"
                + "   {\"name\": \"num_likes\", \"type\": \"int\"},\n"
                + "   {\"name\": \"num_photos\", \"type\": \"int\"},\n"
                + "   {\"name\": \"num_groups\", \"type\": \"int\"} ]\n" + "}";

        Schema s = new Schema.Parser().parse(schemaDescription);
        GenericDatumWriter w = new GenericDatumWriter(s);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        Encoder e = EncoderFactory.get().binaryEncoder(outputStream, null);

        // Populate data
        GenericRecord r = new GenericData.Record(s);
        r.put("name", new Utf8("Doctor Who"));
        r.put("num_likes", 1);
        r.put("num_groups", 423);
        r.put("num_photos", 0);

        // Encode
        w.write(r, e);
        e.flush();

        String encodedString = DatatypeConverter.printHexBinary(outputStream.toByteArray());

        assertEquals("14446F63746F722057686F0200CE06", encodedString);

        // Decode using same schema
        DatumReader<GenericRecord> reader = new GenericDatumReader<GenericRecord>(s);
        Decoder decoder = DecoderFactory.get().binaryDecoder(outputStream.toByteArray(), null);
        GenericRecord result = reader.read(null, decoder);
        assertEquals(new Utf8("Doctor Who"), result.get("name"));
        assertEquals(1, result.get("num_likes"));
        assertEquals(423, result.get("num_groups"));
        assertEquals(0, result.get("num_photos"));
    }
}