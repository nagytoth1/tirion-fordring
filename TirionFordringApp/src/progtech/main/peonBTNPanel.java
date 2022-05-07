package progtech.main;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

public class peonBTNPanel extends Panel
{
    public peonBTNPanel()
    {
        BufferedImage townhall = importImg("res/icon.bmp");
        javax.swing.JButton btnTownHall = new javax.swing.JButton(new ImageIcon(townhall));


        setLocation(0,0);
        setPreferredSize(new Dimension(640, 100));
        setVisible(true);
    }
}
