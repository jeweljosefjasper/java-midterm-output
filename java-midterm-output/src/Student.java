public class Student {

private int age, ID;
private String Name, sex;

public Student(int age, String Name) {

    
    this.age = age;
    this.Name = Name;
    this.ID = ID;
    this.sex = sex;

}

    public Student(int ID, String Name, int age, String sex) {
        this.ID = ID;
        this.Name = Name;
        this.age = age;
        this.sex = sex;

    }
public String getsex(){
    return sex;
}

public void setsex(String Name){
    this.sex = sex;
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