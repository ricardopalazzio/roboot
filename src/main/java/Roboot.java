import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class Roboot {

    public static void main(String[] args) {
        try {


           boolean useRing = true;
           boolean useSoft  = true;

           AtomicBoolean run = new AtomicBoolean(true);

           int hours = 3;

           //timer
            new Thread(()->{
                try {
                    TimeUnit.HOURS.sleep(hours);
                    run.set(false);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();

            new Thread(()->{
                var time  = 450;
                try {

                    Robot robot =new Robot();

                    while(useRing&& run.get()) {
                        if(Math.random()<0.3) {
                            TimeUnit.SECONDS.sleep(15);
                        }
                        if(Math.random()<0.6) {
                            TimeUnit.SECONDS.sleep(18);
                        }
                        else {
                            TimeUnit.SECONDS.sleep(20);
                        }

                        robot.keyPress(KeyEvent.VK_F10);
                        robot.keyRelease(KeyEvent.VK_F10);
                        TimeUnit.SECONDS.sleep(time);

                    }
                } catch (AWTException | InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();


            new Thread(()->{

                var time  = Integer.valueOf( String.valueOf( Math.round( ((Math.random()*120) +(Math.random()*60) )  )))+260;
                try {
                    TimeUnit.SECONDS.sleep(15);
                    Robot robot =new Robot();
                    while(run.get()) {
                       time  = Integer.valueOf( String.valueOf( Math.round( ((Math.random()*120) +(Math.random()*60) )  )))+260;
                        TimeUnit.SECONDS.sleep(time);

                        robot.keyPress(KeyEvent.VK_F11);
                        robot.keyRelease(KeyEvent.VK_F11);
                        TimeUnit.SECONDS.sleep(2);
                        robot.keyPress(KeyEvent.VK_F11);
                        robot.keyRelease(KeyEvent.VK_F11);
                        TimeUnit.SECONDS.sleep(1);
                        robot.keyPress(KeyEvent.VK_F11);
                        robot.keyRelease(KeyEvent.VK_F11);
                        TimeUnit.SECONDS.sleep(1);
                        robot.keyPress(KeyEvent.VK_F11);
                        robot.keyRelease(KeyEvent.VK_F11);
                        TimeUnit.SECONDS.sleep(2);
                        if(Math.random()>0.5){
                            TimeUnit.SECONDS.sleep(1);
                            robot.keyPress(KeyEvent.VK_F11);
                            robot.keyRelease(KeyEvent.VK_F11);
                        }
                        if(Math.random()>0.5){
                            TimeUnit.SECONDS.sleep(2);
                            robot.keyPress(KeyEvent.VK_F11);
                            robot.keyRelease(KeyEvent.VK_F11);
                        }

                        TimeUnit.SECONDS.sleep(3);
                        if(Math.random()>0.5){
                            TimeUnit.SECONDS.sleep(1);
                            robot.keyPress(KeyEvent.VK_F11);
                            robot.keyRelease(KeyEvent.VK_F11);
                        }
                    }
                } catch (AWTException | InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();


            new Thread(()->{
                var time  = Integer.valueOf( String.valueOf( Math.round( ((Math.random()*30) +(Math.random()*30) )  )))+60;
                try {
                    TimeUnit.SECONDS.sleep(15);
                    Robot robot = new Robot();
                    while(run.get()) {
                        var sum = 180;

                        if(useSoft)
                            sum = sum -45;

                        time  = Integer.valueOf( String.valueOf( Math.round( ((Math.random()*36) +(Math.random()*35) )  ))) + (sum);
                        TimeUnit.SECONDS.sleep(time);

                        robot.keyPress(KeyEvent.VK_F12);
                        robot.keyRelease(KeyEvent.VK_F12);
                        TimeUnit.SECONDS.sleep(2+ Math.round ((Math.random()*3)) );
                        robot.keyPress(KeyEvent.VK_F12);
                        robot.keyRelease(KeyEvent.VK_F12);
                        TimeUnit.SECONDS.sleep(2+ Math.round ((Math.random()*4)) );
                        robot.keyPress(KeyEvent.VK_F12);
                        robot.keyRelease(KeyEvent.VK_F12);
                        TimeUnit.SECONDS.sleep(2+ Math.round ((Math.random()*4)) );
                        robot.keyPress(KeyEvent.VK_F12);
                        robot.keyRelease(KeyEvent.VK_F12);
                        TimeUnit.SECONDS.sleep(2+ Math.round ((Math.random()*4)) );
                        robot.keyPress(KeyEvent.VK_F12);
                        robot.keyRelease(KeyEvent.VK_F12);

                        if(useSoft||useRing){
                            if(Math.random()>0.5){
                                TimeUnit.SECONDS.sleep(2);
                                robot.keyPress(KeyEvent.VK_F12);
                                robot.keyRelease(KeyEvent.VK_F12);
                            }
                        }
                        if(useSoft||useRing){
                            if(Math.random()>0.5){
                                TimeUnit.SECONDS.sleep(2);
                                robot.keyPress(KeyEvent.VK_F12);
                                robot.keyRelease(KeyEvent.VK_F12);
                            }
                        }

                    }
                } catch (AWTException | InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();


//
//            new Thread(()->{
//                var time  = Integer.valueOf( String.valueOf( Math.round( ((Math.random()*120) +(Math.random()*60) ) )))+30;
//                try {
//                    Robot robot = new Robot();
//                    while(true) {
//
//                        TimeUnit.SECONDS.sleep(time);
//                        robot.keyPress(KeyEvent.VK_F4);
//                        robot.keyRelease(KeyEvent.VK_F4);
//                        TimeUnit.SECONDS.sleep(1);
//                        robot.keyPress(KeyEvent.VK_F4);
//                        robot.keyRelease(KeyEvent.VK_F4);
//                        TimeUnit.SECONDS.sleep(4);
//                        if(Math.random()>0.5){
//                            TimeUnit.SECONDS.sleep(1);
//                            robot.keyPress(KeyEvent.VK_F4);
//                            robot.keyRelease(KeyEvent.VK_F4);
//                        }
//                    }
//                } catch (AWTException | InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }).start();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
