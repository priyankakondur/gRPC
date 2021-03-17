package serverCode;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import users.UserService;

import java.io.IOException;

public class GRPCServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        //add userService on port and start the server

        Server server = ServerBuilder.forPort(8080).addService(new UserService()).build();
        server.start();
        System.out.println("Server started on port: "+server.getPort());
        server.awaitTermination();
    }
}
