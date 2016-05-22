package com.github.vorago.sa;

import static spark.Spark.get;
import static spark.Spark.port;

public class Main {
    public static void main(String[] args) {
        port(8082);
        get("/", (req, res) -> "Service B");
    }
}
