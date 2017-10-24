package yingdg.exercise.springcloud.cloud_service_config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class CloudServiceConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudServiceConfigApplication.class, args);
    }
}
