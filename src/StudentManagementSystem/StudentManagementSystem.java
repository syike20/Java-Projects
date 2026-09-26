package StudentManagementSystem;
import java.util.Scanner;
public class StudentManagementSystem {
    public static Student createStudent(){
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter Student ID :");
        int id = scanner.nextInt();

        System.out.print("Enter Student Name:");
        String name = scanner.nextLine();

        System.out.print("Enter Student Age:");
        int age = scanner.nextInt();

        System.out.print("Enter Student Marks:");
        int[] marks = new int[5];
        for(int i=0 ; i<marks.length ; i++){
            marks[i] = scanner.nextInt();
        }
        Student student = new Student(id,name,age,marks);
        return student;
    }
    public static void main(String[] args){
        Student student = createStudent();
    }
}
