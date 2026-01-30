/*Problem :
            Create class Student with instance variable name roll_no and cgpa 
            pass there value through constructor and print there details*/


class Student {
    String name;
    int roll_no;
    double cgpa;

    Student(String name , int roll_no,double cgpa){
        this.name = name;
        this.roll_no = roll_no;
        this.cgpa = cgpa;
    }
    void display(){
        System.out.println("Student_name : "+name);
        System.out.println("Roll_no : "+roll_no);
        System.out.println("CGPA: "+cgpa);
    }
}
class Client2 {
    public static void main(String[] args) {
        Student s = new Student("Siddhesh", 20, 8.78);
        s.display();
    }   
}
