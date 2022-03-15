package Entity;

public class Employee {
	
	private int cod;
	private String name;
	private double salary;
	public Employee(int cod, String name, double salary) {
		this.cod = cod;
		this.name = name;
		this.salary = salary;
	}
	public int getCod() {
		return cod;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	@Override
	public String toString() {
		return "Employee [cod=" + cod + ", name=" + name + ", salary=" + salary + "]";
	}
	
	

}
