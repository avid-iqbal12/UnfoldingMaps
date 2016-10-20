package umd;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

/*Simple drawing package - leaves a trail of red dots when mouse clicked or dragged*/

public class Draw extends Applet{
	Vector dotsToDraw = new Vector();
	public void init(){
		MouseListener m = new MouseAdapter(){
			public void mousePressed(MouseEvent e){
				dotsToDraw.addElement(e.getPoint());
				repaint();
			}
		};
		addMouseListener(m);
		MouseMotionListener mm = new MouseMotionAdapter(){
			public void mouseDragged(MouseEvent e){
				dotsToDraw.addElement(e.getPoint());
				repaint();
			}			
		};
		addMouseMotionListener(mm);
	}

	public void update(Graphics g){
		paint(g);
	}
	
	public void paint(Graphics g){
		g.setColor(Color.red);
		Enumeration e = dotsToDraw.elements();
		while(e.hasMoreElements()){
			Point p = (Point) e.nextElement();
			g.fillOval(p.x-2, p.y-5, 5, 5);
		}	
	}
}