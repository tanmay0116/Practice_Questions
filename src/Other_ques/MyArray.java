package Other_ques;
import java.util.*;
public class MyArray{
    static int flag = 0;
    public static boolean search(int arr[], int search_element){
        for(int i=0;i< arr.length;i++){
            if(search_element==arr[i]){
                flag=1;
                break;
            }
        }
        if(flag==1)
            return true;
        else
        {
            System.out.println("element not found!");
            return false;
        }
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the element you want to search : ");
        int search_element = s.nextInt();
        boolean ans = search(arr,search_element);
        if(ans)
            System.out.println(ans);
    }
}
