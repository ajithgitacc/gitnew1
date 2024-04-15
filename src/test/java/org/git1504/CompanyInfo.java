package org.git1504;

public class CompanyInfo {
	private void companyName() {
		System.out.println("Company Name:siva agro services");
	}
	private void companyId() {
		System.out.println("Company Id:47581");
	}
	private void companyAddress() {
		System.out.println("Company Address:7/54,bharathi nagar,salem");
	}
	public static void main(String[] args) {
		CompanyInfo c= new CompanyInfo();
		c.companyAddress();
		c.companyId();
		c.companyName();
	}
}
