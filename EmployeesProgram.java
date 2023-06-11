package poo;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entitites.Employees;

public class EmployeesProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many employees wish to cadaster: ");
		int n = sc.nextInt();
		System.out.println();

		Employees[] emp = new Employees[n];
		List<Integer> idList = new ArrayList<>();

		for (int i = 0; i < emp.length; i++) {

			System.out.println("Employees #" + (i + 1) + ":");
			System.out.print("ID: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			emp[i] = new Employees(name, salary, id);
			System.out.println();
			
			
		}
		
		for (Employees integer : emp) {
			
			idList.add(integer.getId());
		}
		
		System.out.print("Enter the employee id to an increase salary: ");
		int idIncrease = sc.nextInt();
		System.out.println();
		
		int position  = idList.indexOf(idIncrease);
		if (position==-1) {
			
			System.out.println("Do not exist the employee ID");
			System.out.println("List of Employees: ");
			for(Employees x : emp) {
				System.out.println(x);
			}
		}else {
			System.out.print("Enter the percentage: ");
			int percentage = sc.nextInt();	
			System.out.println();
			
			System.out.println("List of Employees: ");
			for (int i = 0 ; i< emp.length; i++) {
				
				if(i==position) {
					
					emp[i].increaseSalary(percentage);
				}
				System.out.println(emp[i]);
			}
		}
		

		sc.close();
	}

}
