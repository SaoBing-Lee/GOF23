package example.bingbing.observerpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 观察者模式
 * 使用三个类 Subject、Observer 和 Client。
 * Subject 对象带有绑定观察者到 Client 对象和从 Client 对象解绑观察者的方法。
 * 我们创建 Subject 类、Observer 抽象类和扩展了抽象类 Observer 的实体类。
 * ObserverPatternDemo，我们的演示类使用 Subject 和实体类对象来演示观察者模式。
 */
public class Subject {

    private List<Observer> observerList = new ArrayList<Observer>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }


    public void attach(Observer observer){
        observerList.add(observer);
    }

    public void notifyAllObservers() {
        for (Observer observer : observerList) {
            observer.update();
        }
    }


}
