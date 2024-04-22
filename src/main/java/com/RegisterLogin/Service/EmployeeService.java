package com.RegisterLogin.Service;

import com.RegisterLogin.Dto.EmployeeDTO;
import com.RegisterLogin.Dto.LoginDTO;
import com.RegisterLogin.response.LoginResponse;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;



public interface EmployeeService {
    String addEmployee(EmployeeDTO employeeDTO);
    LoginResponse loginEmployee(LoginDTO loginDTO);

}


