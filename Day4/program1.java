class Student {
    String name;
    int roll_no;
    float cgpa;
    void display(){
        System.out.println("Student_name : "+name);
        System.out.println("Roll_no : "+roll_no);
        System.out.println("CGPA: "+cgpa);
    }
}
class Client1 {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Siddhesh";
        s.roll_no = 20;
        s.cgpa = (float) 8.78;
        s.display();
    }   
}
