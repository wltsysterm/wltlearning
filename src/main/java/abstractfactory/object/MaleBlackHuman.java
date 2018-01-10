package abstractfactory.object;

/**
 * 黄种人男性类
 * @author 魏霖涛
 * @since 2018/1/10 0010
 */
public class MaleBlackHuman extends AbstractBlackHuman {
    @Override
    public void getSex() {
        System.out.println("Black man!");
    }
}
