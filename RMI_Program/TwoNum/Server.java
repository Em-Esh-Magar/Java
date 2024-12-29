package RMI_Program.TwoNum;

import java.rmi.*;
import java.rmi.registry.*;

public class Server{
    public static void main(String[] args) {
        try {
            TwoNumImpl twoNum = new TwoNumImpl();

            Registry registry = LocateRegistry.createRegistry(1000);
            registry.rebind("HelloServer", twoNum);

            System.out.println("Server is started...");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
