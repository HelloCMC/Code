package crawring;

import static spark.Spark.*;

public class HelloWorld {
    public static void main(String[] arg){
    	
        get("/hello", (request, response) -> {
        		return "Hello World!";
        	}
        );
    }
}