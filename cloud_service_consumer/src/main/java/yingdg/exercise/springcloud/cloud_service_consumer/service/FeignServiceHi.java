package yingdg.exercise.springcloud.cloud_service_consumer.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import yingdg.exercise.springcloud.cloud_service_consumer.service.error.FeignServiceHiError;

/**
 * Created by yingdg on 2017/10/23.
 */
@FeignClient(value = "service-hi", fallback = FeignServiceHiError.class)
public interface FeignServiceHi {
    /*
    非Resr接口
     */
    @RequestMapping(value = "/hi2", method = RequestMethod.GET)
    String sayHi(@RequestParam(value = "name") String name);
}
