package progtech.main;

import progtech.AbstractUnitFactory.AllyWorkerFactory;

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
        setLayout(new FlowLayout(FlowLayout.CENTER));
        setPreferredSize(new Dimension(640, 100));

        setVisible(true); //elhelyezést kéne beállítani hogy a képernyő alján legyen
        addPeasant();
        addKnight();
    }
    private int i=1;
    private void addPeasant()
    {

        BufferedImage peasant =  importImg("res/peasant.bmp");
        javax.swing.JButton btnPeasant = new javax.swing.JButton(new ImageIcon(peasant));


       /* btnTownHall.addActionListener(e -> {
            //Ide kell meghívni a másik panelt

            System.out.println("CSO");

        });*/
        btnPeasant.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UnitBTNPanel peonbtn = new UnitBTNPanel();
                add(peonbtn);
                revalidate();
                repaint();
                System.out.println(i+ "."  +"Munkás legyártva");
                i++;
            }
        });
        btnPeasant.setLocation(getWidth() / 2, getHeight() / 2);
        btnPeasant.setSize(IMAGE_UNIT_SIZE*2,IMAGE_UNIT_SIZE*2);
        btnPeasant.setContentAreaFilled(false);
        btnPeasant.setBorderPainted(false);

        this.add(btnPeasant);
    }
    private int j=1;
    private void addKnight()
    {

        BufferedImage knight =  importImg("res/knight.bmp");
        javax.swing.JButton btnKnight = new javax.swing.JButton(new ImageIcon(knight));


           /* btnTownHall.addActionListener(e -> {
                //Ide kell meghívni a másik panelt

                System.out.println("CSO");

            });*/
        btnKnight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UnitBTNPanel knightbtn = new UnitBTNPanel();
                add(knightbtn);
                revalidate();
                repaint();
                System.out.println(j+ "."  +"Lovag legyártva");
                j++;
            }
        });
        btnKnight.setLocation(getWidth() / 2, getHeight() / 2);
        btnKnight.setSize(IMAGE_UNIT_SIZE*2,IMAGE_UNIT_SIZE*2);
        btnKnight.setContentAreaFilled(false);
        btnKnight.setBorderPainted(false);

        this.add(btnKnight);
    }

}
