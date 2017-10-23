package yingdg.exercise.springcloud.cloud_service_consumer.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by yingdg on 2017/10/23.
 */
@FeignClient("service-hi")
public interface FeignServiceHi {
    /*
    非Resr接口
     */
    @RequestMapping(value = "/hi2", method = RequestMethod.GET)
    String sayHi(@RequestParam(value = "name") String name);
}
