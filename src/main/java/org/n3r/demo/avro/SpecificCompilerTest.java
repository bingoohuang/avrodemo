package org.n3r.demo.avro;

import org.apache.avro.Schema;
import org.apache.avro.compiler.specific.SpecificCompiler;
import org.apache.avro.generic.GenericDatumReader;
import org.apache.avro.generic.GenericRecord;
import org.apache.avro.io.Decoder;
import org.apache.avro.io.DecoderFactory;
import org.apache.avro.io.JsonDecoder;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

// http://blog.voidsearch.com/bigdata/apache-avro-in-practice/
public class SpecificCompilerTest {
    public static void main(String[] args) throws IOException {
        //System.out.println(new File(".").getAbsolutePath());
        SpecificCompiler.compileSchema(new File("avro-demo/fb_user.avpr"), new File("avro-demo/src/avro/generated/"));
    }

    public void testCompareSchema() throws IOException {
        Schema s = Schema.parse(new File("avro-demo/fb_user.avpr"));
        GenericDatumReader<GenericRecord> r = new GenericDatumReader<GenericRecord>(s);
        Decoder decoder = DecoderFactory.get().jsonDecoder(s,
                new FileInputStream(new File("test_data_json.avro")));
        GenericRecord rec =  r.read(null, decoder);
        if (s.equals(rec.getSchema())) {
            // handle regular fields
        } else {
            // handle differences
        }
    }
}
