package sparkjava;

import static spark.Spark.get;
import static spark.Spark.modelAndView;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import weather.FreeMarkerTemplateEngine;

public class FreeMarkerExample {

    public static void main(String args[]) throws IOException {

        get("/hello", (request, response) -> {
            Map<String, Object> attributes = new HashMap<>();
            attributes.put("message", "Hello FreeMarker World");

            return modelAndView(attributes, "hello.ftl");
        }, new FreeMarkerTemplateEngine());
    
    
    }
}