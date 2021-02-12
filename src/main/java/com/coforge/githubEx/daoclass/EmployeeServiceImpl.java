package com.coforge.githubEx.daoclass;

public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeDaoImpl ed=null;
	
	public EmployeeServiceImpl()
	{
		ed=new EmployeeDaoImpl();
	}

	public void addEmployee() {
		// TODO Auto-generated method stub
	ed.addEmployee();
	}

	public void displayEmployee() {
		// TODO Auto-generated method stub
	ed.displayEmployee();
	}



}
