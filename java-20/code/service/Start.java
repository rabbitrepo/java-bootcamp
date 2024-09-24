package service;

import java.util.Arrays;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

class Start {

    public static void main(String[] args) {
        ApplicationContext context;
        context = SpringApplication.run(Setup.class);
    }
}

@SpringBootApplication
class Setup {

}

@RestController
class Sample {

    @RequestMapping("/api/ping")
    String ping() {
        return "Pong";
    }

    @RequestMapping("/api/check")
    String check(@RequestParam("city") String city) {

        String[] branches = {"Atlanta", "Boston", "Chicago", "Detroit", "New York"};

        if (Arrays.asList(branches).contains(city)) {
            return "True";
        } else {
            return "False";
        }

    }
}

//package service;
//
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//class Start {
//
//    public static void main(String[] args) {
//        AnnotationConfigApplicationContext context;
//        context = new AnnotationConfigApplicationContext(Setup.class);
//
//        Player x = context.getBean("createDavid", Player.class);
//        System.out.println(x.name);
//
//        Player y = context.getBean("customBeanName", Player.class);
//        System.out.println(y.name);
//
//    }
//}
//
//// ตั้งแต่ SpringBoot 6 ขึ้นไป @ ใส่หรือไม่ก็ได้
//@Configuration
//class Setup {
//
//    @Bean
//    Player createDavid() {
//        Player p = new Player();
//        p.name = "David";
//        p.salary = 30000;
//        return p;
//    }
//
//    @Bean("customBeanName")
//    Player createJane() {
//        Player p = new Player();
//        p.name = "Jane";
//        p.salary = 100000;
//        return p;
//    }
//}
//
//@CustomAnnotation
//class Player {
//
//    String name;
//    @CustomAnnotation
//    double salary;
//}
//
//@interface CustomAnnotation {
//}
