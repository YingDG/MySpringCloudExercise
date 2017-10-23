package yingdg.exercise.springcloud.cloud_service_consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import yingdg.exercise.springcloud.cloud_service_consumer.service.DemoServiceConsumer;
import yingdg.exercise.springcloud.cloud_service_consumer.service.FeignServiceHi;

/**
 * Created by yingdg on 2017/10/23.
 */
@RestController
public class DemoServiceConsumerController {
    @Autowired
    private DemoServiceConsumer demoServiceConsumer;
    @Autowired
    private FeignServiceHi feignService;

    @GetMapping("/consumer/{name}")
    public String hiService(@PathVariable String name) {
        return demoServiceConsumer.hiService(name);
    }

    @GetMapping(value = "/consumer/hi")
    public String sayHi(@RequestParam String name) {
        return feignService.sayHi(name);
    }

}
