package com.svs.springbootswagger.consumer;

import com.swagger.client.codegen.rest.api.EmployeeProfileControllerApi;
import com.swagger.client.codegen.rest.invoker.ApiClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExampleConfig {

    @Value("${employee.profiles.host.uri")
    private String host;

    @Bean
    public ApiClient apiClient(){
        return new ApiClient().setBasePath(host);
    }

    @Bean
    public EmployeeProfileControllerApi employeeProfileControllerApi(){
        return new EmployeeProfileControllerApi(apiClient());
    }
}
