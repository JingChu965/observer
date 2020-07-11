/**
 * @description: 主题接口，注册删除观察者，通知观察者
 * @author: 赵波
 * @createtime :2020-06-29 14:21:20
 **/
public interface Subject {
    /**
     * 注册观察者
     * @param observer
     */
    void registerObserver(Observer observer);

    /**
     * 移除观察者
     * @param observer
     */
    void removeObserver(Observer observer);

    /**
     * 消息通知
     */
    void notifyObservers();
}
