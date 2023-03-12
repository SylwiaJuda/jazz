package pl.pjatk.syljud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SyljudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SyljudApplication.class, args);
	}
	public SyljudApplication(OrderService orderService,StationeryStorage stationeryStorage,One one){
		System.out.printf(stationeryStorage.findStationery(1).toString());
		one.printOne();
		System.out.printf("second2");

	}

}
