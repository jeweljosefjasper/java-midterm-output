
import java.util.Scanner;
import java.util.ArrayList;

public class StudentArray {
    
    static ArrayList<Student> arr = new ArrayList<Student>();
 
    public static void main(String[] args) {
        menu();
    }
 
         //Main 
    public static void menu() {
                 System.out.println("Student Information System");
                 System.out.println("1.Add Entry");
                 System.out.println("2.View all Entries");
                 System.out.println("3.Update Entry");
                 System.out.println("4.Delete Entry");
                 System.out.println("5.Exit");
                        
        Scanner sc = new Scanner(System.in);
        switch (sc.nextInt()) {
            case 1:
                add();
                break;
            case 2:
                view();
                break;
            case 3:
                update();
                break;
            case 4:
                delete();
                break;
            case 5:
                System.out.println("Thank you for using this system.");
                break;
            default:
                System.out.println("Error. Choose only the number from the choices");
                menu();
                break;
        }
    }
 
         //View
    public static void view() {
        if (arr.size() != 0) {
            for (int i = 0; i < arr.size(); i++) {
            System.out.println( arr.get(i).getName() + " is " + arr.get(i).getage());           
           }
        } else {
           System.out.println("No Information Available At The Moment.");
 
        }
        menu();
    }
 
         //add
    public static void add() {
        String Name, sex;
        int ID,age;
        Scanner sc = new Scanner(System.in);
                System.out.println("Enter Name: ");
        Name = sc.next();
                System.out.println("Enter ID Number(integer only): ");
        ID = sc.nextInt();
                System.out.println("Enter Age: ");
        age = sc.nextInt();      
                 
        arr.add(new Student(ID, Name, age));
   
        menu();
    }
 
         // Update
    public static void update() {
        if (arr.size()!= 0) {
            int j = 0;
            System.out.println("Enter ID number to update Entry");
            Scanner sc = new Scanner(System.in);
            int id = sc.nextInt();
            for (int i = 0; i < arr.size(); i++) {
                if (arr.get(i).getID() == id) {
                    String Name, sex;
                    int age, ID; 
                    System.out.println("Enter Modified Age: ");
                    age = sc.nextInt();
                    System.out.println("Enter New Name: ");
                    Name = sc.next();
                                      
                    arr.set(i, new Student(age, Name));
                    j++;
                    break;
                }
            }
            if (j == 0) {
             System.out.println("ID number not found!");
            }
        } else {
           System.out.println("No Information Available At The Moment.");
        }
        menu();
    }
 
         // Delete 
    public static void delete() {
        
       
               
             if (arr.size() != 0) {
            int j = 0;
             System.out.println("Enter ID number to be deleted:");
            Scanner sc = new Scanner(System.in);
            int id = sc.nextInt();
            j++;
            for (int i = 0; i < arr.size(); i++) {
                if (arr.get(i).getID() == id) {
                    int ID = arr.get(i).getID();
                    arr.remove(i);
                        System.out.println("Student ID: " + ID + " has been succesfully deleted!");
                    
                }
                {
                    menu();
                    break;
                         
                }
            }
            if (j == 0) 
            {
         System.out.println("ID number Not found!");
            }
        } else 
        {
         System.out.println("No Information Available At The Moment.");
        }
        menu();
    }
}