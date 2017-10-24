package yingdg.exercise.springcloud.cloud_service_provider.controller;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * Created by yingdg on 2017/10/23.
 * 注册接口
 */
@RestController
public class DemoServiceProviderController {
    private static final Logger LOG = Logger.getLogger(DemoServiceProviderController.class);
    @Value("${server.port}")
    private String port;

    /*
    SpringMVC实现服务接口，建议rest风格
     */
    @RequestMapping("/hi/{name}")
    public String home(@PathVariable String name) {
        return "hi " + name + ",i am from port:" + port;
    }

    /*
    非rest风格
     */
    @GetMapping("/hi2")
    public String index(@RequestParam String name) {
        return "hi, you input " + name + " from port" + port;
    }

    @RequestMapping(value = "/hi3", method = RequestMethod.GET)
    public String info() {
        LOG.log(Level.INFO, "calling trace service-hi ");
        return "i'm service-hi";
    }

}
