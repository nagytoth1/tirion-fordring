package progtech.main;

import progtech.entities.Player;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

public class TownHallBottomPanel extends Panel
{
    private static Player currentPlayer = FordringFrame.p;
    private BufferedImage img;
    private final byte IMAGE_UNIT_SIZE = 32;
    public TownHallBottomPanel()
    {
        setBackground(new Color(108, 103, 86));
        //setLocation(0, getWidth());
        setLayout(new FlowLayout(FlowLayout.CENTER));
        setPreferredSize(new Dimension(640, 100));

        setVisible(true); //elhelyezést kéne beállítani hogy a képernyő alján legyen
        addPeasant();
        addKnight();
    }
    private int peasantCounter = 1;
    private void addPeasant()
    {
        BufferedImage peasant =  importImg("res/peasant.bmp");
        btnPeasant = new javax.swing.JButton(new ImageIcon(peasant));
        btnPeasant.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                unitBtn = new UnitBTNPanel();
                add(unitBtn);
                revalidate();
                repaint();
                System.out.printf("%d munkás legyártva: \"Something need doin'?\"\n", peasantCounter);
                peasantCounter++;
            }
        });
        btnPeasant.setLocation(getWidth() / 2, getHeight() / 2);
        btnPeasant.setSize(IMAGE_UNIT_SIZE*2,IMAGE_UNIT_SIZE*2);
        btnPeasant.setContentAreaFilled(false);
        btnPeasant.setBorderPainted(false);

        this.add(btnPeasant);
    }
    private int knightCounter = 1;
    private void addKnight()
    {
        BufferedImage knight =  importImg("res/knight.bmp");
        btnKnight = new javax.swing.JButton(new ImageIcon(knight));
        btnKnight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UnitBTNPanel knightbtn = new UnitBTNPanel();
                add(knightbtn);
                revalidate();
                repaint();
                System.out.printf("%d harcos legyártva: \"For the Alliance!?\"\n", knightCounter);
                knightCounter++;
            }
        });
        btnKnight.setLocation(getWidth() / 2, getHeight() / 2);
        btnKnight.setSize(IMAGE_UNIT_SIZE*2,IMAGE_UNIT_SIZE*2);
        btnKnight.setContentAreaFilled(false);
        btnKnight.setBorderPainted(false);

        this.add(btnKnight);
    }
    //Components
    private JButton btnKnight;
    private JButton btnPeasant;
    private UnitBTNPanel unitBtn;
}
