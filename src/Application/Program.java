package Application;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import Entity.Employee;

public class Program {
	public static void main(String[] args) {
		List<Employee> emp = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		
		int ch;
		do {
			System.out.println("1.INSERT");
			System.out.println("2.DISPLAY");
			System.out.println("3.SEARCH");
			System.out.println("4.DELETE");
			System.out.println("5.UPDATE");
			System.out.println("Enter your choice: ");
			ch = sc.nextInt();
			switch (ch) {
				case 1:
					System.out.print("Enter Cod: ");
					int cod = sc.nextInt();
					System.out.print("Enter Name: ");
					String name = sc1.nextLine();
					System.out.print("Enter Salary:");
					double salary = sc.nextDouble();
				
					emp.add(new Employee(cod, name, salary));	
				break;
				
				case 2:
					System.out.println("--------------------------");
					for (Employee emp1 : emp) {
						System.out.println(emp1);
					}
					System.out.println("--------------------------");
				break;
				case 3:
					Boolean found = false;
					System.out.println("Enter Cod to search: ");
					cod = sc.nextInt();
					System.out.println("--------------------------");
					Iterator<Employee> i = emp.iterator(); 
					while (i.hasNext()) {
						Employee e = i.next();
						if (e.getCod() == cod) {
							System.out.println(e);
							found = true;
						}
						if (!found) {
							System.out.println("Record not found!");
						}
					}
					System.out.println("--------------------------");
				break;
				case 4:
					found = false;
					System.out.println("Enter Cod to delete: ");
					cod = sc.nextInt();
					System.out.println("--------------------------");
					i = emp.iterator(); 
					while (i.hasNext()) {
						Employee e = i.next();
						if (e.getCod() == cod) {
							i.remove();
							found = true;
						}
						if (!found) {
							System.out.println("Record not found!");
						}else {
							System.out.println("Record is deleted successfully!");
						}
					}
					System.out.println("--------------------------");
				break;
				case 5:
					found = false;
					System.out.println("Enter Cod to update: ");
					cod = sc.nextInt();
					System.out.println("--------------------------");
					ListIterator<Employee> li = emp.listIterator(); 
					while (li.hasNext()) {
						Employee e = li.next();
						if (e.getCod() == cod) {
							System.out.println("Enter new name");
							name = sc1.nextLine();
							
							System.out.println("Enter new Salary");
							salary = sc.nextDouble();
							
							li.set(new Employee(cod, name, salary));
							found = true;
						}
						if (!found) {
							System.out.println("Record not found!");
						}else {
							System.out.println("Record is update successfully!");
						}
					}
					System.out.println("--------------------------");
				break;
			}
		}while(ch!=0);
	}

}
