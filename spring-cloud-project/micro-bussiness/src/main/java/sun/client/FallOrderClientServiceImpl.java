package sun.client;

import common.entity.RestfulResult;
import common.entity.ServiceInfo;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;

/**
 * @author ljw
 * @date 2020-09-24 10:07
 */
@Component
public class FallOrderClientServiceImpl implements  OrderClientService {
    @Override
    public RestfulResult orderServiceUse(ServiceInfo serviceInfo) {
        RestfulResult restfulResult =new RestfulResult();
        restfulResult.setResult("fall");
        restfulResult.setData("调用OrderService服务失败");
        return  restfulResult;
    }
}
