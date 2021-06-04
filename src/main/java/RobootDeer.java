import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

public class RobootDeer {

    public static void main(String[] args) {



            boolean useRing = true;



//come
        new Thread(() -> {

                try {
                    TimeUnit.SECONDS.sleep(10);
                    Robot robot = new Robot();

                    while (useRing) {


                            robot.keyPress(KeyEvent.VK_F10);
                            robot.keyRelease(KeyEvent.VK_F10);
                            robot.delay(2000);
                            robot.keyPress(KeyEvent.VK_F10);
                            robot.keyRelease(KeyEvent.VK_F10);
                            robot.delay(2000);
                            robot.keyPress(KeyEvent.VK_F10);
                            robot.keyRelease(KeyEvent.VK_F10);
                        if (Math.random() > 0.5) {
                            robot.keyPress(KeyEvent.VK_F10);
                            robot.keyRelease(KeyEvent.VK_F10);
                        }
                        if (Math.random() > 0.5) {
                            robot.keyPress(KeyEvent.VK_F10);
                            robot.keyRelease(KeyEvent.VK_F10);
                        }
                        TimeUnit.SECONDS.sleep(Integer.valueOf(String.valueOf(Math.round(((Math.random() * 60) + (Math.random() * 60)))))+120);

                    }
                } catch (AWTException | InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();

        // exura ico
        new Thread(() -> {

            var time = 0;
            try {
                TimeUnit.SECONDS.sleep(15);
                Robot robot = new Robot();
                while (true) {

                    robot.keyPress(KeyEvent.VK_3);
                    robot.keyRelease(KeyEvent.VK_3);
                    time = Integer.valueOf(String.valueOf(Math.round(((Math.random() * 60) + (Math.random() * 60)))))+240;
                    TimeUnit.SECONDS.sleep(time);
                }
            } catch (AWTException | InterruptedException e) {
                e.printStackTrace();
            }
        }).start();


        //utura
            new Thread(() -> {

                var time = Integer.valueOf(String.valueOf(Math.round(((Math.random() * 30) + (Math.random() * 10)))))+95;
                try {
                    TimeUnit.SECONDS.sleep(15);
                    Robot robot = new Robot();
                    while (true) {

                        robot.keyPress(KeyEvent.VK_F3);
                        robot.keyRelease(KeyEvent.VK_F3);
                        time = Integer.valueOf(String.valueOf(Math.round(((Math.random() * 30) + (Math.random() * 30)))))+95;
                        TimeUnit.SECONDS.sleep(time);
                    }
                } catch (AWTException | InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();


// mana
        new Thread(() -> {

            var time = 0;
            try {
                TimeUnit.SECONDS.sleep(15);
                Robot robot = new Robot();
                while (true) {

                    robot.keyPress(KeyEvent.VK_1);
                    robot.keyRelease(KeyEvent.VK_1);
                    time = Integer.valueOf(String.valueOf(Math.round(((Math.random() * 30) + (Math.random() * 30)))))+540;
                    TimeUnit.SECONDS.sleep(time);
                }
            } catch (AWTException | InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

    }
}
