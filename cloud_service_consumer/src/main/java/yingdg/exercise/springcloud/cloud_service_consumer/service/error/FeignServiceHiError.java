package yingdg.exercise.springcloud.cloud_service_consumer.service.error;

import org.springframework.stereotype.Service;
import yingdg.exercise.springcloud.cloud_service_consumer.service.FeignServiceHi;

/**
 * Created by yingdg on 2017/10/24.
 */
@Service
public class FeignServiceHiError implements FeignServiceHi {
    @Override
    public String sayHi(String name) {
        return "sorry " + name;
    }
}
