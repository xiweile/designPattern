package observer;

import java.util.Map;

/**
 * BeijingService
 * 北京服务
 */
public class BeijingService implements IObserver{

    public void update(ISubjuct subjuct,Object args){
        WeatherCenter  wCenter= (WeatherCenter)subjuct;
        Map<String,String> msg = wCenter.getMsg();
        System.out.println("北京天气："+ msg.get("北京"));
    }
}