package com.emti.emti_backend.global.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "EMTI API",
                version = "1.0",
                description = "EMTI API Docs"
        )
)
public class SwaggerConfig {
}
