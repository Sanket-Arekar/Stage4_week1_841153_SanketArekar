/*
 * package application;
 * 
 *//**
	 * Hello world!
	 *
	 *//*
		 * import org.springframework.boot.SpringApplication; import
		 * org.springframework.boot.autoconfigure.SpringBootApplication;
		 * 
		 * @SpringBootApplication public class App { public static void main( String[]
		 * args ) { SpringApplication.run(App.class, args); System.out.println(
		 * "Hello World!" ); } }
		 */
package application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
/*Class for running spring application*/
@SpringBootApplication
@ComponentScan(basePackages="model")
public class App {
	
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
