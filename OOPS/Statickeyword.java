public class Statickeyword {
    public static void main(String []args){
        Student.schoolname = "balveer";   // class ke through access

       // Student s1 = new Student();
       // Student s2 = new Student();
        System.out.println(Student.schoolname); // "balveer"

        Student.schoolname = "GOOD BOY";  // overwrite hoga
       // Student s3 = new Student();
        System.out.println(Student.schoolname); // "GOOD BOY"
    }
}
class Student{
    String name;
    int roll;
    static String schoolname;
    void setname(String name){
        this.name=name;
    }
    String getname(){
        return this.name;
    }
}
