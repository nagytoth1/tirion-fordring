package progtech.main;

import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.util.logging.Logger;

public class FordringFrame extends JFrame
{
    public FordringFrame()
    {
        mainScreenBasic();
    }
    private JPanel mainPanel;

    private void mainScreenBasic()
    {
        setTitle("WOW");

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(640, 640));
        setResizable(false);
        setSize(new java.awt.Dimension(640, 640));

        GameScreen gameScreen = new GameScreen();
        setLayout(new BorderLayout());
        setContentPane(gameScreen);
      /*  add(gameScreen,BorderLayout.CENTER);*/

        pack();
    }

    private static JFrame setupFrame()
    {
        JFrame frame = new FordringFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true);
        return frame;
    }
    public static void main(String[] args)
    {
        JFrame main = setupFrame();
        Logger l = UtilHelper.Log.initLogger();
        Connection conn = UtilHelper.DBConnection.initConnector();
    }
}
