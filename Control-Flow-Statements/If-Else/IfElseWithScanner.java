// write a java program to check if the person is eligible for marriage or not
import java.util.*;
class IfElseWithScanner {
  public static void main (String [] args) {
	  
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.print("Please Enter your Gender : (m/f)");
      char gender = sc.next().charAt(0);
	  
	  System.out.print("Please Enter your age : ");
	  int age = sc.nextInt();
	  
	  if(age>=21 && gender =='m')
	  {
		System.out.println("eligible for marriage");
	  } else if (age >= 18 && gender == 'f')
	  {
		 System.out.println("eligible for marriage");
	  } else if (age<21 && gender =='m' || gender < 18 && gender == 'f' )
	  {
		  System.out.println("Not eligible for marriage");
	  
		
	  } else {
		System.out.println("Invalid Input");
	  }
  }
}