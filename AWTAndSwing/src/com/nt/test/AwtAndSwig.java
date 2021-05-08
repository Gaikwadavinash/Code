package com.nt.test;
import java.awt.*;
public class AwtAndSwig extends Frame
{
Signal s1;
int flag=0;
public AwtAndSwig()
{
s1=new Signal();
s1.start();
setSize(400,400);
setVisible(true);
}
public void paint(Graphics g)
{
switch(flag)
{
case 0:
g.setColor(Color.RED);
g.fillOval(50,50,50,50);
g.setColor(Color.ORANGE);
g.fillOval(50,120,50,50);
g.fillOval(50,190,50,50);
break;
case 1:
g.setColor(Color.YELLOW);
g.fillOval(50,120,50,50);
g.setColor(Color.ORANGE);
g.fillOval(50,50,50,50);
g.fillOval(50,190,50,50);
break;
case 3:
g.setColor(Color.GREEN);
g.fillOval(50,190,50,50);
g.setColor(Color.ORANGE);
g.fillOval(50,120,50,50);
g.fillOval(50,50,50,50);
break;
}
}
class Signal extends Thread
{
public void run()
{
while(true)
{
flag=(flag+1)%3;
try
{
Thread.sleep(1100);
}catch(Exception e){}
repaint();
}
}
}
public static void main(String args[])
{
AwtAndSwig ss=new AwtAndSwig();
}
}