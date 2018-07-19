package cn.edu.scau.pl.java.test.client;

import java.text.SimpleDateFormat;  
import java.util.Date;  
import java.awt.*;  
import java.awt.event.*;  
  
public class StopWatch extends Canvas implements Runnable {  //StopWatch�̳���Canvas����� //ʵ��Runnable�ӿڣ�ʵ��ʵʱˢ��  
    long startTime=0; //��갴��ʱ��ʱ��  
    long endTime=0;  //����ɿ�ʱ��ʱ��  
    boolean bStart=false;  
    
    public StopWatch(){  
        enableEvents(AWTEvent.MOUSE_EVENT_MASK);  
        }  
    
    protected void processMouseEvent(MouseEvent e){  
        if(e.getID()==MouseEvent.MOUSE_PRESSED){  
            bStart=true;  
            new Thread(this).start(); //���� �ػ�ˢ ���߳�  
            startTime=endTime=System.currentTimeMillis(); //��ȡ�������ʱ�ĵ�ǰʱ��  
            repaint(); //�������ʱ�ػ������ʵ�ּ�ʱ������  
            }  
        else if(e.getID()==MouseEvent.MOUSE_RELEASED){  
            endTime=System.currentTimeMillis(); //��ȡ�ſ����ʱ�ĵ�ǰʱ��  
            repaint(); //�����ػ����  
            bStart=false;  
            }  
        }  
      
      
    public void paint(Graphics g){ //����Component���paint()����  
        SimpleDateFormat sdf=new SimpleDateFormat("HH:mm:ss");//ע��HH:mm:ss������ĸ�Ĵ�Сд  
        Date elapsedTime=null; //������갴�º��ɿ�֮���ʱ���  
        try{  
            elapsedTime=sdf.parse("00:00:00");//����elapsedTime��ʼֵΪ00:00:00������ʱ��ʾ���ܳ����쳣��Ҫtryһ��  
            }  
        catch(Exception e){  
            e.printStackTrace();  
            }  
          
        elapsedTime.setTime(elapsedTime.getTime()+endTime-startTime);  
        String strTime=sdf.format(elapsedTime); //ʱ���elapsedTime��ʽ������ַ�������Ҫ�ڼ�ʱ������ʾ������  
        g.fill3DRect(0,0,78,28,true); //���ñ���  
        g.setColor(Color.WHITE); //����������ɫ  
        g.drawString(strTime,10,20); //�����ַ���  
          
        }  
  
    public void run() {  
        // TODO: Add your code here  
        while(bStart){  //ѭ��ˢ��  
            try{  
                Thread.sleep(500);  //500����ˢ��һ��  
                }  
            catch(Exception e){  
                e.printStackTrace();  
                }  
            endTime=System.currentTimeMillis();  
            repaint();  
            }  
    }  
}  