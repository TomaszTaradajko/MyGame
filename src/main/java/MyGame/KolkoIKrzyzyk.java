//źródło : https://mmazurek.dev/java-swing-kolko-i-krzyzyk/

package MyGame;

import javax.swing.*;
import java.awt.*;

public class KolkoIKrzyzyk extends JFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        KolkoIKrzyzyk kik = new KolkoIKrzyzyk();
        kik.setMinimumSize(new Dimension(400, 400));
        kik.setDefaultCloseOperation(EXIT_ON_CLOSE);
        kik.setResizable(false);
        kik.setTitle("Gra w Kółko i Krzyzyk");
        JPanel plansza = new JPanel();
        plansza.setLayout(new GridLayout(4,4));
        Element a[][]= new Element[4][4];
        int wyniki[][]= new int[4][4];
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                a[i][j]= new Element();
                wyniki[i][j]=0;
            }
        }
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                a[i][j].addActionListener(new ElementsListener(a, wyniki, plansza));
                plansza.add(a[i][j]);
            }
        }

        kik.add(plansza);
        kik.setVisible(true);
    }
}
