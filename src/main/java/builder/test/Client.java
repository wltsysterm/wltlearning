package builder.test;

import builder.object.Director;

public class Client {
      
        public static void main(String[] args) {  
      
            Director director = new Director();
              
            for(int i = 0; i < 1; i ++) {
                director.getABenzModel();
            }  
              
            for(int i = 0; i < 3; i ++) {
                director.getBBenzModel();
            }  
              
            for(int i = 0; i < 2; i ++) {
                director.getCBWMModel();
            }  
        }  
      
    }  