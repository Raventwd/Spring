package Project;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import Project.Config.AppConfig;
import Project.Classes.*;


public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Car car = context.getBean(Car.class);
        Bus bus = context.getBean(Bus.class);
        Pickup pickup = context.getBean(Pickup.class);

        car.ready();
        bus.ready();
        pickup.ready();

        Driver driver1 = context.getBean("driver1", Driver.class);
        Driver driver2 = context.getBean("driver2", Driver.class);
        Driver driver3 = context.getBean("driver3", Driver.class);

        System.out.println(driver1);
        System.out.println(driver2);
        System.out.println(driver3);

    }
}