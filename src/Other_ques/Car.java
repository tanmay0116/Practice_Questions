package Other_ques;
public class Car {
    String manufacturer;
    int price;
    Car(String manufacturer, int price)
    {
        this.manufacturer=manufacturer;
        this.price=price;
    }
    public String toString(){
        return manufacturer+" "+price;
    }
    public static void main(String[] args) {
        int pos;
        Car ans1,ans2,ans3;
        Car arr[] = new Car[3];
        arr[0] = new Car("Honda",50_00_00);
        arr[1] = new Car("Suzuki",20_00_00);
        arr[2] = new Car("Toyota",15_00_00);
        if(arr[0].price>arr[1].price && arr[0].price>arr[2].price){
            ans1=arr[0];
            if(arr[1].price>arr[2].price)
            {ans2=arr[1];ans3=arr[2];}
            else
            {ans2=arr[2];ans3=arr[1];}
        }
        else if(arr[1].price>arr[0].price && arr[1].price>arr[2].price){
            ans1=arr[1];
            if(arr[0].price>arr[2].price){
                ans2=arr[0];
                ans3 = arr[2];
            }
            else
            {
                ans2 = arr[2];
                ans3 = arr[0];
            }
        }
        else
        {
            ans1 = arr[2];
            if(arr[0].price>arr[1].price){
                ans2=arr[0];
                ans3=arr[1];
            }
            else
            {
                ans2=arr[1];
                ans3=arr[0];
            }
        }
        System.out.println(ans3.manufacturer+" : "+ans3.price);
        System.out.println(ans2.manufacturer+ " : "+ans2.price);
        System.out.println(ans1.manufacturer+" : "+ans1.price);
    }
}
