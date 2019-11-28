package proxy.virtual_proxy;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class ImageProxy implements Icon {
    ImageIcon imageIcon;
    URL imageUrl;
    Thread retrievalThread;
    boolean retrieving = false;

    public ImageProxy(URL imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public int getIconWidth() {
        return imageIcon != null ? imageIcon.getIconWidth() : 800;
    }

    @Override
    public int getIconHeight() {
        return imageIcon != null ? imageIcon.getIconHeight() : 600;
    }

    @Override
    public void paintIcon(Component component, Graphics graphics, int x, int y) {
        if (imageIcon != null) {
            imageIcon.paintIcon(component, graphics, x, y);
        } else {
            graphics.drawString("Loading, please wait...", x + 300, y + 200);
            if (!retrieving) {
                retrieving = true;
                retrievalThread = new Thread(() -> {
                    imageIcon = new ImageIcon(imageUrl, "CD Cover");
                    component.repaint();
                });
                retrievalThread.start();
            }
        }
    }


}
