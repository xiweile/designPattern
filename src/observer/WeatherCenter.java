package observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 天气中心
 * MsgCenter
 */
public class WeatherCenter implements ISubjuct{

    List<IObserver> observerList;

    Map<String,String> msg;

    public WeatherCenter(){
        this.observerList = new ArrayList<>();
        this.msg = new HashMap<>();
    }
    
    /**
     * 注册
     */
    public void registerObserver(IObserver observer){
        this.observerList.add(observer);
    }

    /**
     * 移除
     */
    public void removeObserver(IObserver observer){
        if(!this.observerList.isEmpty())
        this.observerList.remove(observer);
    }

    /**
     * 通知
     */
    public void notifyObserver(){
        for(IObserver observer : observerList){
            observer.update(this, this.msg);
        }
    }

    /**
     * @param msg the msg to set
     */
    public void setMsg( Map<String,String> msg) {
        this.msg = msg;
        notifyObserver();
    }

    /**
     * @return the msg
     */
    public Map<String,String> getMsg() {
        return this.msg;
    }
}