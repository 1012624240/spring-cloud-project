package sun.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import common.entity.RestfulResult;
import common.entity.ServiceInfo;
import common.utils.CommUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletResponse;


/**
 * @author ljw
 * @date 2020-09-24 11:34
 */

@RestController
@RequestMapping("/ribbon")
public class RibbonController {

    @Autowired
    RestTemplate restTemplate;


    @RequestMapping("/ribbonTest")
    @HystrixCommand(fallbackMethod = "ribbonFallBack")
    public String ribbonTest(@RequestBody ServiceInfo serviceInfo){
        String url = "http://ordersService/service/rest";
        return restTemplate.postForObject(url,serviceInfo,String.class);
    }


    public String ribbonFallBack(@RequestBody ServiceInfo serviceInfo){
       return "调用orderService rest方法失败";
    }



}
