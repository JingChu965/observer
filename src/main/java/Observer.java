/**
 * @description: 观察者接口，更改信息
 * @author: 赵波
 * @createtime :2020-06-29 14:22:00
 **/
public interface Observer {
    /**
     * 更新气象台观测到的信息
     * @param temp 温度
     * @param humidity 湿度
     * @param pressure 气压
     */
    void update(float temp,float humidity,float pressure);
}
