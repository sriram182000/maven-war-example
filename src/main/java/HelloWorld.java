import spark.servlet.SparkApplication;

import static spark.Spark.get;

public class HelloWorld implements SparkApplication {
	public static void main(String[] args) {
		new HelloWorld().init();
	}

	@Override
	public void init() {
		get("/hello", (req, res) -> "Hello");
		get("/hello", (req, res) -> "Deploy war file into Tomcat container using Jenkins automation by Deekshith_Maram");
	}
}
