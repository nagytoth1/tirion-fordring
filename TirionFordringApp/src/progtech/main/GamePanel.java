package progtech.main;

import progtech.AbstractUnitFactory.AllyWarriorFactory;
import progtech.AbstractUnitFactory.AllyWorkerFactory;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.logging.Level;

public class GamePanel extends Panel
{
    public AllyWorkerFactory workerFactory;
    public AllyWarriorFactory warrFactory;
    @Override
    public BufferedImage importImg(String path)
    {
        BufferedImage img = null;
        InputStream imageFile = getClass().getResourceAsStream(path);
        try {
            if(imageFile == null)
            {
                System.out.printf("No image file %s included.\n", path);
                return null;
            }
            img = ImageIO.read(imageFile);
        } catch (IOException e) {
            System.out.println(e.getLocalizedMessage());
        }
        return img;
    }
    private final byte IMAGE_UNIT_SIZE = 32;
    private BufferedImage img;

    public GamePanel()
    {
        this.img = importImg("res/sprites.png");
        setPreferredSize(new Dimension(640,640));
        try {
            workerFactory  = new AllyWorkerFactory();
            warrFactory = new AllyWarriorFactory();
        } catch (SQLException e) {
            FordringFrame.logger.setLevel(Level.WARNING);
            FordringFrame.logger.warning("Error in database..." + e.getLocalizedMessage());
        }
    }
    private  TownHallBottomPanel townHallPanel;
    private void addButtons()
    {
        BufferedImage townHallImg =  importImg("res/BTNTownHall.png");
        if(townHallImg == null)
        {
            FordringFrame.logger.setLevel(Level.WARNING);
            FordringFrame.logger.warning("Given image of town hall does not exist");
            return;
        }
        javax.swing.JButton btnTownHall = new javax.swing.JButton(new ImageIcon(townHallImg));

        btnTownHall.addActionListener(e -> {
            if(townHallPanel == null)
            {
                townHallPanel = new TownHallBottomPanel(this);


                add(townHallPanel, BorderLayout.SOUTH);
                revalidate();
                repaint();
                System.out.println("Townhall megnyomva");
            }
            else
            {
                remove(townHallPanel);
                townHallPanel = null;
                revalidate();
                repaint();
            }
        });
        btnTownHall.setLocation(getWidth() / 2, getHeight() / 2);
        btnTownHall.setSize(IMAGE_UNIT_SIZE*2,IMAGE_UNIT_SIZE*2);
        btnTownHall.setContentAreaFilled(false);
        btnTownHall.setBorderPainted(false);

        this.add(btnTownHall);
    }

    boolean flag = false;
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if(!flag)
        {
            addButtons();
            flag = true;
        }

        BufferedImage grass = img.getSubimage(IMAGE_UNIT_SIZE*9, 0, IMAGE_UNIT_SIZE,IMAGE_UNIT_SIZE);

        int widthUnit = getWidth() / IMAGE_UNIT_SIZE + 1;
        int heigthUnit = getHeight() / IMAGE_UNIT_SIZE + 1;
        for (int j = 0; j < heigthUnit; j++) //sor
        {
            for (int i = 0; i < widthUnit; i++) //oszlop
                g.drawImage(grass, i * IMAGE_UNIT_SIZE, j * IMAGE_UNIT_SIZE, null);
        }
    }
}
