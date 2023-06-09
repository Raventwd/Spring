package Project;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import Project.Classes.*;

@Configuration
public class AppConfig {

    @Bean("car")
    public Car getCarBean() {
        return new Car("car1");
    }
    @Bean("bus")
    public Bus getBusBean() {
        return new Bus("car2");
    }
    @Bean("pickup")
    public Pickup getPickupBean() {
        return new Pickup("car3");
    }
    @Bean("driver1")
    public Driver getDriverBean() {
        return new Driver("driver1", getCarBean());
    }
    @Bean("driver2")
    public Driver getDriver2Bean() {
        return new Driver("driver2", getBusBean());
    }
    @Bean("driver3")
    public Driver getDriver3Bean() {
        return new Driver("driver3", getPickupBean());
    }


}
