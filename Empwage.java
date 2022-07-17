
import java.util.Random;
public class Empwage {
    public static void main(String[] args){
        Random atte = new Random();
        int max = 2;
        int present = 1;
        int check = atte.nextInt(max);
        if(check == present){
            System.out.println("employee is present");
        }
        else{
            System.out.println("employee is absent");
        }
    }
}
