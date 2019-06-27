package com.mohan.repository;

import javax.websocket.server.PathParam;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mohan.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	@Query(value="select emp_id,emp_name,emp_sal from employee where emp_id=:id",nativeQuery=true)
	public Employee getEmployeeByEmpId(@PathParam("id")int id);

	public Employee getEmployeeByEmpName(String name);

}
