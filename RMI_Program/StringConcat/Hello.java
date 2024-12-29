package RMI_Program.StringConcat;

import java.rmi.*;

public interface Hello extends Remote {
    String joinString(String a, String b) throws RemoteException;
}
