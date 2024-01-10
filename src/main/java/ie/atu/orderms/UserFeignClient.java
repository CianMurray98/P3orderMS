package ie.atu.orderms;

import org.apache.catalina.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "userms", url = "http://localhost:8082")
public interface UserFeignClient {

    @GetMapping("/user/{customerId}")
    User getUserByCustomerId(@PathVariable String customerId);

}