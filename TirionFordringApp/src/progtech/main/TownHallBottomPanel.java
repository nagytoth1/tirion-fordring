package progtech.main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

public class TownHallBottomPanel extends Panel
{
    private BufferedImage img;
    private final byte IMAGE_UNIT_SIZE = 32;
    public TownHallBottomPanel()
    {
        setBackground(new Color(255,248,220));
       /* setLocation(-100,-100);*/
        setPreferredSize(new Dimension(640, 100));
        setVisible(true); //elhelyezést kéne beállítani hogy a képernyő alján legyen
        addButtons();
    }
    private int i=1;
    private void addButtons()
    {

        BufferedImage peon =  importImg("res/icon.bmp");
        javax.swing.JButton btnPeon = new javax.swing.JButton(new ImageIcon(peon));

       /* btnTownHall.addActionListener(e -> {
            //Ide kell meghívni a másik panelt

            System.out.println("CSO");

        });*/
        btnPeon.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                peonBTNPanel peonbtn = new peonBTNPanel();
                add(peonbtn);
                revalidate();
                repaint();
                System.out.println(i+ "."  +"Peon legyártva");
                i++;
            }
        });
        btnPeon.setLocation(getWidth() / 2, getHeight() / 2);
        btnPeon.setSize(IMAGE_UNIT_SIZE*2,IMAGE_UNIT_SIZE*2);
        btnPeon.setContentAreaFilled(false);
        btnPeon.setBorderPainted(false);

        this.add(btnPeon);
    }

}
