package ru.joor.workers.mapper;

import org.mapstruct.Mapper;
import ru.joor.workers.controller.dto.EmployeeDto;
import ru.joor.workers.model.entity.EmployeeEntity;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {

    EmployeeEntity employeeDtoToEmployeeEntity(EmployeeDto employeeDto);

    EmployeeDto employeeEntityToEmployeeDto(EmployeeEntity employeeEntity);
}
