package esclientserverba;

import java.util.logging.level;
import java.util.logging.logger;

public class CountDown extends Thread{
    private int CountDown;
    
    public CountDown(int CD){
        this.CountDown = CD;
    }
   
    @Override
    public void run(){
        for (int i = CountDown; i>0; i--){
            try{
                System.out.println(i);
                sleep(1000);
            }catch(InterruptedException ex){
                Logger.getLogger.(CountDown.class.getName().log(level.SERVER, null, ex);
            }
        }
    }
    
}
