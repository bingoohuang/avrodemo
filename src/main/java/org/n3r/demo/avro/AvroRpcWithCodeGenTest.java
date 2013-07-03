package org.n3r.demo.avro;

import org.apache.avro.AvroRemoteException;
import org.apache.avro.ipc.NettyServer;
import org.apache.avro.ipc.NettyTransceiver;
import org.apache.avro.ipc.specific.SpecificRequestor;
import org.apache.avro.ipc.specific.SpecificResponder;
import org.apache.avro.util.Utf8;
import org.gbif.ecat.ws.NubLookup;
import org.gbif.ecat.ws.Request;
import org.gbif.ecat.ws.Response;
import org.junit.Test;

import java.io.IOException;
import java.net.InetSocketAddress;

public class AvroRpcWithCodeGenTest {
    // A mock implementation
    public static class NubLookupImpl implements NubLookup {
        public Response send(Request request) throws AvroRemoteException {
            System.out.println(request.getName());
            Response r = new Response();
            r.setKingdomId(100);
            return r;
        }
    }

    @Test
    public void test() throws IOException {
        NettyServer server = new NettyServer(new SpecificResponder(
                NubLookup.class,
                new NubLookupImpl()),
                new InetSocketAddress(7001));

        NettyTransceiver client = new NettyTransceiver(new InetSocketAddress(server.getPort()));

        NubLookup proxy = SpecificRequestor.getClient(NubLookup.class, client);

        Request req = new Request();
        req.setName(new Utf8("I See You"));
        System.out.println("Result: " + proxy.send(req).getKingdomId());

        client.close();
        server.close();
    }
}
