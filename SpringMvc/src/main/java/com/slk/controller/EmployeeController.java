package com.slk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.slk.beans.Employee;
import com.slk.repository.EmployeeRepository;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeRepository repository;

	@RequestMapping(value = "/get")
	public ModelAndView getAllEmployees() {
		List<Employee> emp = repository.findEmployee();
		ModelAndView mv = new ModelAndView("success", "model", emp);
		return mv;
	}

	@RequestMapping(value = "/login")
	public ModelAndView getLoginPage() {
		ModelAndView mv = new ModelAndView("index");
		return mv;
	}

	@RequestMapping(value = "/check")
	public ModelAndView checkLoginCredentials(@RequestParam("userName") String userName,
			@RequestParam("password") String password) {
		ModelAndView mv = null;
		List<Employee> employee = repository.findEmployee();
		if (userName.equals("java") && password.equals("java")) {
			mv = new ModelAndView("success", "model", employee);
			return mv;
		} else {
			mv = new ModelAndView("index");
			System.out.println("Login Failed:::");
			return mv;
		}
	}

	@RequestMapping(value = "/saveEmployee", method = RequestMethod.POST)
	public String addEmployee(@RequestParam("empId") Integer empId, @RequestParam("empName") String empName,
			@RequestParam("empAddr") String empAddr) {
		Employee emp = new Employee();
		emp.setEmpId(empId);
		emp.setEmpName(empName);
		emp.setEmpAddr(empAddr);
		repository.addEmployee(emp);
		return "successful";
	}
}
