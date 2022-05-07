package progtech.main;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

public class peonBTNPanel extends Panel
{
    public peonBTNPanel()
    {
        BufferedImage townhall = importImg("res/icon.bmp");
        javax.swing.JButton btnTownHall = new javax.swing.JButton(new ImageIcon(townhall));
        btnTownHall.addActionListener(e -> {
            //Ide kell meghívni a másik panelt

            System.out.println("CSO");

        });
        setLocation(0,0);
        setPreferredSize(new Dimension(640, 100));
        setVisible(true);
    }
}
