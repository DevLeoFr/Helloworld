//package com.example.Helloworld1;
//
//import com.example.model.HelloWorld;
//import com.example.service.BusinessService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//@SpringBootApplication
//public class Helloworld1Application implements CommandLineRunner {
//    @Autowired
//	private BusinessService bs;
//	public static void main(String[] args) {
//		SpringApplication.run(Helloworld1Application.class, args);
//	}
//
//	@Override
//	public void run(String... args) throws Exception {
//		HelloWorld hw = bs.getHelloWorld();
//		System.out.println(hw);
//	}
//
//}
//
//
//
//




package com.example.Helloworld1;

import com.example.model.HelloWorld;
import com.example.service.BusinessService;
import com.example.service.BusinessServiceConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(BusinessServiceConfig.class)
public class Helloworld1Application implements CommandLineRunner {
    @Autowired
    private BusinessService bs;
    public static void main(String[] args) {
        SpringApplication.run(Helloworld1Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        HelloWorld hw = bs.getHelloWorld();
        System.out.println(hw);
    }

}



//package com.example.Helloworld1;
//
//import com.example.model.HelloWorld;
//import com.example.service.BusinessService;
//import com.example.service.BusinessServiceConfig;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.Import;
//
//@SpringBootApplication
//@Import(BusinessServiceConfig.class)
//public class Helloworld1Application implements CommandLineRunner {
//    @Autowired
//    private BusinessService bs;
//    public static void main(String[] args) {
//        SpringApplication.run(Helloworld1Application.class, args);
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//        HelloWorld hw = bs.getHelloWorld();
//        System.out.println(hw);
//    }
//
//}

