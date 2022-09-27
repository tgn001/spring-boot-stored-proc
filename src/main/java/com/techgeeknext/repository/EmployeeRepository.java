package com.techgeeknext.repository;

import com.techgeeknext.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    //    @Procedure(procedureName = "get_employees")
    //     List<Employee> getAllEmployees();

    @Query(nativeQuery = true, value = "call get_employees")
    List<Employee> getAllEmployees();

    @Query(nativeQuery = true, value = "call get_employee_id(:emp_id)")
    Employee getEmployeeById(@Param("emp_id") Long emp_id);

    @Transactional
    @Modifying
    @Query(nativeQuery = true, value = "call delete_emp_id(:emp_id)")
    void deleteEmployeeById(@Param("emp_id") Long emp_id);

}
