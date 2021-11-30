import java.util.concurrent.TimeUnit;

public class Display {

    private int limit=0;
    private int value=0;

   public Display(int limit){
        this.limit=limit;
   }
   public void increase() throws InterruptedException {
       value++;
       TimeUnit.SECONDS.sleep(1);
       if(value==this.limit){
           value=0;
       }

   }

    public int getValue() {
        return value;
    }

    //用于测试
    public static void main(String args[]) throws InterruptedException {
        Display minute=new Display(24);
        for(;;){
            System.out.println(minute.getValue());
            minute.increase();
        }

   }
}
