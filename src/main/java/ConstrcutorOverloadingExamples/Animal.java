package ConstrcutorOverloadingExamples;

public class Animal
{
	String type;
    int legs;
    int age;





Animal(int legs)
{
	this.legs = legs;
}

Animal(String type)
{
	this.type = type;
}

Animal(String type, int legs, int age)
{
	this.type = type;
	this.legs = legs;
	this.age = age;	
}

void diaplayDetails()
{
	System.out.println("The animal type is : "+type);
	System.out.println("The animal legs is : "+legs);
	System.out.println("The animal age is : "+age);
}
public static void main(String[] args) 
     {
	// TODO Auto-generated method stub
	
	Animal a1 = new Animal("Lion", 4, 5);
	Animal a2 = new Animal("Man", 26, 2);
	Animal a3 = new Animal("Cow", 4, 10);
	Animal a4 = new Animal("deer");
	Animal a5 = new Animal(4);
	a1.diaplayDetails();
	a2.diaplayDetails();
	a3.diaplayDetails();
	a4.diaplayDetails();
	a5.diaplayDetails();
}

}
