package com.coforge.githubEx.daoclass;

import java.util.Scanner;

import com.coforge.githubEx.NewGitHubProject.beanclass.Employee;

public class EmployeeDaoImpl implements EmployeeDao{

	private Employee e=null;
	
	Scanner sc=new Scanner(System.in);

	public EmployeeDaoImpl() {
		e=new Employee();
	}

	public void addEmployee() {
		
		
		e.setEmpid(sc.nextInt());
		e.setEmpName(sc.next());
		e.setEmpPhone(sc.nextLong());
		e.setEmpEmail(sc.next());
	}

	public void displayEmployee() {
		// TODO Auto-generated method stub
		System.out.println(e.getEmpid());
		System.out.println(e.getEmpName());
		System.out.println(e.getEmpPhone());
		System.out.println(e.getEmpEmail());
	}

}
