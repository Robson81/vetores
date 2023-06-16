package poo;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entitites.Employees;

public class testetesteteste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many employees wish to cadaster: ");
		int n = sc.nextInt();
		System.out.println();

		List<Employees> employeesList = new ArrayList<>();

		for (int i = 1; i <=n; i++) {

			System.out.println("Employees #" + i + ": ");
			System.out.print("ID: ");
			int id = sc.nextInt();
			sc.nextLine();

			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();

			employeesList.add(new Employees(name, salary, id));
			System.out.println();

		}
		
		for (Employees employees : employeesList) {
			
		System.out.println(employees);
		}
		

		System.out.print("Enter the employee id to an increase salary: ");
		int idIncrease = sc.nextInt();
		System.out.println();

		Employees position = employeesList.stream().filter(x -> x.getId()==idIncrease).findFirst().orElse(null);
		
		if (position == null) {

			System.out.println("Do not exist the employee ID");
			System.out.println("List of Employees: ");
			for (Employees x : employeesList) {
				System.out.println(x);
			}
		
		}else
			System.out.print("Enter the percentage to increase: ");
		   // double percentage = sc.nextDouble();
		    for (int i = 1; i<=employeesList.size(); i++) {
		    
		    	System.out.println();
		    }	
		    
		    
		

		sc.close();

	}

}
