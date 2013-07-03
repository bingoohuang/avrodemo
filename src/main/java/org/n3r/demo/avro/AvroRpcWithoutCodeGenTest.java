package org.n3r.demo.avro;

import org.apache.avro.Protocol;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.GenericRecord;
import org.apache.avro.ipc.HttpServer;
import org.apache.avro.ipc.HttpTransceiver;
import org.apache.avro.ipc.Transceiver;
import org.apache.avro.ipc.generic.GenericRequestor;
import org.apache.avro.ipc.generic.GenericResponder;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class AvroRpcWithoutCodeGenTest {
    public static void main(String[] args) throws Exception {
        Server server = new Server(getProtocol("avro-demo/message.avpr"), 10999);
        server.run();

        GenericRecord response = new Client(getProtocol("avro-demo/message.avpr"), "127.0.0.1", 10999).run();
        System.out.println(response);
        server.stop();
    }

    public static Protocol getProtocol(String avprFilePath) {
        try {
            return Protocol.parse(new File(avprFilePath));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static class Server extends GenericResponder {
        private Protocol protocol = null;
        private int port;
        private HttpServer server;

        public Server(Protocol protocol, int port) {
            super(protocol);
            this.protocol = protocol;
            this.port = port;
        }

        public Object respond(Protocol.Message message, Object request)  {
            GenericRecord req = (GenericRecord) request;
            GenericRecord msg = (GenericRecord)(req.get("message"));
            // process the request
            msg.put("name", "huang");

            return msg;
        }

        public void run() {
            try {
                server = new HttpServer(this, port);

                server.start();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        public void stop() {
            server.close();
        }
    }

    public static class Client {
        private Protocol protocol = null;
        private String host = null;
        private int port = 0;

        public Client(Protocol protocol, String host, int port) {
            this.protocol = protocol;
            this.host = host;
            this.port = port;
        }

        public GenericRecord sendMessage() throws Exception {
            GenericRecord requestData = new GenericData.Record(protocol.getType("message"));
            // initiate the request data
            requestData.put("name", "bingoo");
            requestData.put("type", 1000);
            requestData.put("price", 1.234d);
            requestData.put("valid", true);

            GenericRecord request = new GenericData.Record(protocol.getMessages()
                    .get("sendMessage").getRequest());
            request.put("message", requestData);

            Transceiver t = new HttpTransceiver(new URL("http://" + host + ":" + port));
            GenericRequestor requestor = new GenericRequestor(protocol, t);

            GenericRecord sendMessage = (GenericRecord) requestor.request("sendMessage", request);

            return sendMessage;
        }

        public GenericRecord run() {
            try {
               return sendMessage();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

    }
}
