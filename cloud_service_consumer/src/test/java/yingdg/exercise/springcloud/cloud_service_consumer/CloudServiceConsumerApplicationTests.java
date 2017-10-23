package yingdg.exercise.springcloud.cloud_service_consumer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import yingdg.exercise.springcloud.cloud_service_consumer.service.DemoServiceConsumer;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CloudServiceConsumerApplicationTests {
    @Resource
    private DemoServiceConsumer demoService;

    @Test
    public void contextLoads() {
        System.out.println(demoService.hiService("boy"));
    }

}
