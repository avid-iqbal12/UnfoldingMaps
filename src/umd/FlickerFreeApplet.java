package umd;

import java.applet.Applet;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Graphics;
import java.awt.Color;

public class FlickerFreeApplet extends Applet {
    private Image     offscreenImage;
    private Graphics  offscreenGraphics;
    private Dimension offscreenDimension;
    protected boolean cancelRedraw;

    public FlickerFreeApplet() {
        offscreenImage = null;
        offscreenGraphics = null;
        offscreenDimension = null;
    }

    public final void update(Graphics g)  {
        Dimension d = size();
        // in Java 1.0.2, equals is not defined for Dimension
        // this is fixed for 1.1, but we will cope with 1.0.2
        if (offscreenImage == null || 
            d.width != offscreenDimension.width
            || d.height != offscreenDimension.height) {
            offscreenDimension = d;
            offscreenImage = createImage(offscreenDimension.width,offscreenDimension.height);
            offscreenGraphics = offscreenImage.getGraphics();
        };

        offscreenGraphics.setColor(getBackground());
        offscreenGraphics.fillRect(0,0,offscreenDimension.width,offscreenDimension.height);
        offscreenGraphics.setColor(getForeground());
        offscreenGraphics.setFont(getFont());
	if (offscreenGraphics == null) 
		System.out.println("Offscreen graphics is null!");
	cancelRedraw = false;
        this.paint(offscreenGraphics);
	if (!cancelRedraw) g.drawImage(offscreenImage,0,0,this);
    }

}