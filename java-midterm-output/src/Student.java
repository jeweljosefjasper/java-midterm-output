public class Student {

private int age, ID;
private String Name, sex;

public Student(int age, String Name) {

    
    this.age = age;
    this.Name = Name;
    this.ID = ID;

}

    public Student(int ID, String Name, int age) {
        this.ID = ID;
        this.Name = Name;
        this.age = age;

    }

public int getID(){
    return ID;
}

public void setID(int ID){
    this.ID = ID;
}

public int getage() {
    return age;
}

public void setage(int age){
    this.age = age;
}



public String getName() {
    return Name;
}

public void setName(String Name){
    this.Name = Name;
}

}