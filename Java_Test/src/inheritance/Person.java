package inheritance;

public class Person {
    private String name;
    private int age;
    private String gender;

    // Default constructors
    public Person(){
        System.out.println("In person default constructor");
    }

    public Person(String name){
        System.out.println("In person 2nd default constructor. Name is set.");
    }

    // Name getter and setter
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    // Age getter and setter
    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    // Gender getter and setter
    public String getGender(){
        return gender;
    }

    public void setGender(String gender){
        this.gender = gender;
    }
}
