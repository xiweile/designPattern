package observer;

/**
 * ISubjuct
 */
public interface ISubjuct {
 
    public void registerObserver(IObserver observer) ;

    public void removeObserver(IObserver observer);

    public void notifyObserver();
    
}