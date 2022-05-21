import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;


public interface partFacade extends Remote {
    ComItems findParts(ComItems c) throws RemoteException;
    
    List<ComItems> getAllParts() throws RemoteException;
}
