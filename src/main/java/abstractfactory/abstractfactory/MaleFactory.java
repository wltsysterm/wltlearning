package abstractfactory.abstractfactory;

import abstractfactory.object.Human;
import abstractfactory.object.MaleBlackHuman;
import abstractfactory.object.MaleYellowHuman;

//生产男性的八卦炉
public class MaleFactory implements HumanFactory {  
    @Override  
    public Human createYellowHuman() {
        return new MaleYellowHuman();
    }  
    @Override
    public Human createBlackHuman() {
        return new MaleBlackHuman();
    }
//    @Override
//    public Human createWhiteHuman() {
//        return new MaleWhiteHuman();
//    }
}