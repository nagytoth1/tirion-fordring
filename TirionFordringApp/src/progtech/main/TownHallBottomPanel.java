package progtech.main;

import progtech.AbstractUnitFactory.AllyWarriorFactory;
import progtech.AbstractUnitFactory.AllyWorkerFactory;
import progtech.entities.AllyWarrior;
import progtech.entities.Player;
import progtech.observer.AchievementHandler;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.sql.SQLException;
import java.util.Timer;

public class TownHallBottomPanel extends Panel
{
    private static Player currentPlayer = FordringFrame.p;
    private BufferedImage img;
    private GamePanel panel;
    private final byte IMAGE_UNIT_SIZE = 32;
    private AllyWorkerFactory peasant;
    private AllyWarriorFactory knight;
    private JLabel l1;
    private Timer timer;
    public TownHallBottomPanel(GamePanel panel)
    {
        setVisible(true); //elhelyezést kéne beállítani hogy a képernyő alján legyen
        setBackground(new Color(108, 103, 86));
       /* setPreferredSize(new Dimension(240, 85));*/
        setPreferredSize(new Dimension(640, 85));
        this.panel = panel;
        addPeasant();
        addKnight();
        try
        {
            peasant = new AllyWorkerFactory();
            knight = new AllyWarriorFactory();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        l1 = new JLabel("", JLabel.RIGHT);

        currentPlayer = new Player(new AchievementHandler(l1));
        setLayout(new FlowLayout());
        l1.setVisible(true);



        add(l1);

    }
    private int peasantCounter = 1;
    private void addPeasant()
    {
        BufferedImage peasant =  importImg("res/peasant.bmp");
        btnPeasant = new javax.swing.JButton(new ImageIcon(peasant));

        btnPeasant.addActionListener(e -> {
            //MEGHÍVNI A FACTORY-t
            revalidate();
            repaint();

            try
            {
                currentPlayer.addUnit( panel.workerFactory.CreateUnit());
                System.out.printf("%d. munkás legyártva: \"Something need doin'?\"\n", peasantCounter);
                peasantCounter++;

            }
            catch (Exception ex)
            {
                System.out.println("Nem tudsz több egységet gyártani");

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
        BufferedImage knightImg =  importImg("res/knight.bmp");
        btnKnight = new javax.swing.JButton(new ImageIcon(knightImg));
        btnKnight.addActionListener(e -> {

            revalidate();
            repaint();
            try
            {
                currentPlayer.addUnit(panel.warrFactory.CreateUnit());
                System.out.printf("%d. harcos legyártva: \"For the Alliance!\"\n", knightCounter);
                knightCounter++;

            }
            catch (Exception ex)
            {
                System.out.println("Nem tudsz több egységet gyártani!");

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
    private JFrame mainFrame;
}
