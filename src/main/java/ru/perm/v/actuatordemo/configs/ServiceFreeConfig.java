package ru.perm.v.actuatordemo.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.perm.v.actuatordemo.services.IServiceForFree;
import ru.perm.v.actuatordemo.services.ServiceForFree;

@Configuration
public class ServiceFreeConfig {
    @Bean
    public IServiceForFree serviceForFree() {
        return new ServiceForFree();
    }
}
