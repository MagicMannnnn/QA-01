package poker.api;

import com.sun.net.httpserver.HttpExchange;
import poker.GameContext;

import java.io.IOException;
import java.io.OutputStream;

public class ApiHandlers {

    private static void addCorsHeaders(HttpExchange exchange) {
        exchange.getResponseHeaders().add("Access-Control-Allow-Origin", "*");
        exchange.getResponseHeaders().add("Access-Control-Allow-Methods", "GET, POST, OPTIONS");
        exchange.getResponseHeaders().add("Access-Control-Allow-Headers", "*");
    }


    public static void getCard(HttpExchange exchange) throws IOException {
        if ("OPTIONS".equalsIgnoreCase(exchange.getRequestMethod())) {
            addCorsHeaders(exchange);
            exchange.sendResponseHeaders(204, -1);
            return;
        }

        if ("GET".equalsIgnoreCase(exchange.getRequestMethod())) {
            String cardName = GameContext.getCard().toString(); // e.g. "ace_of_spades.svg"

            String response = "{\"card\": \"" + cardName.replace("\"", "\\\"") + "\"}";

            addCorsHeaders(exchange);
            exchange.getResponseHeaders().add("Content-Type", "application/json");
            exchange.sendResponseHeaders(200, response.getBytes().length);

            try (OutputStream os = exchange.getResponseBody()) {
                os.write(response.getBytes());
            }
        } else {
            addCorsHeaders(exchange);
            exchange.sendResponseHeaders(405, -1);
        }
    }


}

