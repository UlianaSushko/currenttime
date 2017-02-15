package peopleData;

import java.util.Scanner;
 
public class Scanner {
 
    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = in.nextLine();
		System.out.print("Enter surname: ");
        String surname = in.nextLine();
		System.out.print("Enter sex: ");
        String sex = in.nextLine();
        System.out.print("Enter age: ");
        int age = in.nextInt();
        System.out.println( name, surname, sex , age);
    }   
}