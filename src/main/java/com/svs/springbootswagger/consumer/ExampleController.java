package com.svs.springbootswagger.consumer;

import com.swagger.client.codegen.rest.api.EmployeeProfileControllerApi;
import com.swagger.client.codegen.rest.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("svc/v1/api/example")
@RestController
public class ExampleController {

    @Autowired
    EmployeeProfileControllerApi employeeProfileControllerApi;

    @GetMapping
    public Object getEmployeeApi(@RequestParam(name="name") String name){
        Employee employee = employeeProfileControllerApi.fetchEmployeeByNameUsingGET(name);
        return employee;
    }

}
