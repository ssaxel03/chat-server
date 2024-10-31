package io.codeforall.fanstatics;

public class WebServer {

    public static void main(String[] args) {

        Server server = new Server(10000);

        server.run();

    }

}
