package co.uk.udemy.srpingtuturial.basics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SrpingtuturialApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SrpingtuturialApplication.class, args);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		int result = binarySearch.binarySearch(new int [] {12, 4, 5,7}, 3);
	}
}
