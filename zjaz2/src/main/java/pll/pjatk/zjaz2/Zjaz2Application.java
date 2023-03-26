package pll.pjatk.zjaz2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Zjaz2Application {

	public static void main(String[] args) {
		SpringApplication.run(Zjaz2Application.class, args);
	}
	public Zjaz2Application( IGetBean iGetBean){
		System.out.println(iGetBean);


	}
}

