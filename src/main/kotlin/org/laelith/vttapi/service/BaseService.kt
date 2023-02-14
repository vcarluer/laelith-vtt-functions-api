package org.laelith.vttapi.service

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class BaseService {
    @Bean
    fun info(): () -> String = { "Hello World!" }
}