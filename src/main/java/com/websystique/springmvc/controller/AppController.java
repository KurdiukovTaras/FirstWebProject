package com.websystique.springmvc.controller;

import java.util.List;
import java.util.Locale;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.websystique.springmvc.model.Employee;
import com.websystique.springmvc.service.EmployeeService;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class AppController {

	@Autowired
	EmployeeService service;
	
	@Autowired
	MessageSource messageSource;


	@RequestMapping(value = { "/", "/list" }, method = RequestMethod.GET)
	public ModelAndView listOfUsers(@RequestParam(required = false) Integer page) {
		ModelAndView modelAndView = new ModelAndView("allemployees");
		List<Employee> employees = service.findAllEmployees();
		PagedListHolder<Employee> pagedListHolder = new PagedListHolder<Employee>(employees);
		pagedListHolder.setPageSize(10);
		modelAndView.addObject("maxPages", pagedListHolder.getPageCount());

		if(page==null || page < 1 || page > pagedListHolder.getPageCount())page=1;

		modelAndView.addObject("page", page);
		if(page == null || page < 1 || page > pagedListHolder.getPageCount()){
			pagedListHolder.setPage(0);
			modelAndView.addObject("employees", pagedListHolder.getPageList());
		}
		else if(page <= pagedListHolder.getPageCount()) {
			pagedListHolder.setPage(page-1);
			modelAndView.addObject("employees", pagedListHolder.getPageList());
		}

		return modelAndView;
	}




	@RequestMapping(value = { "/new" }, method = RequestMethod.GET)
	public String newEmployee(ModelMap model) {
		Employee employee = new Employee();
		model.addAttribute("employee", employee);
		model.addAttribute("edit", false);
		return "registration";
	}



	@RequestMapping(value = { "/new" }, method = RequestMethod.POST)
	public String saveEmployee(@Valid Employee employee, BindingResult result,
			ModelMap model) {

		if (result.hasErrors()) {
			return "registration";
		}
		
		service.saveEmployee(employee);

		model.addAttribute("success", "Student " + employee.getName() + " registered successfully");
		return "success";
	}

	@RequestMapping(value = { "/edit-{id}-employee" }, method = RequestMethod.GET)
	public String editEmployee(@PathVariable String id, ModelMap model) {
		Employee employee = service.findEmployeeById(Integer.parseInt(id));
		model.addAttribute("employee", employee);
		model.addAttribute("edit", true);
		return "registration";
	}

	@RequestMapping(value = { "/edit-{id}-employee" }, method = RequestMethod.POST)
	public String updateEmployee(@Valid Employee employee, BindingResult result,
			ModelMap model, @PathVariable String id) {

		if (result.hasErrors()) {
			return "registration";
		}

		service.updateEmployee(employee);

		model.addAttribute("success", "Student " + employee.getName()	+ " updated successfully");
		return "success";
	}

	@RequestMapping(value = { "/delete-{id}-employee" }, method = RequestMethod.GET)
	public String deleteEmployee(@PathVariable String id) {
		service.deleteEmployeeById(id);
		return "redirect:/list";
	}

	@RequestMapping(value = { "/search" }, method = RequestMethod.GET)
	public String searchEmployee(ModelMap model) {
		Employee employee = new Employee();
		model.addAttribute("employee", employee);
		model.addAttribute("edit", false);
		return "search";
	}

	@RequestMapping(value = { "/search" }, method = RequestMethod.POST)
	public String searchEmployee(Employee employee, BindingResult result,
								 ModelMap model) {
		System.out.println(employee.getId());

		model.addAttribute("success", "We find some student with such ID: "+service.findEmployeeById(employee.getId()).toString() );
		model.addAttribute("search", true);
		return "success";
	}

}



