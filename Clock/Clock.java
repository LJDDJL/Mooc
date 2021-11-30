public class Clock {
    public static void main(String args[]) throws InterruptedException {

        Display hour=new Display(24);
        Display minute=new Display(60);
        for(;;){
            System.out.println(hour.getValue()+":"+minute.getValue());

            minute.increase();

            if(minute.getValue()==60){
                hour.increase();
            }


        }

    }

}
