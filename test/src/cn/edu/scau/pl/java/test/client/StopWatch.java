package cn.edu.scau.pl.java.test.client;

import java.text.SimpleDateFormat;  
import java.util.Date;  
import java.awt.*;  
import java.awt.event.*;  
  
public class StopWatch extends Canvas implements Runnable {  //StopWatch继承了Canvas组件类 //实现Runnable接口，实现实时刷新  
    long startTime=0; //鼠标按下时的时间  
    long endTime=0;  //鼠标松开时的时间  
    boolean bStart=false;  
    
    public StopWatch(){  
        enableEvents(AWTEvent.MOUSE_EVENT_MASK);  
        }  
    
    protected void processMouseEvent(MouseEvent e){  
        if(e.getID()==MouseEvent.MOUSE_PRESSED){  
            bStart=true;  
            new Thread(this).start(); //启动 重绘刷 新线程  
            startTime=endTime=System.currentTimeMillis(); //获取按下鼠标时的当前时间  
            repaint(); //按下鼠标时重绘组件，实现计时器归零  
            }  
        else if(e.getID()==MouseEvent.MOUSE_RELEASED){  
            endTime=System.currentTimeMillis(); //获取放开鼠标时的当前时间  
            repaint(); //并且重绘组件  
            bStart=false;  
            }  
        }  
      
      
    public void paint(Graphics g){ //覆盖Component类的paint()方法  
        SimpleDateFormat sdf=new SimpleDateFormat("HH:mm:ss");//注意HH:mm:ss几个字母的大小写  
        Date elapsedTime=null; //定义鼠标按下和松开之间的时间差  
        try{  
            elapsedTime=sdf.parse("00:00:00");//设置elapsedTime初始值为00:00:00，编译时提示可能出现异常，要try一下  
            }  
        catch(Exception e){  
            e.printStackTrace();  
            }  
          
        elapsedTime.setTime(elapsedTime.getTime()+endTime-startTime);  
        String strTime=sdf.format(elapsedTime); //时间差elapsedTime格式化后的字符串就是要在计时器上显示的内容  
        g.fill3DRect(0,0,78,28,true); //设置背景  
        g.setColor(Color.WHITE); //设置字体颜色  
        g.drawString(strTime,10,20); //绘制字符串  
          
        }  
  
    public void run() {  
        // TODO: Add your code here  
        while(bStart){  //循环刷新  
            try{  
                Thread.sleep(500);  //500毫秒刷新一次  
                }  
            catch(Exception e){  
                e.printStackTrace();  
                }  
            endTime=System.currentTimeMillis();  
            repaint();  
            }  
    }  
}  