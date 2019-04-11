package observer;

import java.util.Map;

/**
 * ShanghaiService
 * 上海服务
 */
public class ShanghaiService implements IObserver{

    public void update(ISubjuct subjuct,Object args){
        WeatherCenter  wCenter= (WeatherCenter)subjuct;
        Map<String,String> msg = wCenter.getMsg();
        System.out.println("上海天气："+ msg.get("上海"));
    }
}