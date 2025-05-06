package com.eureka.Service;



import com.eureka.Model.Employee;
import com.eureka.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

	@Override
	public List<Employee> getAllEmployees() {
		 return employeeRepository.findAll();
	}

	@Override
	public Employee getEmployeeById(int id) {
		 Optional<Employee> optional = employeeRepository.findById(id);
	        return optional.orElse(null);
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public void deleteEmployeeById(int id) {
		employeeRepository.deleteById(id);
		
	}

    
}

