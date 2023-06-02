package com.qqinshaowu.admin.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * swagger文档配置
 *
 * @author: qqinshaowu
 * @since: 1.0.0
 */
@Configuration
public class QqinshaowuAdminSwaggerConfig {

    @Bean
    public OpenAPI springShopOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("项目平台接口文档")
                        .description("接口描述")
                        .version("2.0.0"))
                .externalDocs(new ExternalDocumentation().description("")
                        .url(""));
    }


    @Bean
    public GroupedOpenApi adminApi() {
        return GroupedOpenApi.builder()
                .group("admin")
                .packagesToScan("com.qqinshaowu")
                .build();
    }

}
