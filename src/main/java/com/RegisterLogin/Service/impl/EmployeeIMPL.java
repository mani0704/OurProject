package com.RegisterLogin.Service.impl;

import com.RegisterLogin.Dto.EmployeeDTO;
import com.RegisterLogin.Dto.LoginDTO;
import com.RegisterLogin.Entity.Employee;
import com.RegisterLogin.Repo.EmployeeRepo;
import com.RegisterLogin.Service.EmployeeService;
import com.RegisterLogin.response.LoginResponse;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeIMPL implements EmployeeService {


    @Autowired
    private EmployeeRepo employeeRepo;

//     private PasswordEncoder passwordEncoder;

    @Override
    public String addEmployee(EmployeeDTO employeeDTO) {
        Employee employee = new Employee(
                employeeDTO.getEmployeeid(),
                employeeDTO.getEmployeename(),
                employeeDTO.getEmail(),
                employeeDTO.getPassword()
        );
        employeeRepo.save(employee);
        return employee.getEmployeename();


    }

    @Override
    public LoginResponse loginEmployee(LoginDTO loginDTO) {
        String msg = "";
        Employee employee = employeeRepo.findByEmail(loginDTO.getEmail());
        if (employee != null) {
            String password = loginDTO.getPassword();

            if (password.equals(employee.getPassword())) {
                return new LoginResponse("Login sucess", true);
            } else {
                return new LoginResponse("Wrong Password", false);

            }

        }
        else {
            return new LoginResponse("Email not exist",false);
        }


    }
}
