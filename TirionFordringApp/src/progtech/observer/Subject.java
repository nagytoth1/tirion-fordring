package progtech.observer;

public interface Subject
{
    //operator overloading lehetne a 2 metódus helyett egy absztrakt osztályban, de ezt a Java nem támogatja
    void setObserver(Observer o);
    void deleteObserver();
    void notifyObserver();
}
