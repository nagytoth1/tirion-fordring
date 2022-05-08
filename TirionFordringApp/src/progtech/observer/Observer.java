package progtech.observer;

public interface Observer //1. tervezési minta
{
    void update(String msg); //pullos, mert a Subject referenciáját kapja meg, bármit lehúzhat
}
