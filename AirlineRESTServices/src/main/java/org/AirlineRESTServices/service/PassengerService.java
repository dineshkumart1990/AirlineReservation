package org.AirlineRESTServices.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import org.AirlineRESTServices.model.*;


@Service
public class PassengerService {
	private final AtomicLong empIdGen = new AtomicLong();

	List<PassengerProfile> passengerInformations = new ArrayList<PassengerProfile>();

	public PassengerProfile getPassengerInfo(Integer PassengerID) {
		PassengerProfile profile = new PassengerProfile();
		profile.setProfileId(101);
		profile.setFirstName("Dinesh");
		profile.setLastName("Kumar");
		profile.setEmailId("Dinesh@gmail.com");
		profile.setTelephoneNo("9842752121");
		profile.setAddress("Texas");
		return profile;
	}

	public PassengerProfile savePassengerDetails(PassengerProfile profile) {
		//PassengerInfo.setEmpNo("" + empIdGen.incrementAndGet());
		//PassengerInfo.add(employee);
		return profile;
	}

/*	public PassengerService() {
		PassengerInformation employee = new PassengerInformation();
		employee.setEmpNo("1001");
		employee.setName("Gautham");
		employee.setAge(24);
		employee.setSalary(6000.00);
		employees.add(employee);

		Employee employee1 = new Employee();
		employee1.setEmpNo("1002");
		employee1.setName("Dinesh");
		employee1.setAge(26);
		employee1.setSalary(6400.00);
		employees.add(employee);
	}

	public Employee getEmployee(String empId) {

		for (Employee employee : employees) {
			if (employee.getEmpNo().equals(empId)) {
				return employee;
			}
		}
		return null;
	}

	public Employee saveEmployee(Employee employee) {

		employee.setEmpNo("" + empIdGen.incrementAndGet());
		employees.add(employee);
		return employee;
	}

	public Employee updateEmployee(Employee source) {
		Employee employee = getEmployee(source.getEmpNo());
		employee.setName(source.getName());
		employee.setAge(source.getAge());
		employee.setSalary(source.getSalary());

		return employee;
	}

	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return employees;
	}

	public String deleteEmployee(String empId) {

		for (Employee employee : employees) {
			if (employee.getEmpNo().equals(empId)) {
				employees.remove(employee);
				return empId;
			}
		}
		return null;
	}*/

}
