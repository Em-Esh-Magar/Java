package RMI_Program.TwoNum;

import java.rmi.*;

public interface TwoNum extends Remote{
    int sumOfTwoNum(int a, int b) throws RemoteException;
}
