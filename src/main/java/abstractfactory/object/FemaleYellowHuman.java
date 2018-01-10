package abstractfactory.object;

/**
 * 黄种人女性类
 * @author 魏霖涛
 * @since 2018/1/10 0010
 */
public class FemaleYellowHuman extends AbstractYellowHuman {
    @Override
    public void getSex() {
        System.out.println("Yellow woman!");
    }
}
