package progtech.main;

import progtech.AbstractUnitFactory.AllyWarriorFactory;
import progtech.AbstractUnitFactory.AllyWorkerFactory;
import progtech.entities.AllyWarrior;
import progtech.entities.Player;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

public class TownHallBottomPanel extends Panel
{
    private static Player currentPlayer = FordringFrame.p;
    private BufferedImage img;
    private GamePanel panel;
    private final byte IMAGE_UNIT_SIZE = 32;
    public TownHallBottomPanel(GamePanel panel)
    {
        setVisible(true); //elhelyezést kéne beállítani hogy a képernyő alján legyen
        setBackground(new Color(108, 103, 86));
        setPreferredSize(new Dimension(240, 85));
        this.panel = panel;
        addPeasant();
        addKnight();

    }
    private int peasantCounter = 1;
    private void addPeasant()
    {
        BufferedImage peasant =  importImg("res/peasant.bmp");
        btnPeasant = new javax.swing.JButton(new ImageIcon(peasant));

        btnPeasant.addActionListener(e -> {
            revalidate();
            repaint();
            panel.workerFactory.CreateUnit();
            System.out.printf("%d. munkás legyártva: \"Something need doin'?\"\n", peasantCounter);
            peasantCounter++;
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
        BufferedImage knightImg =  importImg("res/knight.bmp");
        btnKnight = new javax.swing.JButton(new ImageIcon(knightImg));
        btnKnight.addActionListener(e -> {
            revalidate();
            repaint();
            panel.warrFactory.CreateUnit();
            System.out.printf("%d. harcos legyártva: \"For the Alliance!\"\n", knightCounter);
            knightCounter++;
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
    private JFrame mainFrame;
}
