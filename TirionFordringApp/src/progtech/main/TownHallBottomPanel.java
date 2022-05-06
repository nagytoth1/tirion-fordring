package progtech.main;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.Random;

public class TownHallBottomPanel extends JPanel
{
    private BufferedImage img;

    private BufferedImage importImg(String path)
    {
        BufferedImage img = null;
        InputStream is = getClass().getResourceAsStream(path);
        try {
            img = ImageIO.read(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return img;
    }

    public TownHallBottomPanel()
    {
       /* this.img = importImg("sprites.png");*/


    }

    public void paintComponent(Graphics g) //Mindent zöldre egyelőre
    {
        super.paintComponent(g);
        g.setColor(new Color(255,248,220));
        g.fillRect(0,640-100,640,100);
/*
        BufferedImage peon =  importImg("BTNTownHall.png");
        javax.swing.JButton btnTownHall = new javax.swing.JButton(new ImageIcon(peon));

        btnTownHall.setSize(32,32);
        btnTownHall.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                System.out.println("CSŐ");
            }
        });
        this.add(btnTownHall);
        this.revalidate();
        this.repaint();*/



       /* g.drawImage(peon, i * 32, j * 32, null);
        btnTownHall.setLocation(i * 32,j * 32);*/






    }

}
