package org.company;

public class CompanyInfo {
public void companyName() {
System.out.println("TCS");
}
public void companyId() {
System.out.println("123");
}
public void companyAddress() {
System.out.println("no1,thirumalai nagar,perungudi");
}
public static void main(String[] args) {
	CompanyInfo c = new  CompanyInfo();
	c.companyName();
	c.companyId();
	c.companyAddress();
}
}
