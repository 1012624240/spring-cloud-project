package sun.client;

import common.entity.RestfulResult;
import common.entity.ServiceInfo;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
@FeignClient(value = "ordersService" , fallback = FallOrderClientServiceImpl.class)
public interface OrderClientService {

    @RequestMapping("/service/hello")
    RestfulResult orderServiceUse(ServiceInfo serviceInfo);

}
