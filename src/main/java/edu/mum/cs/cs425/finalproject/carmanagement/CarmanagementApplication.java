package edu.mum.cs.cs425.finalproject.carmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.TimeZone;
@SpringBootApplication
public class CarmanagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarmanagementApplication.class, args);
    }
    @PostConstruct
    void started() {
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
    }
}
