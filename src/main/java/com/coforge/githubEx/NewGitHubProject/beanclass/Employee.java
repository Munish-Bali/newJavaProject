package com.coforge.githubEx.NewGitHubProject.beanclass;

public class Employee {

	private int empid;
	private String empName;
	private long empPhone;
	private String empEmail;
	
	public Employee()
	{
		
	}
	
    

	public Employee(int empid, String empName, long empPhone, String empEmail) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.empPhone = empPhone;
		this.empEmail = empEmail;
	}



	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public long getEmpPhone() {
		return empPhone;
	}

	public void setEmpPhone(long empPhone) {
		this.empPhone = empPhone;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((empEmail == null) ? 0 : empEmail.hashCode());
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		result = prime * result + (int) (empPhone ^ (empPhone >>> 32));
		result = prime * result + empid;
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empEmail == null) {
			if (other.empEmail != null)
				return false;
		} else if (!empEmail.equals(other.empEmail))
			return false;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		if (empPhone != other.empPhone)
			return false;
		if (empid != other.empid)
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empName=" + empName + ", empPhone=" + empPhone + ", empEmail=" + empEmail
				+ "]";
	}
	
	
}
