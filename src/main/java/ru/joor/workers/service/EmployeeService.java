package ru.joor.workers.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.joor.workers.controller.dto.EmployeeDto;
import ru.joor.workers.mapper.EmployeeMapper;
import ru.joor.workers.model.entity.EmployeeEntity;
import ru.joor.workers.model.repository.EmployeeRepository;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final EmployeeMapper employeeMapper;

    public EmployeeDto addEmployee(EmployeeDto employeeDto) {
        EmployeeEntity employeeEntity = employeeMapper.employeeDtoToEmployeeEntity(employeeDto);
        employeeRepository.save(employeeEntity);
        return employeeDto;
    }

    public EmployeeDto getEmployeeById(String id) {
        EmployeeEntity employeeEntity = employeeRepository.getById(UUID.fromString(id));
        return employeeMapper.employeeEntityToEmployeeDto(employeeEntity);
    }
}
