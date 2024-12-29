package RMI_Program.StringConcat;

import java.rmi.registry.*;

public class Server {
    public static void main(String[] args) {
        try {
            HelloImpl helloImpl = new HelloImpl();

            Registry registry = LocateRegistry.createRegistry(2020);
            registry.rebind("StringConcat", helloImpl);

            System.out.println("Server is started...");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
