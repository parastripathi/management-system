package com.training.managementsystem.services.impl;

import com.training.managementsystem.entity.Department;
import com.training.managementsystem.entity.Employee;
import com.training.managementsystem.repository.EmployeeRepository;
import com.training.managementsystem.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

}