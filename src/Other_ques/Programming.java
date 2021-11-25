package Other_ques;

public class Programming {
    Programming(){
        System.out.println("I love programming languages");
    }
    Programming(String pass){
        System.out.println("I love "+pass);
    }

    public static void main(String[] args) {
        Programming ob1 = new Programming();
        Programming ob2 = new Programming("Java");
    }
}
