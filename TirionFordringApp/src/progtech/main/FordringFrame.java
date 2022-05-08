package progtech.main;

import progtech.entities.Player;
import progtech.observer.Observer;
import progtech.observer.Subject;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FordringFrame extends JFrame implements Observer
{
    public static Logger logger;
    public static Player p;
    public static Connection conn;

    public FordringFrame(){ setupFrame(); }

    private void setupFrame()
    {
        Image titleImage;
        try {
            titleImage = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("res/knight.bmp")));

        } catch (IOException e) {
            System.out.println(e.getLocalizedMessage());
            return;
        }
        setIconImage(titleImage);
        setTitle("Tirion Fordring");
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setPreferredSize(new Dimension(640, 640));
        setLayout(new BorderLayout());

        g1 = new GamePanel();
        g1.setPreferredSize(new Dimension(640,640));
        add(g1);

        l1 = new JLabel();
        l1.setText("Üdvözlöm");
        l1.setSize(50, 50);
        add(l1);
        pack();
        p = new Player();
        logger = UtilHelper.Log.initLogger();
        conn = UtilHelper.DBConnection.initConnector();
    }

    public static void main(String[] args)
    {
        new FordringFrame().setVisible(true);
    }
    @Override
    public void update(Subject s) {
        if(!(s instanceof Player)) { logger.warning("User does not exist!"); return; }
        Player p = (Player) s;
        if(p.getSumGold() >= 500) l1.setText("500 Gold elköltve!");
    }

    //components in Frame
    private JLabel l1;
    private JPanel g1;
}

