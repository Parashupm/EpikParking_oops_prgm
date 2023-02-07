package com.oops.prgms;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FunctionalityClass {
	Scanner sc=new Scanner(System.in);
	
	
	public Vechicle checkIn()
	{
		Vechicle v1=null;
		 System.out.println("Enter Vechicle Number: ");
		 String vechicleno =sc.next();
		 
		 System.out.println("Enter Vechicle Type");
		 String vechicle_type=sc.next();
		 
		 System.out.println("Enter Vechicle Model");
		 String vechicle_model =sc.next();
		 
		 System.out.println("Enter Phone Number:");
	     long phno=sc.nextLong();
	     
	     System.out.println("Eneter customer Name:");
		 String customer_name=sc.next();
		 
		 System.out.println("Enter check in Time in (HH-MM-SS) in 24 hours  format");
		 String checkintime=sc.next();
		 
		 v1=new Vechicle();
		 v1.setVechicleno(vechicleno); 
		 v1.setVechicle_type(vechicle_type);
		 v1.setVechicle_model(vechicle_model);
		 v1.setPhno(phno);
		 v1.setCustomer_name(customer_name);
		 v1.setCheckintime(checkintime);
		 return v1;
	}
	
	public void displayParkingList(Vechicle v1)
	{
		
		
		System.out.println("Vechicle number: "+v1.getVechicleno());
		System.out.println("Vechicle type: "+ v1.getVechicle_type());
		System.out.println("Vechicle model: "+v1.getVechicle_model());
		System.out.println("Mobile number: "+ v1.getPhno());
		System.out.println("Customer Name: "+ v1.getCustomer_name());
		System.out.println("Customer CheckIn Time :"+ v1.getCheckintime());
		System.out.println("Customer CheckOut Time: "+ v1.getCheckOutTime());
		
		
	}
	
	public void searchVechicle(Vechicle v1)
	{
		
			System.out.println("Vechicle number: "+v1.getVechicleno());
			System.out.println("Vechicle type : "+ v1.getVechicle_type());
			System.out.println("Vechicle model : "+v1.getVechicle_model());
			System.out.println("Mobile number : "+ v1.getPhno());
			System.out.println("Customer Name : "+ v1.getCustomer_name());
			System.out.println("Customer CheckIn Time :"+ v1.getCheckintime());	
	
	}
	
	public void checkOut(Vechicle v1)
	{
		
		
	     System.out.println("Enter the Check out Time in (HH-MM-SS) format");
         String couttime=sc.next();
		
		String cintime=v1.getCheckintime();
		
		String c_inhour=cintime.substring(0,2);
		String c_inminute=cintime.substring(3,5);
		
		String c_outhour=couttime.substring(0,2);
		String c_outminute=couttime.substring(3,5);
		
		int hour=Integer.parseInt(c_outhour)-Integer.parseInt(c_inhour);
		int minute= Math.abs  (Integer.parseInt(c_outminute)-Integer.parseInt(c_inminute));
		
		int totaltime=(hour*60)+minute;
		int rate=10;
		int paid=0;
		while(totaltime>0)
		{
			totaltime=totaltime-30;
			paid=paid+rate;
		}
		System.out.println("Total paid Amount : "+ paid);
	}
}
