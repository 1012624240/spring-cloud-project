package sun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author ljw
 * @date 2020-09-24 10:42
 */
@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
@ServletComponentScan
public class BussinessApplication {
    public static void main(String[] args) {
        SpringApplication.run(BussinessApplication.class,args);
    }
}
