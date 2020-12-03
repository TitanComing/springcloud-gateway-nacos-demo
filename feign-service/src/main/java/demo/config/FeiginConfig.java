package demo.config;

import feign.Logger;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;


/**
 * Create by peng on 2020/12/3.
 */
@Configurable
@EnableFeignClients
public class FeiginConfig {
    @Bean
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }
}
