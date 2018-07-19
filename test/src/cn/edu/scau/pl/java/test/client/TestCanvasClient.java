package cn.edu.scau.pl.java.test.client;

import java.awt.EventQueue;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;

import cn.edu.scau.pl.java.test.client.TestStopWatch.task;

import java.awt.Canvas;
import java.awt.BorderLayout;

public class TestCanvasClient {

	private JFrame frame;
	private static CanvasTest canvasTest  = new CanvasTest();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestCanvasClient window = new TestCanvasClient();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TestCanvasClient() {
		initialize();
		init();
	}

	private void init() {
		
		frame.add(canvasTest);  
        
		frame.addWindowListener(new WindowAdapter() {  
            public void windowClosing(WindowEvent e) {  
            	frame.dispose();  
                System.exit(0);  
            }  
        });
        
        Timer timer = new Timer();
        timer.schedule(new task(), new Date(), 500);
		
	}
	
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 100, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Canvas canvas = new CanvasTest();
		canvas.setBounds(0, 0, 100, 100);
		frame.getContentPane().add(canvas);
	}
	
	
    class task extends TimerTask{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			TestCanvasClient.canvasTest.repaint();
		}
    	
    }
	
}
