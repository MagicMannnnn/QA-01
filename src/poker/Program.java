package poker;

import poker.api.Server;

public class Program {

    static void main(String[] args) throws Exception {
        Testing.test();

        Server server = new Server();
        server.start();
    }

}
