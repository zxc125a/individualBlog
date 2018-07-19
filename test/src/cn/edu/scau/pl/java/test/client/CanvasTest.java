package cn.edu.scau.pl.java.test.client;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import org.omg.CORBA.portable.ApplicationException;

public class CanvasTest extends Canvas{

	private int move = 0;
	private int[] point; 
	
	public CanvasTest() {
		
		point = new int[100];
		for(int i = 0; i < 100; i++) {
			
			point[i] = (int)(Math.random() * 100);
		}
	}
	
	 public void paint(Graphics g){ //����Component���paint()����  

		 Graphics2D g2 = (Graphics2D)g;
		 paintBackground(g2);      
	 }  
	 
     //��ʼ������
     private void paintBackground(Graphics2D g) {
		
    	 Font font=new Font("TimesRoman",1,14);
		 g.setFont(font);
		 g.setColor(Color.green);
		 setBackground(Color.gray);
		 for (int i=0;i<27;i++){
			g.drawLine(1,20+i*20,610,20+i*20);
		 }
		 for (int j=0;j<31;j++){
			g.drawLine(5+j*20,1,5+j*20,540);
		 }
		 
		 if(99 * 5 - move>0) {
			 
			 move += 5;
			 g.setColor(Color.red);
			 for (int k=0;k<99;k++){//�� 100����
			 //���ݴ���ͼ�ΰ�λ�á�������ʾ
				 g.drawLine(k*5 - move,100-(int)point[k],5*k+5 - move,100-(int)point[k+1]);
				 g.fillOval(k*5 - move, 100-(int)point[k], 2, 2);
			 }
		 }
     }
	
}
