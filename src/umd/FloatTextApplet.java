package umd;

import java.applet.Applet;
import java.awt.*;

/** Simple animation program */

public class FloatTextApplet extends FlickerFreeApplet implements Runnable {
	private Font f;
	private FontMetrics fm;
	
	private String msg;
	private int msgWidth, msgHeight;
	private Dimension d;
	private int ascent;
	
	private double x, y, dx, dy, mx, my;
	
	boolean die = false;
	public void init(){
		String fontName = getParameter("fontName");
		if(fontName == null) fontName="TimesRoman";
		System.out.println("Font: " + fontName);
		int fontSize = Integer.getInteger("fontSize",18).intValue();
		System.out.println("Fontsize: " + fontSize);
		msg = getParameter("message");
		if (msg == null) msg="Hello World!";
		System.out.println("msg: "+ msg);
		
		f = new Font(fontName,Font.BOLD,fontSize);
		setFont(f);
		System.out.println("font : " + f);
		fm = getFontMetrics(f);
		msgWidth= fm.stringWidth(msg);
		ascent = fm.getAscent();
		msgHeight = ascent + fm.getDescent();
		d = size();
		
		mx = d.width - msgWidth;
		my = d.height - msgHeight;
		x = Math.random() * mx;
		y = Math.random() * my;
		
		dx = Math.random() * 6 -3;
		dy = Math.random() * 6 -3;
		new Thread(this).start();		
	}
	
	public void run(){
		while(!die){
			try { Thread.sleep(150);}
			catch (InterruptedException e){ };
			synchronized(this){
				d = size();
				
				mx = d.width - msgWidth;
				my = d.height - msgHeight;
				x += dx;
				y += dy;
				dy += 0.1;
				if(x<0){
					x = -x;
					dx = -dx + Math.random()*2-1;
				}
				else if(x>mx){
					x = 2*mx-x;
					dx = -dx + Math.random()*2-1;
				}
				if(y<0){
					y = -y;
					dy = -dy + Math.random()*2-1;
				}
				else if(y>my){
					y = 2*my-y;
					dy = -dy + Math.random()*2-1;
				}
				repaint();
			}		
		}		
	}

	public void destroy() {
		die = true;
	}
	public synchronized void paint(Graphics g){
		g.setColor(Color.red);
		g.drawString(msg, (int) x, (int) y + ascent); 
	}
	
}
