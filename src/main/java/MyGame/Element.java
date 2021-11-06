//źródło : https://mmazurek.dev/java-swing-kolko-i-krzyzyk/

package MyGame;

import javax.swing.*;
import java.awt.*;

public class Element extends JButton {

    int stan=0;
    public Element() {
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        if(stan == 1)
        {
            g.drawLine((getWidth()/4), (getHeight()/4), (getWidth()-(getWidth()/4)), (getHeight()-(getHeight()/4)));
            g.drawLine((getWidth()-(getWidth()/4)), (getHeight()/4), (getWidth()/4), (getHeight()-(getHeight()/4)));
            //g.drawLine(5, 5, 90, 85);
            //g.drawLine(90, 5, 5, 85);
        }
        else if(stan==2)
        {
            g.drawOval((getWidth()/4), (getHeight()/4), (getWidth()/2), (getHeight()/2));
            //g.drawOval(10, 10, 75, 70);
        }
    }


}