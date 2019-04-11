import observer.BeijingService;
import observer.ShanghaiService;
import observer.WeatherCenter;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class DemoTest {

    /**
     * 观察者模式
     */
    @Test
    public void observerTest(){
        System.out.println("******ObserverTest******");

        WeatherCenter wCenter = new WeatherCenter();
        // 注册北京服务
        BeijingService beijingService = new BeijingService();
        System.out.println("****注册北京的服务*****");
        wCenter.registerObserver(beijingService);
        // 注册上海服务
        ShanghaiService shanghaiService = new ShanghaiService();
        System.out.println("****注册上海的服务*****");
        wCenter.registerObserver(shanghaiService);
        // 设置天气情况
        Map<String,String> msg  = new HashMap<>();
        msg.put("北京","晴朗");
        msg.put("上海", "小雨");
        System.out.println("****消息更新*****");
        wCenter.setMsg(msg);

        // 移除上海的服务
        System.out.println("****移除上海的服务*****");
        wCenter.removeObserver(shanghaiService);
        System.out.println("****消息更新*****");
        wCenter.setMsg(msg);
    }
}
