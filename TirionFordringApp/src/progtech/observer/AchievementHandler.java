package progtech.observer;

import javax.swing.*;

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
        this.component.setText(message);
    }

}
