package abstractfactory.abstractfactory;

import abstractfactory.object.FemaleBlackHuman;
import abstractfactory.object.FemaleYellowHuman;
import abstractfactory.object.Human;

//生产女性的八卦炉
public class FemaleFactory implements HumanFactory {  
    @Override  
    public Human createYellowHuman() {
        return new FemaleYellowHuman();
    }  
    @Override  
    public Human createBlackHuman() {  
        return new FemaleBlackHuman();
    }  
//    @Override
//    public Human createWhiteHuman() {
//        return new FemaleWhiteHuman();
//    }
}  