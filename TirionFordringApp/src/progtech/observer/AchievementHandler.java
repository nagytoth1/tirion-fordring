package progtech.observer;

import javax.swing.*;
import java.util.Timer;
import java.util.TimerTask;

public class AchievementHandler implements Observer
{
    private JLabel component;
    public AchievementHandler(JLabel l)
    {
        this.component = l;
    }
    @Override
    public void update(String message)
    {
        if(this.component == null)
        {
            return;
        }

        this.component.setText(message);
        Timer t = new Timer();
        t.schedule(new TimerTask() {

            @Override
            public void run() {
                component.setText("");
            }
        }, 2000, 2000);
    }

}
