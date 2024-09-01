class Person{
    private String name;
    private int age;
    
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    public void displayName(){
        System.out.println("Name: "+name);
    }
    
     public void displayAge(){
        System.out.println("Age: "+age);
    }
}
public class Main
{
	public static void main(String[] args) {
	    Person p = new Person("Pragya", 20);
	    p.displayName();
	    p.displayAge();
	}
}
