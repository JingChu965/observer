import java.util.ArrayList;

/**
 * @description: 气象台
 * @author: 赵波
 * @createtime :2020-06-29 14:26:19
 **/
public class WeatherData implements Subject {
    private ArrayList observers;
    private float temp;
    private float humidity;
    private float pressure;

    /**
     * 构造函数,初始化一个气象台
     */
    public WeatherData() {
        observers = new ArrayList();
    }

    /**
     * 注册观察者
     *
     * @param observer
     */
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * 移除观察者
     *
     * @param observer
     */
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * 通知观察者气象变化
     */
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            observer.update(temp, humidity, pressure);
        }
    }

    /**
     * 检测气象台发生了变化
     */
    public void measurementsChanged() {
        notifyObservers();
    }

    /**
     * 设置气象台数据发生改变
     * @param temp 温度
     * @param humidity 湿度
     * @param pressure 气压
     */
    public void setMeasurements(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
