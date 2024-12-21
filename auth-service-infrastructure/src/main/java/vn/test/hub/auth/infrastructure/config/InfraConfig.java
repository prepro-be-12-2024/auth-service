package vn.test.hub.auth.infrastructure.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan(basePackages = "vn.test.hub.auth.infrastructure.datasource.entity")
@EnableJpaRepositories(basePackages = "vn.test.hub.auth.infrastructure.datasource.repo")
public class InfraConfig {
}
