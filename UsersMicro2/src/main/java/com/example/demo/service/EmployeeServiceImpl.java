package com.example.demo.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repos.EmployeeRepository;
import com.example.demo.entities.Employee;
import com.example.demo.entities.Team;





@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Override
	public Employee saveEmployee(Employee e) {
		// TODO Auto-generated method stub
		return employeeRepository.save(e);
	}

	@Override
	public Employee updateEmployee(Employee e) {
		// TODO Auto-generated method stub
		return employeeRepository.save(e);
	}

	@Override
	public void deleteEmployee(Employee e) {
		 employeeRepository.delete(e);
	}

	@Override
	public List<Employee> findByTeam(Team team) {
		// TODO Auto-generated method stub
		return employeeRepository.findByTeam(team);
	}

	@Override
	public Employee getEmployee(Long id) {
		// TODO Auto-generated method stub
		return employeeRepository.findById(id).get();
	}

	@Override
	public void deleteEmployeeById(Long id) {
		employeeRepository.deleteById(id);
		
	}

	@Override
	public List<Employee> getAllEmployee() {
		return employeeRepository.findAll();
	}

	@Override
	public List<Employee> findByNom(String nom) {
		return employeeRepository.findByNom(nom);
	}

	@Override
	public List<Employee> findByNomContains(String nom) {
		return employeeRepository.findByNomContains(nom);
	}

	@Override
	public List<Employee> findByNomSalaire(String nom, Double salaire) {
		// TODO Auto-generated method stub
		return employeeRepository.findByNomSalaire(nom , salaire);
	}

	@Override
	public List<Employee> findByTeamIdTeam(Long id) {
		// TODO Auto-generated method stub
		return employeeRepository.findByTeamIdTeam(id);
	}

	@Override
	public List<Employee> trierEmployeesNomsSalaire() {
		// TODO Auto-generated method stub
		return employeeRepository.trierEmployeesNomsSalaire();
	}

	@Override
	public List<Employee> findByOrderByNomAsc() {
		// TODO Auto-generated method stub
		return employeeRepository.findByOrderByNomAsc();
	}
}
