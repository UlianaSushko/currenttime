package peopleData;

import java.io.*;
import java.util.*;
 
public class Person{

  private ArrayList<Person> list = new ArrayList<>();

    public String name;
    public String surname;
	public String sex;
    public int age;
     
    Person(String name, String surname, String sex, int age){
         
        this.name = name;
        this.surname = surname;
		this.sex = sex;
        this.age = age;
    }
     
    public void info(){
	    list.add(new Person(name, surname, sex, age));
        
    }   
}
