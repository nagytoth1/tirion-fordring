package progtech.main;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Random;

public class GameScreen extends JPanel
{
    private Random random;
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

    public GameScreen()
    {
        this.img = importImg("sprites.png");

        random = new Random();
    }

    public void paintComponent(Graphics g) //Mindent zöldre egyelőre
    {
        super.paintComponent(g);
        BufferedImage grass = img.getSubimage(32*9,32*0,32,32);

        BufferedImage townhall =  importImg("BTNTownHall.png");
        javax.swing.JButton btnTownHall = new javax.swing.JButton(new ImageIcon(townhall));
        btnTownHall.setSize(32,32);
        btnTownHall.addKeyListener(new java.awt.event.KeyAdapter()
    {
        public void keyPressed(java.awt.event.KeyEvent evt)
        {
            btnTownHallPressed(evt);
        }
    });
        for (int j = 0; j < 20; j++) //sor
        {
            for (int i = 0; i<20;i++) //oszlop
            {
                if(i == 9 && j == 9)
                {
                    g.drawImage(townhall, i * 32, j * 32, null);
                    btnTownHall.setLocation(i * 32,j * 32);
                }
                else
                {
                    g.drawImage(grass, i * 32, j * 32, null);
                }
            }
        }
    }
    public void btnTownHallPressed(java.awt.event.KeyEvent evt)
    {
        System.out.println("Szevasz");
    }
}
