package com.codegnan.collections;

import java.util.Objects;

public class Employee1 {
	private int id;
	private String name;
	private double salary;
	private String addr;
	//constructors,getters setters,tostring,hashcode equals
	public Employee1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee1(int id, String name, double salary, String addr) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.addr = addr;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "Employeee [id=" + id + ", name=" + name + ", salary=" + salary + ", addr=" + addr + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(addr, id, name, salary);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee1 other = (Employee1) obj;
		return Objects.equals(addr, other.addr) && id == other.id && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}
	

}
