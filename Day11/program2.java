interface Camera {
    void click();
}

interface MusicPlayer {
    void play();
}

class Smartphone implements Camera, MusicPlayer {
    public void click() {
        System.out.println("Photo captured");
    }

    public void play() {
        System.out.println("Playing music");
    }

    public static void main(String[] args) {
        Smartphone s = new Smartphone();
        s.click();
        s.play();
    }
}
