package RMI_Program.StringConcat;

import java.rmi.registry.*;
import java.util.*;

public class Client {
    public static void main(String[] args) {
        try{
            Registry registry = LocateRegistry.getRegistry("localhost",2020);
            Hello hello = (Hello)registry.lookup("StringConcat");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter two String : ");
            String a = scanner.next();
            String b = scanner.next();

            String result = hello.joinString(a,b);
            System.out.println("Response from Server : "+result);

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
