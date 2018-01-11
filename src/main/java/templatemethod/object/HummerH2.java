package templatemethod.object;

public class HummerH2 extends HummerModel {

    /**
     * 判断标记
     */
    private boolean alarmFlag = true;
    @Override  
    public void start() {  
        System.out.println("H2发动……");  
    }  
  
    @Override  
    public void stop() {  
        System.out.println("H2停止……");  
    }  
  
    @Override  
    public void alarm() {  
        System.out.println("H2鸣笛……");  
    }  
  
    @Override  
    public void engineBoom() {  
        System.out.println("H2轰鸣……");  
    }  
      
    @Override  
    protected boolean isAlarm() { //覆写isAlarm方法，返回判断标记  
        return this.alarmFlag;  
    }  
      
    public void setAlarm(boolean isAlarm) { //设置判断标记  
        this.alarmFlag = isAlarm;  
    }  
      
} 