package RMI_Program.StringConcat;

import java.rmi.*;
import java.rmi.server.*;

public class HelloImpl extends UnicastRemoteObject implements Hello{
    protected  HelloImpl() throws RemoteException{
        super();
    }


    @Override
    public String joinString(String a, String b) throws RemoteException {
        return a+"_"+b;
    }
}
