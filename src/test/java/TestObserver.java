/**
 * @description: 观察者模式测试类
 * @author: 赵波
 * @createtime :2020-06-29 14:38:18
 **/
public class TestObserver {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(80,65,30.4f);
        weatherData.setMeasurements(82,70,29.2f);
        weatherData.setMeasurements(78,90,29.2f);

    }
}
