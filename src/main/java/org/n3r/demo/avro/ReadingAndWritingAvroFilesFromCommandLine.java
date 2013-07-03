package org.n3r.demo.avro;

// http://www.michael-noll.com/blog/2013/03/17/reading-and-writing-avro-files-from-the-command-line/
public class ReadingAndWritingAvroFilesFromCommandLine {
/*

Converting to and from binary Avro
JSON to binary Avro
Without compression:

$ java -jar ~/avro-tools-1.7.4.jar fromjson --schema-file twitter.avsc twitter.json > twitter.avro
With Snappy compression:

$ java -jar ~/avro-tools-1.7.4.jar fromjson --codec snappy --schema-file twitter.avsc twitter.json > twitter.snappy.avro
Note for Mac OS X users: If you run into SnappyError: [FAILED_TO_LOAD_NATIVE_LIBRARY] when trying to compress the data with Snappy make sure you use JDK 6 and not JDK 7.
Binary Avro to JSON
The same command will work on both uncompressed and compressed data.

$ java -jar ~/avro-tools-1.7.4.jar tojson twitter.avro > twitter.json
$ java -jar ~/avro-tools-1.7.4.jar tojson twitter.snappy.avro > twitter.json
Note for Mac OS X users: If you run into SnappyError: [FAILED_TO_LOAD_NATIVE_LIBRARY] when trying to decompress the data with Snappy make sure you use JDK 6 and not JDK 7.
Retrieve Avro schema from binary Avro
The same command will work on both uncompressed and compressed data.

$ java -jar ~/avro-tools-1.7.4.jar getschema twitter.avro > twitter.avsc
$ java -jar ~/avro-tools-1.7.4.jar getschema twitter.snappy.avro > twitter.avsc

 */
}
