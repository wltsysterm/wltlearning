package builder.object;

import builder.builder.BWMBuilder;
import builder.builder.BenzBuilder;

import java.util.ArrayList;

public class Director {
    private ArrayList<String> sequence = new ArrayList<String>();
    private BenzBuilder benzBuilder = new BenzBuilder();
    private BWMBuilder bwmBuilder = new BWMBuilder();
      
    //A顺序的奔驰车  
    public BenzModel getABenzModel() {  
        this.sequence.clear();  
        this.sequence.add("start");  
        this.sequence.add("stop");  
        //返回A顺序的奔驰车  
        this.benzBuilder.setSequence(sequence);  
        return (BenzModel) this.benzBuilder.getCarModel();  
    }  
      
    //B顺序的奔驰车  
    public BenzModel getBBenzModel() {  
        this.sequence.clear();  
        this.sequence.add("engine boom");  
        this.sequence.add("start");  
        this.sequence.add("stop");  
        //返回B顺序的奔驰车  
        this.benzBuilder.setSequence(sequence);  
        return (BenzModel) this.benzBuilder.getCarModel();  
    }  
      
    //C顺序的宝马车  
    public BenzModel getCBWMModel() {  
        this.sequence.clear();  
        this.sequence.add("start");  
        this.sequence.add("alarm");  
        this.sequence.add("stop");  
        //返回C顺序的宝马车  
        this.bwmBuilder.setSequence(sequence);  
        return (BenzModel) this.bwmBuilder.getCarModel();  
    }  
  
    //D顺序的宝马车  
    public BenzModel getDBWMModel() {  
        this.sequence.clear();  
        this.sequence.add("engine boom");  
        this.sequence.add("start");  
        //返回D顺序的宝马车  
        this.bwmBuilder.setSequence(sequence);  
        return (BenzModel) this.bwmBuilder.getCarModel();  
    }  
      
    //还有很多其他需求，设计师嘛，想啥需求就给你弄啥需求  
} 