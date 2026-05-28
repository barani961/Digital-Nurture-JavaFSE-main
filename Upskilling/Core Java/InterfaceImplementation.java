public class InterfaceImplementation {
    public static void main(String[] args) {
        Playable myGuitar = new Guitar();
        Playable myPiano = new Piano();
        myGuitar.play();
        myPiano.play();
    }
}

interface Playable {
    void play();
}

class Guitar implements Playable {
    @Override
    public void play() {
        System.out.println("Strumming the guitar strings.");
    }
}

class Piano implements Playable {
    @Override
    public void play() {
        System.out.println("Playing a melody on the piano keys.");
    }
}
