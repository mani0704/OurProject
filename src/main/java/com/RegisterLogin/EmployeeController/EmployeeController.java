package com.RegisterLogin.EmployeeController;

import com.RegisterLogin.Dto.EmployeeDTO;

import com.RegisterLogin.Dto.LoginDTO;
import com.RegisterLogin.Service.EmployeeService;
import com.RegisterLogin.response.LoginResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin
@RequestMapping("api/v1/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;


    @PostMapping(path = "/save")
    public String saveEmployee(@RequestBody EmployeeDTO employeeDTO) {
        String id = employeeService.addEmployee(employeeDTO);
        return id;
    }
    @PostMapping(path="/login")
    public  ResponseEntity<?> loginEmployee(@RequestBody LoginDTO loginDTO) {
        LoginResponse loginResponse=employeeService.loginEmployee(loginDTO);
        return ResponseEntity.ok(loginResponse);
    }


}
