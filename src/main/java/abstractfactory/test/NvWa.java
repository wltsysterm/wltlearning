package abstractfactory.test;

import abstractfactory.abstractfactory.FemaleFactory;
import abstractfactory.abstractfactory.HumanFactory;
import abstractfactory.abstractfactory.MaleFactory;
import abstractfactory.object.Human;

/**
 * 抽象工厂是应对产品族概念的。比如说，每个汽车公司可能要同时生产轿车，货车，客车，那么每一个工厂都要有创建轿车，货车和客车的方法。
 应对产品族概念而生，增加新的产品线很容易，但是无法增加新的产品。
 和工厂方法的区别是，抽象工厂往往有多种方法，可以生产多种产品，即产品簇。
 */
public class NvWa {
    public static void main(String[] args) {  
        HumanFactory maleHumanFactory = new MaleFactory(); //第一条生产线：男性生产线
        HumanFactory femaleHumanFactory = new FemaleFactory(); //第二条生产线：女性生产线
          
                //生产线建立完毕，开始造人  
        Human maleYellowHuman = maleHumanFactory.createYellowHuman(); //造黄色男性
        Human femaleYellowHuman = femaleHumanFactory.createYellowHuman(); //造黄色女性  
          
        System.out.println("--生产一个黄色女性--");  
        femaleYellowHuman.getColor();  
        femaleYellowHuman.talk();  
        femaleYellowHuman.getSex();  
          
        System.out.println("--生产一个黄色男性--");  
        maleYellowHuman.getColor();  
        maleYellowHuman.talk();  
        maleYellowHuman.getSex();  
        /* 
         * …… 
         */  
    }  
} 