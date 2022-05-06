package progtech.main;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

public class GameScreen extends JPanel
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

    public GameScreen()
    {
        this.img = importImg("sprites.png");


    }

    public void paintComponent(Graphics g) //Mindent zöldre egyelőre
    {
        super.paintComponent(g);
        BufferedImage grass = img.getSubimage(32*9,32*0,32,32);

        BufferedImage townhall =  importImg("BTNTownHall.png");
        javax.swing.JButton btnTownHall = new javax.swing.JButton(new ImageIcon(townhall));

        btnTownHall.setSize(32,32);
        btnTownHall.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                TownHallBottomPanel bottom = new TownHallBottomPanel();

                //TownHallBottomPanel meghívása /hozzáadása
            }
        });
        this.add(btnTownHall);
        this.revalidate();
        this.repaint();
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

}
