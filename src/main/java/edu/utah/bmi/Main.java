package edu.utah.bmi;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class Main {
    public static void main(String[] args) throws InterruptedException, AWTException {
        int sleepSecond=300;
        if (args.length>0)
            sleepSecond=Integer.parseInt(args[0]);
        sleepSecond=sleepSecond*1000;
        while (true) {
            Thread.sleep(sleepSecond);//this is how long before it moves
            Robot robot = new Robot();

           // Simulate a key press
            robot.keyPress(KeyEvent.VK_ESCAPE);
        }
    }
}