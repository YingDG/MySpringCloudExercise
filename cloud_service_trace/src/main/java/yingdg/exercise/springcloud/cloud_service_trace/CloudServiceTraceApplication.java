package yingdg.exercise.springcloud.cloud_service_trace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class CloudServiceTraceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudServiceTraceApplication.class, args);
	}
}
