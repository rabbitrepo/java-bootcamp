package src

import org.springframework.core.SpringVersion;
import org.springframework.context.support.GenericApplicationContext;

public class Start {

    public static void main(String[] args) {
//        System.out.println("Hey!");
//        String version = SpringVersion.getVersion();
//        System.out.println(version);
        GenericApplicationContext context;
        context = registerBean(Player.class);
        context.refresh();
    }
}

class Player {
    String name;
    int number;
    double salary;
}