package com.bridgelabz;
import java.util.Scanner;
import java.util.regex.Pattern;
public class AddressBook{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("*****WELCOME TO ADDRESS BOOK***");
		while (true)
		{
			String firstname=null,lastname=null,mobnumber,address="null",state="null",zip="null";
			int choice;
			String firstname1="^[?=[A-Z]{1}[A-Za-z]{3,}";
			String lastname1="^[A-Za-z]{3,}";
			String mobnumber1="^[0-9]{10}";
			String pincode1="^[0-9]{6}";
			Scanner sc= new Scanner(System.in);
			
			System.out.println("enter the choice 1.display\n 2.create\n 3.delete\n");
			choice=sc.nextInt();
			if(choice==1) {
		
				
			System.out.println("first name should have atleast capital letter and atleast 3 character\n");
			firstname=sc.next();
			Pattern pat1=Pattern.compile(firstname1);
			Matcher match1=pat1.matcher(firstname);
			if(match1.matches())
				System.out.printf("validated" +firstname);
			else
				System.out.printf("not validated" +firstname);
			System.out.println("Last name should have atleast 3 charcter\n")
			lastname=sc.next();
			Pattern pat2=Pattern.compile(lastname1);
			Matcher match2=pat2.matcher(lastname);
			if(match2.matches())
				System.out.printf("validated" +lastname);
			else
				System.out.printf("not validated" +lastname);
			System.out.println("enter the address like state,zip code");
			address=sc.next();
			
				
			}
			
			