package sun.controller;

import common.entity.RestfulResult;
import common.entity.ServiceInfo;
import common.utils.CommUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.client.OrderClientService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author ljw
 * @date 2020-09-24 10:26
 */

@RestController
@RequestMapping("bussiness")
public class BussinessController {

    @Autowired
    OrderClientService orderClientService;

    @RequestMapping("orderService")
    public void useOrderService(HttpServletRequest request , HttpServletResponse response , @RequestBody ServiceInfo serviceInfo){

        RestfulResult restfulResult = orderClientService.orderServiceUse(serviceInfo);

        CommUtils.printDataJason(response,restfulResult);

    }

}
