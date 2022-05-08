package progtech.main;

import progtech.AbstractUnitFactory.AllyWarriorFactory;
import progtech.AbstractUnitFactory.AllyWorkerFactory;
import progtech.entities.Player;
import progtech.observer.AchievementHandler;
import progtech.observer.Observer;
import progtech.observer.Subject;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.sql.Connection;
import java.util.Objects;
import java.util.logging.Logger;

public class FordringFrame extends JFrame
{
    public static Logger logger;
    public static Player p;
    public static Connection conn;
    private JPanel mainPanel;

    public FordringFrame(){ setupFrame(); }

    private void setupFrame()
    {
        logger = UtilHelper.Log.initLogger();
        conn = UtilHelper.DBConnection.initConnector();
        p = new Player();
        p.setObserver(new AchievementHandler(l1));
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
        setPreferredSize(new Dimension(640, 640));

        setLayout(new BorderLayout());

        mainPanel = new GamePanel();
        add(mainPanel);

        pack();
        setLocationRelativeTo(null);
    }

    public static void main(String[] args)
    {
        new FordringFrame().setVisible(true);
    }

    //components in Frame
    private JLabel l1;
    private JPanel g1;
}

