package com.slk.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import com.slk.beans.Employee;

@Repository
public class EmployeeRepository {

	public static final Map<Integer, Employee> mapper = new HashMap<Integer, Employee>();

	@PostConstruct
	public void initData() {
		Employee emp1 = new Employee();
		emp1.setEmpId(1);
		emp1.setEmpName("java");
		emp1.setEmpAddr("bangalore");
		mapper.put(1, emp1);

		Employee emp2 = new Employee();
		emp2.setEmpId(2);
		emp2.setEmpName("java");
		emp2.setEmpAddr("bangalore");
		mapper.put(2, emp2);
	}

	public List<Employee> findEmployee() {
		List<Employee> list = new ArrayList<Employee>();
		Employee value = null;
		for (Map.Entry<Integer, Employee> map : mapper.entrySet()) {
			value = map.getValue();
			list.add(value);
		}
		return list;
	}

	public void addEmployee(Employee emp) {
		mapper.put(3, emp);
	}

}
