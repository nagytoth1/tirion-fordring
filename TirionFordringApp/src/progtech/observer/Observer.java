package progtech.observer;

public interface Observer //1. tervezési minta
{
    void update(Subject s); //pullos, mert a Subject referenciáját kapja meg, bármit lehúzhat
}
