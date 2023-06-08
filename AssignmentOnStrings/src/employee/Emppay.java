//Code by:Sharda Patil
package employee;

import java.util.Scanner;

public class Emppay {

	public static void main(String[] args) {
		// Create another java file Emppay.java. Create an object e to call the methods to perform and print values.
		
		Scanner sc = new Scanner(System.in);	
		Emp e1 = new Emp();
		
		System.out.println("Enter name : ");
		e1.setName(sc.nextLine());
		
		System.out.println("Enter category : ");
		e1.setCategory(sc.nextLine());
		
		System.out.println("Enter id : ");
		e1.setEmpid(Integer.parseInt(sc.nextLine()));
		
		System.out.println("Enter basic pay : ");
		e1.setBpay(Double.parseDouble(sc.nextLine()));
		
		e1.Calculation(e1.getBpay());
		e1.Show();		
	}
}
