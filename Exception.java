//13.3.26
import java.util.Scanner;
public class Exception {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("first no:");
        int a=scanner.nextInt();
        System.out.println("second no:");
        int b=scanner.nextInt();
        try{
            int result=a/b;
            System.out.println("result: "+result);
        }
        catch(ArithmeticException e){
            System.out.println("ERROR!,CAN NOT DEVIDE BY ZERO");
        }
        scanner.close();

    }

    
}

