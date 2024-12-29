package RMI_Program.TwoNum;

import java.rmi.*;
import java.rmi.server.*;

public class TwoNumImpl extends UnicastRemoteObject implements TwoNum{
    protected TwoNumImpl() throws RemoteException{
        super();
    }

    public int sumOfTwoNum(int a, int b) throws RemoteException {
        return a+b;
    }
}
