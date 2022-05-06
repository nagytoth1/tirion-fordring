package progtech.main;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FordringFrame extends JFrame
{
    public static Logger logger;
    public static Connection conn;
    public FordringFrame(){ setupFrame(); }
    private JPanel mainPanel;
    private void setupFrame()
    {
        Image titleImage;
        try {
            titleImage = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("res/icon.bmp")));

        } catch (IOException e) {
            System.out.println(e.getLocalizedMessage());
            return;
        }
        setIconImage(titleImage);
        setTitle("Tirion Fordring");
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setPreferredSize(new Dimension(640, 940));
        setLayout(new BorderLayout());
        JPanel g1 = new GamePanel();
        g1.setPreferredSize(new Dimension(640, 640));
        add(g1);
        pack();
    }
    public static void main(String[] args)
    {
        JFrame main = new FordringFrame();
        main.setVisible(true);
        logger = UtilHelper.Log.initLogger();
        conn = UtilHelper.DBConnection.initConnector();
    }
}
