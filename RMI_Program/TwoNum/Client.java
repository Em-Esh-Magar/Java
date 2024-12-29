package RMI_Program.TwoNum;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.*;

public class Client {
    public static void main(String[] args) {
        try{
            Registry registry = LocateRegistry.getRegistry("localhost",1000);
            TwoNum obj = (TwoNum) registry.lookup("HelloServer");

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter two number : ");
            int a = scan.nextInt();
            int b = scan.nextInt();

            int sum = obj.sumOfTwoNum(a,b);

            System.out.println("Response : "+sum);


        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
