package Other_ques;

public class AddAmount {
    int amount = 50;
    AddAmount(){

    }
    AddAmount(int amount){
        this.amount=amount+this.amount;
    }

    public static void main(String[] args) {
        AddAmount ob1 = new AddAmount();
        AddAmount ob = new AddAmount(50);
        System.out.println(ob1.amount);
        System.out.println(ob.amount);
    }
}
