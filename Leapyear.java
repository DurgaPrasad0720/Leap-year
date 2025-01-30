import java.util.*;
public class Leapyear {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);{
            System.out.println("enter the year");
        int year=src.nextInt();
        if(year%4==0){
            System.out.println("It is leap year");
        }else{
            System.out.println("It is not a leap year");
        }
        src.close();
        }
    }
}
