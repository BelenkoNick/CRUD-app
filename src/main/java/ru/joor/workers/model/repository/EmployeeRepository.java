package ru.joor.workers.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import ru.joor.workers.model.entity.EmployeeEntity;

import java.util.UUID;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, UUID>, JpaSpecificationExecutor<EmployeeEntity> {

    EmployeeEntity getById(String id);
}
