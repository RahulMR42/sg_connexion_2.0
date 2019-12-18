import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class insertToFile{
	String fileurl = "D:/test/profiledetails.txt";
	public void insert(String name, String mail, String organization, String skill) throws IOException{
		FileWriter wr = new FileWriter(fileurl);
		String result = name+ " " + mail+ " " +organization+ " " + skill;
		wr.write(result);
		wr.close();
		System.out.println("Writting finished");
	}
//	public void search(String name){
//		Filereader fr = new FileReader(fileurl);
//	}
	
//	public String search(String name){
//		//becasue of time concentrate here are the logic about how could we fethch records
//		we can use overloaded version of this method example if we want to serch by name we can pass name
	//if we want to search using the skill we culd pass
//	we later need to open the file using the the use bufferreader to read lines in file
	//split the line using space
	//compare each word to the argument and add if condition if peresent the return the line
	//we can search file using the method equals and 
//	we can return the output and print it
//	}
}
public class Profiles {
	public static void main(String[] args) throws IOException {
		String name, organization, mail, skill;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name");
		name = sc.nextLine();
		System.out.println("Enter email");
		mail = sc.nextLine();
		System.out.println("Enter Organization");
		organization = sc.nextLine();
		System.out.println("Enter Skill");
		skill = sc.nextLine();
		insertToFile ref= new insertToFile();
		ref.insert(name, mail, organization, skill);
		
	}
}
