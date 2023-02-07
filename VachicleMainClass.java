package com.oops.prgms;
import java.util.ArrayList;
import java.util.Scanner;

public class VachicleMainClass {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		FunctionalityClass fc=new FunctionalityClass();
		
		
		
		ArrayList<Vechicle> l1=new ArrayList<Vechicle>();
		while(true)
		{
			System.out.println("Welcome Epik valet parking System");
			System.out.println("1: CheckIn");
			System.out.println("2: CheckOut");
			System.out.println("3: Search");
			System.out.println("4: Dispaly");
			System.out.println("5: Exit");
			System.out.println("Enter your choice");
			int choice=sc.nextInt();
			
			switch(choice)
			{
			case 1: 
				   Vechicle v1=fc.checkIn();
				   l1.add(v1);
				  
				break;
			case 2: 
				   System.out.println("Enter the Vechicle number");
				   String vno1=sc.next();
				   for(Vechicle l:l1)
					{
						Vechicle v=(Vechicle)l;
						if(v.getVechicleno().equals(vno1))
						{
							fc.checkOut(v);;
						}
						else
						{
							System.out.println("Vechicle not found");
						}
						
					}
				break;
			case 3: 
				System.out.println("Enter Vehicle number to be search");
				String vno=sc.next();
				for(Vechicle l:l1)
				{
					Vechicle v=(Vechicle)l;
					if(v.getVechicleno().equals(vno))
					{
						fc.searchVechicle(v);
					}
					else
					{
						System.out.println("Vechicle not found");
					}
					
				}
				break;
			case 4: 
			
				  System.out.println("----------------------------------");
				
				      for(Vechicle v:l1)
				      {  
					  
					      fc.displayParkingList(v);
					      System.out.println("----------------------------------");
					  }

				break;
			case 5: 
				System.exit(0);
				break;
			
			}

			
		}
		
	}

}
