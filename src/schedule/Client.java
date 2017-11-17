package schedule;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import schedule.config.MyConfig;

public class Client {
    public static void main(String [] args) {
        AnnotationConfigApplicationContext context = new
                AnnotationConfigApplicationContext(MyConfig.class);
    }
}
