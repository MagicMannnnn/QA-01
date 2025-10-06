package poker.api;

import com.sun.net.httpserver.HttpServer;
import java.net.InetSocketAddress;

public class Server {
    private static final int PORT = 3000;
    private HttpServer server;

    public void start() throws Exception {
        server = HttpServer.create(new InetSocketAddress(PORT), 0);
        server.createContext("/getCard", ApiHandlers::getCard);
        server.setExecutor(null);
        System.out.println("API server started on port " + PORT);
        server.start();
    }

    public void stop() {
        if (server != null) {
            server.stop(0);
            System.out.println("API server stopped.");
        }
    }
}
