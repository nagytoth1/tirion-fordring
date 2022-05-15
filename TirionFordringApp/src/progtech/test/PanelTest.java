package progtech.test;

import org.junit.jupiter.api.Test;
import progtech.main.GamePanel;
import progtech.main.Panel;
import progtech.main.TownHallBottomPanel;

import javax.swing.*;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class PanelTest {

    private Panel panel = new GamePanel();







    @Test
    void importImg()
    {
        assertThrows(NullPointerException.class,
                () -> panel.importImg(null));
    }
}