package com.coforge.githubEx.NewGitHubProject;

import java.util.Scanner;

import com.coforge.githubEx.daoclass.EmployeeServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    EmployeeServiceImpl esi=new EmployeeServiceImpl();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter 1 for Addemployee and 2 for display employee :");
    
    switch(sc.nextInt())
    {
    case 1:esi.addEmployee();
          
           
    case 2:esi.displayEmployee();
           break;
    
    }
    
    }
}
