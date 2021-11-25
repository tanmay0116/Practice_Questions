package Other_ques;

public class ObjCount {
    static int count=0;
    {
        count++;
    }
    public static void main(String[] args) {
        ObjCount ob1 = new ObjCount();
        ObjCount ob2 = new ObjCount();
        ObjCount ob3 = new ObjCount();
        System.out.println("No. of instances created are : "+count);
    }
}
