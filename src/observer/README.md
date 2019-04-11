## observer 观察者模式


### 代码案例
案例：天气中心发布天气信息，各省份服务注册到天气中心，从而获取实时变化的信息。

模拟观察者上海天气服务ShanghaiService 和 北京天气服务 BeijingService，这两个服务中分别有update方法，来更新并展示天气信息。

模拟天气中心类 WeatherCenter 中有注册registerObserver、移除removeObserver、通知notifyObserver三个方法。分别实现观察者的注册、移除、通知更新等功能。