package com.bridgelabz.oops_program;

public class Test{

	public static void main(String[] args) {
		demo d =new demo();
		d.setEmpNo(201);
		d.setName("ajju");
		d.setSalary(20000);
		String jsonEmployee=JsonUtility.convertJavaToJson(d);
		System.out.println(jsonEmployee);
		
		System.out.println("================");
		
		demo emp1=JsonUtility.convertJsonToJava(jsonEmployee,demo.class);
		System.out.println(emp1.getEmpNo()+" "+emp1.getName()+" "+emp1.getSalary());
		
	}

}
