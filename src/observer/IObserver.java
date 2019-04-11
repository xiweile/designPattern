package observer;

/**
 * IObserver
 */
public interface IObserver {
    
    /**
     * 更新目标主题变化
     */
    public void update(ISubjuct subjuct, Object args);

}
