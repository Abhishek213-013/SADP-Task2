import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int height, width, areaOfRectangle;

        // calculate the area of a rectangle
        System.out.print("Enter height and width: ");
        height = input.nextInt();
        width = input.nextInt();
        areaOfRectangle = height*width;

        System.out.println("The Area of Rectangle is: "+areaOfRectangle);

        // Creating objects of Person
        Person abhishek = new Person("Abhishek", 22, 5.12);
        System.out.println("Persons Name: "+abhishek.getName()+" Persons Age: "+abhishek.getAge()+" Persons Height: "+abhishek.getHeight());

        //creating object of a Student
        Student read = new Student("Read", 22, 5.11, 22, "2nd");
        System.out.println(read.getName()+" is a Student of Metropolitan University. He is in Software Engineering Department, at "+read.getBatch()+" batch. ID is: "+read.getId()+". Age is: "+read.getAge());
    }

}

class Person {
    private String name;
    private int age;
    private double height;

    Person(String name, int age, double height){
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public double getHeight(){
        return height;
    }

}

class Student extends Person {

    public int id;
    public String batch;

    Student(String name, int age, double height, int id, String batch) {
        super(name, age, height);
        this.id = id;
        this.batch = batch;
    }

    public void setBatch(String batch){
        this.batch = batch;
    }
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }

    public String getBatch(){
        return batch;
    }
}