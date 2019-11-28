package proxy.virtual_proxy;

import java.awt.*;

public interface Icon {
    int getIconWidth();
    int getIconHeight();
    void paintIcon(Component component, Graphics graphics, int x, int y);
}
