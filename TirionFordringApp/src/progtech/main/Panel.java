package progtech.main;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;

public abstract class Panel extends JPanel {
    protected BufferedImage importImg(String path)
    {
        BufferedImage img = null;
        InputStream imageFile = getClass().getResourceAsStream(path);
        try {
            if(imageFile == null)
            {
                System.out.println("No image file included.");
                return null;
            }
            img = ImageIO.read(imageFile);
        } catch (IOException e) {
            System.out.println(e.getLocalizedMessage());
        }
        return img;
    }
}
