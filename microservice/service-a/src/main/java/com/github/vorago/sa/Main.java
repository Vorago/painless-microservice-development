package com.github.vorago.sa;

import static spark.Spark.get;
import static spark.Spark.port;

public class Main {
    public static void main(String[] args) {
        port(8081);
        get("/hello", (req, res) -> "Service A");
    }
}
