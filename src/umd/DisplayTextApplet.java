package umd;

import java.applet.Applet;
import java.awt.*;

/** Simple: Display a message in a user selected font */

public class DisplayTextApplet extends Applet{
	private Font f;
	private FontMetrics fm;
	
	private String msg;
	public void init(){
		try{
			String fontName = getParameter("fontName");
			if(fontName == null) fontName="TimesRoman";
			int fontSize = Integer.getInteger("fontSize",18).intValue();
			msg = getParameter("message");
			if (msg == null) msg = "Hello World!";
			
			f = new Font(fontName,Font.BOLD,fontSize);
			if (f==null) f = new Font("TimesRoman",Font.BOLD,12);
			setFont(f);
			fm = getFontMetrics(f);			
		}
		catch(Exception e){
			System.out.println("Exception: " + e);
		}
		
	}

	public void paint(Graphics g)
	{
		try {
			Dimension d = size();
			int msgWidth = fm.stringWidth(msg);
			int msgHeight = fm.getAscent() + fm.getDescent();
			int left = (d.width-msgWidth)/2;
			int top = (d.height-msgHeight)/2;
			int baseLine = top + fm.getAscent();
			int bottom = baseLine + fm.getDescent();
			//System.out.println("width = " + msgWidth);
			//System.out.println("height = " + msgHeight);
			g.setColor(Color.red);
			g.drawString(msg, left, baseLine);
			
			g.setColor(Color.blue);
			g.drawLine(left, baseLine, left+msgWidth, baseLine);
			g.drawLine(left, top, left+msgWidth, top);
			g.drawLine(left, bottom, left+msgWidth, bottom);
		}
		catch(Exception e){
			System.out.println("Exception: " + e);
		}	
	}
	
}
