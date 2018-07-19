package cn.edu.scau.pl.java.test.client;

import java.awt.*;  
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

  
class TestStopWatch extends Frame {  
      
	private static CanvasTest canvasTest  = new CanvasTest();
    public TestStopWatch() {  
          
        this.add(canvasTest);  
          
        addWindowListener(new WindowAdapter() {  
            public void windowClosing(WindowEvent e) {  
                dispose();  
                System.exit(0);  
            }  
        });
        
        Timer timer = new Timer();
        timer.schedule(new task(), new Date(), 500);

    }  
  
    public static void main(String args[]) {  
        System.out.println("Starting TestStopWatch...");  
        TestStopWatch mainFrame = new TestStopWatch();  
        mainFrame.setSize(400, 400);  
        mainFrame.setTitle("TestStopWatch");  
        mainFrame.setVisible(true);  
          
    }  
    
    
    
    class task extends TimerTask{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			TestStopWatch.canvasTest.repaint();
		}
    	
    }
}  