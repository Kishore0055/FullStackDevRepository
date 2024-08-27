package polymorphism;

class Instrument 
{
    void play() 
    {
        System.out.println("Making music");
    }
}
class Guitar extends Instrument 
{
    void play() 
    {
        System.out.println("Strumming...Guitar");
    }
}
class Piano extends Instrument 
{
    void play() 
    {
        System.out.println("Playing keys...Piano");
    }
}
class Drums extends Instrument
{
    void play() 
    {
        System.out.println("Beating...Drums");
    }
}
public class MusicInstruments 
{
    public static void main(String[] args) 
    {
        Instrument guitar = new Guitar();
        guitar.play();

        Instrument piano = new Piano();
        piano.play();

        Instrument drums = new Drums();
        drums.play();
    }
}