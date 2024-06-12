/*<applet code="Drawing4" Height="300" Width="500"></applet>*/
import java.awt.*;
import java.applet.*;
public class Drawing4 extends Applet
{
	public void paint(Graphics g)
	{
//		g.drawLine(0,0,250,300);
//		g.drawLine(250,300,300,0);
		g.drawLine(0,0,getWidth(),getHeight());
		g.drawLine(getWidth(),getHeight(),0,0);
//		g.drawLine(getWidth()/2,getHeight()/2,getWidth(),getHeight);
		g.drawLine(0,getHeight(),getWidth(),getHeight());
	}	
}
