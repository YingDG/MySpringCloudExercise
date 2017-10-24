package yingdg.exercise.springcloud.cloud_service_provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
public class CloudServiceProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudServiceProviderApplication.class, args);
	}

	@Bean
	public AlwaysSampler defaultSampler(){
		return new AlwaysSampler();
	}

}
