package proxy.staticproxy.object;

/**
 * @Description 真实对象
 * @author Ni Shengwu
 *
 */
public class RealStar implements Star {

    @Override
    public void confer() {
        System.out.println("RealStar.confer()");
    }

    @Override
    public void sing() {
        System.out.println("RealStar(周杰伦).sing()");
    }

    @Override
    public void collectMoney() {
        System.out.println("RealStar.collectMoney()");
    }

}