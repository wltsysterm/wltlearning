package abstractfactory.object;

/**
 * 定义抽象黄种人类
 * @author 魏霖涛
 * @since 2018/1/10 0010
 */
public abstract class AbstractYellowHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("Yellow color");
    }
    @Override
    public void talk() {
        System.out.println("Yellow people");
    }
}
