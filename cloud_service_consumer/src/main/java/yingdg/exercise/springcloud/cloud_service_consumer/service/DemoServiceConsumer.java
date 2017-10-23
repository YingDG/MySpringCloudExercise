package yingdg.exercise.springcloud.cloud_service_consumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by yingdg on 2017/10/23.
 */
@Service
public class DemoServiceConsumer {
    @Autowired
    private RestTemplate restTemplate;

    /*
    Rest接口
     */
    public String hiService(String name) {
        return restTemplate.getForObject("http://service-hi/hi/" + name, String.class);
    }

}
