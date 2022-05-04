package progtech.main;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class GameScreen extends JPanel
{
    private Random random;
    public GameScreen()
    {
        random = new Random();
    }
    public void paintComponent(Graphics g) //Mindent zöldre egyelőre
    {
        super.paintComponent(g);

        g.setColor(new Color(0,154,23));
        for (int j = 0; j < 16; j++)
        {
            for (int i = 0; i<16;i++)
            {
                g.fillRect(i*80,j*80,80,80);
            }
        }




    }
}
