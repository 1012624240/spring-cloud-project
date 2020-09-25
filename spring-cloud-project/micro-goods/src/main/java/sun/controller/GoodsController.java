package sun.controller;

import common.entity.RestfulResult;
import common.entity.ServiceInfo;
import common.utils.CommUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author ljw
 * @date 2020-09-23 14:21
 */

@RestController
@RequestMapping("/service")
public class GoodsController {

    @RequestMapping("/hello")
    public void hello(HttpServletRequest request, HttpServletResponse response, @RequestBody ServiceInfo serviceInfo){

        RestfulResult restfulResult = new RestfulResult();

        try {
            restfulResult.setData("goodsService:Welcome " + serviceInfo.getName() + "!");

        } catch (Exception e) {
            e.printStackTrace();
        }

        CommUtils.printDataJason(response, restfulResult);
    }

    @RequestMapping(value = "rest")
    public String rest(@RequestBody ServiceInfo serviceInfo){

        return "rest from goodsService:Welcome " + serviceInfo.getName() + " !";
    }

}
