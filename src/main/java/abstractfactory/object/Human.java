package abstractfactory.object;

/**
 * 定义抽象人类接口
 * @author 魏霖涛
 * @since 2018/1/10 0010
 */
public interface Human{

    /**
     * 获取颜色
     */
    void getColor();

    /**
     * 说话
     */
    void talk();

    /**
     * 获取性别
     */
    void getSex(); //多了个性别
}
