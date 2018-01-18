package builder.builder;

import builder.object.BenzModel;
import builder.object.CarModel;

import java.util.ArrayList;

public class BWMBuilder extends CarBuilder {

    /**
     * 宝马车模型
     */
    private BenzModel benz = new BenzModel();
      
    @Override  
    public void setSequence(ArrayList<String> sequence) {
        //设置宝马车模型的运行顺序
        this.benz.setSequence(sequence);
    }  
  
    @Override  
    public CarModel getCarModel() {
        //将这个模型返回
        return this.benz;
    }  
} 