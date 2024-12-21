package vn.test.hub.auth.worker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {
        "vn.test.hub.auth.worker",
        "vn.test.hub.auth.business",
        "vn.test.hub.auth.infrastructure"
})
public class AuthServiceWorker {

    public static void main(String[] args) {
        SpringApplication.run(AuthServiceWorker.class, args);
    }

}