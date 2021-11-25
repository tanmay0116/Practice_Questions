package Other_ques;
import java.util.*;
public class Stu {
    String name,address;
    int age;
    Stu(){
        name="unknown";
        address="not available";
        age=0;
    }
    public void setInfo(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void setInfo(String name,int age,String address){
        this.name=name;
        this.age=age;
        this.address=address;
    }

    public static void main(String[] args) {
        Stu arr[] = new Stu[5];
        Scanner s = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i] = new Stu();
        }
        arr[0].setInfo("Satish",18);
        arr[1].setInfo("Rajeev",20,"Mathura");
        arr[2].setInfo("Tanishq",23);
        arr[3].setInfo("Sanjeev",23,"Aligarh");
        arr[4].setInfo("Aman",45,"Chandigarh");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i].name+" "+arr[i].age+" "+arr[i].address);
        }
    }
}
