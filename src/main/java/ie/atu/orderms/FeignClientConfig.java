package ie.atu.orderms;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "ie.atu.orderms")
public class FeignClientConfig {
}