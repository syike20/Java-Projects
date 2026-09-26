package StudentManagementSystem;

public class Student{
     private int id ;
     private String name ;
     private int age ; 
     private int[] marks = new int[5];

    Student(int id , String name , int age , int[] marks){
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }
    



}
