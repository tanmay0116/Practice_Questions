package Other_ques;
import java.util.*;
public class Room {
    boolean AC_ON,HOME_THEATRE_ON,FAN_ON,LIGHT_ON;

    public static void main(String[] args) {
        int power=0;
        Scanner s = new Scanner(System.in);
        Room obj = new Room();
        System.out.println("Enter the running state of appliance in boolean form [ON = true/ OFF = false] : ");
        System.out.println("AC_ON : ");
        obj.AC_ON = s.nextBoolean();
        System.out.println("HOME_THEATRE_ON : ");
        obj.HOME_THEATRE_ON = s.nextBoolean();
        System.out.println("FAN_ON : ");
        obj.FAN_ON = s.nextBoolean();
        System.out.println("LIGHT_ON : ");
        obj.LIGHT_ON = s.nextBoolean();
        if(obj.AC_ON)
            power=power+1200;
        if(obj.LIGHT_ON)
            power=power+100;
        if(obj.FAN_ON)
            power=power+400;
        if(obj.HOME_THEATRE_ON)
            power=power+600;
        if(power>2000)
            System.out.println("!!!Overload!!!");

    }
}
