package ru.joor.workers.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.joor.workers.controller.dto.EmployeeDto;
import ru.joor.workers.service.EmployeeService;

@RestController
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    @PostMapping("/employee")
    public EmployeeDto postEmployee(@RequestBody EmployeeDto employeeDto) {
        return employeeService.addEmployee(employeeDto);
    }

    @GetMapping("/employee/{id}")
    public EmployeeDto getEmployee(@PathVariable String id) {
        return employeeService.getEmployeeById(id);
    }
}
