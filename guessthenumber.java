import java.util.Scanner;
import java.util.Random;
class game{
    Scanner sc=new Scanner(System.in);
    int n;
    int g;
    int p;
    game(int q){
       n=q;
       g=0;
    }
    void getter(){
        System.out.println("Enter a number");
        p=sc.nextInt();
        g++;
        process(p);
    }
    void process(int s){
        if(s==n)
        {
            System.out.println("CONGRAGULATIONS!! YOU WON!");
            System.out.println("No. of attempts :"+g);
        }
       else if(s>n)
        {
            System.out.println("Entered number is greater");
            getter();
        }
        else
        {
            System.out.println("Entered number is smaller");
            getter();
        }
    }
}



public class guessthenumber {
    //Scaneer class object must be declared inside the main function
    public static void main(String[] args) {
       //Scanner sc=new Scanner(System.in);
       Random r=new Random();
       int a;
       a=r.nextInt(11);
       game g=new game(a);
       g.getter();
        
       
    }
    
}
