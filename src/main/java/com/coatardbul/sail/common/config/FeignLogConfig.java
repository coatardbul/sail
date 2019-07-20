/**
 * Copyright  2019-2029 联通集团财务有限公司版权所有。
 */
package com.coatardbul.sail.common.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: suxiaolei
 * @date: 2019/6/25
 */

@Configuration
public class FeignLogConfig {
    @Bean
    public Logger.Level feignLoggerLevel() {
        return feign.Logger.Level.FULL;
    }
}
