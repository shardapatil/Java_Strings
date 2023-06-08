//Code by:Sharda Patil
package employee;

import java.util.Scanner;

public class Emp {

	//Write a Java program to perform employee payroll processing using packages. 
	//In the java file, Emp.java creates a package employee and creates a class Emp.
	//Declare the variables name,empid, category, bpay, hra, da, npay, pf, grosspay, incometax, and allowance. 
	//Calculate the values in methods. 
	
	private String name,category;
	private int empid;
	private double bpay,hra,da,npay,pf,grosspay,incometax,allowance;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public double getBpay() {
		return bpay;
	}
	public void setBpay(double bpay) {
		this.bpay = bpay;
	}
	public double getHra() {
		return hra;
	}
	public void setHra(double hra) {
		this.hra = hra;
	}
	public double getDa() {
		return da;
	}
	public void setDa(double da) {
		this.da = da;
	}
	public double getNpay() {
		return npay;
	}
	public void setNpay(double npay) {
		this.npay = npay;
	}
	public double getPf() {
		return pf;
	}
	public void setPf(double pf) {
		this.pf = pf;
	}
	public double getGrosspay() {
		return grosspay;
	}
	public void setGrosspay(double grosspay) {
		this.grosspay = grosspay;
	}
	public double getIncometax() {
		return incometax;
	}
	public void setIncometax(double incometax) {
		this.incometax = incometax;
	}
	public double getAllowance() {
		return allowance;
	}
	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}
	
	public void Calculation(double bpay)
	{
		this.da = bpay*0.05;
		this.hra = bpay*0.09;
		this.pf = bpay*0.11;
		this.allowance = bpay*0.10;
		this.grosspay = bpay+da+hra+allowance-pf;
		this.incometax = 0.75*grosspay;
		this.npay = grosspay- incometax;
	}
	
	public void Show() 
	{
		System.out.println("---------- Employee Details ---------");
		System.out.println("Name:" + name);
		System.out.println("Empid:" + empid);
		System.out.println("Category:" + category);
		System.out.println("basic pay:" + bpay);
		System.out.println("da:" + da);
		System.out.println("hra:" + hra);
		System.out.println("pf:" + pf);
		System.out.println("allowance:" + allowance);
		System.out.println("grosspay:" + grosspay);
		System.out.println("Incometax:" + incometax);
		System.out.println("net pay:" + npay);
	}
}
