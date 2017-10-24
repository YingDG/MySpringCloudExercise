package yingdg.exercise.springcloud.cloud_service_config_client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class CloudServiceConfigClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudServiceConfigClientApplication.class, args);
    }

    @Value("${foo}")
    private String foo;

    @GetMapping(value = "/config")
    public String hi() {
        return foo;
    }

}
