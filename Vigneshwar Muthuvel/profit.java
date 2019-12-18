
package person;

import java.util.Scanner;
class ID{
	Scanner sc=new Scanner(System.in);
	int a;
	String b;
	String c;
	String d;
	String e;
	void IDname(){
		//int a;
		System.out.println("welcome person profit");
		System.out.println(" ");
		System.out.println("enter the ID");
		//Scanner sc=null;
		a=sc.nextInt();
	}

	void name(){
		//String b;
		System.out.println("enter the name");
		//Scanner sc=null;
		b=sc.next();

	}

	void email2(){
		//String c;
		System.out.println("enter the email");
		//Scanner sc=null;
		c=sc.next();

	}

	void current(){
		//String d;
		System.out.println("enter the current_employee");
		//Scanner sc=null;
		d=sc.next();
	}


	void skills1(){
		//String ce;
		System.out.println("enter the Skill");
		//Scanner sc=null;
		e=sc.next();
	}
	void display (){
		System.out.println("Display the deatils person");
		System.out.println("ID                :"+a);
		System.out.println("Name              :"+b);
		System.out.println("Email             :"+c);
		System.out.println("Current employee  :"+d);
		System.out.println("SKill             :"+e);
		
	}
	
	
}
public class profit extends ID  {

	public static void main(String[] args) {
		profit pc= new profit();
		pc.IDname();
		pc.name();
		pc.email2();
		pc.current();
		pc.skills1();
		pc.display();


	}
	
}
