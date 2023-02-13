import lombok.Getter;

import java.math.BigDecimal;
import java.util.LinkedHashMap;

public class projectWork {
    @Getter
   private Integer m;
   @Getter
   private LinkedHashMap<BigDecimal,Boolean> t;

   protected static String k;



    public projectWork(Integer m){

    }
    private void setM (Integer m){

        if(m < -18){
            throw new RuntimeException();
        }else{
            this.m = m;
        }
    }
    public void e(int J){

    }
    public void e(){

    }
}
