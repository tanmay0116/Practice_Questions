package Other_ques;

class Student{
    String name;
    double per;
    Student(String name, double per){
        this.name=name;
        this.per=per;
    }
}
public class Test {
    public static void main(String[] args) {
        Student ob1 = new Student("Rajeev",98.08);
        Student ob2 = new Student("Tilak",89.78);
        Student ob3 = new Student("Raj",56.90);
        Student ans= ob1.per>ob2.per?ob1.per>ob2.per?ob1:ob3:ob2.per> ob3.per?ob2: ob3;
        System.out.println(ans.name+" "+ans.per);
    }
}
