package yingdg.exercise.springcloud.cloud_service_consumer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import yingdg.exercise.springcloud.cloud_service_consumer.service.DemoServiceConsumer;
import yingdg.exercise.springcloud.cloud_service_consumer.service.FeignServiceHi;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CloudServiceConsumerApplicationTests {
    @Resource
    private DemoServiceConsumer demoService;
    @Resource
    private FeignServiceHi feignService;

    @Test
    public void contextLoads() {
        System.out.println(demoService.hiService("boy"));
    }

    @Test
    public void contextLoads2() {
        System.out.println(feignService.sayHi("girl"));
    }

}
