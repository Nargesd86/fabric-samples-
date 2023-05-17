import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParser;
import io.grpc.Grpc;
import io.grpc.ManagedChannel;
import io.grpc.TlsChannelCredentials;
import org.hyperledger.fabric.client.CommitException;
import org.hyperledger.fabric.client.CommitStatusException;
import org.hyperledger.fabric.client.Contract;
import org.hyperledger.fabric.client.EndorseException;
import org.hyperledger.fabric.client.Gateway;
import org.hyperledger.fabric.client.GatewayException;
import org.hyperledger.fabric.client.SubmitException;
import org.hyperledger.fabric.client.identity.Identities;
import org.hyperledger.fabric.client.identity.Identity;
import org.hyperledger.fabric.client.identity.Signer;
import org.hyperledger.fabric.client.identity.Signers;
import org.hyperledger.fabric.client.identity.X509Identity;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.InvalidKeyException;
import java.security.cert.CertificateException;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

public class PriorityQueue {

    public PriorityQueue() {
    }

    public static void main(String[] var0) {
        System.out.println("I am being called");

    }
    public void createqueue(String name, String... args){
        java.util.PriorityQueue var1 = new java.util.PriorityQueue();
        var1.add(5);
        var1.add(3);
        var1.add(7);
        var1.add(1);
        int var2 = (Integer)var1.poll();
        System.out.println("Highest priority element: " + var2);
        System.out.println("Priority queue elements:");

        while(!var1.isEmpty()) {
            int var3 = (Integer)var1.poll();
            System.out.println(var3);
        }

    }

}
