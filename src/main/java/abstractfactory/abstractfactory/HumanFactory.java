package abstractfactory.abstractfactory;

import abstractfactory.object.Human;

/**
 * 抽象工厂接口的定义
 */
public interface HumanFactory {
    Human createYellowHuman();
    Human createBlackHuman();
//    public Human createWhiteHuman();
} 