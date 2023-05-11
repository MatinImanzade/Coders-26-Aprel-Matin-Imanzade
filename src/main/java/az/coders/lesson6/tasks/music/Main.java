package az.coders.lesson6.tasks.music;

public class Main {
    public static void main(String[] args) {
        MusicPlayer jazzMusicPlayer = new JazzMusicPlayer();
        MusicPlayer classicMusicPlayer = new ClassicalMusicPlayer();

        jazzMusicPlayer.play();
        jazzMusicPlayer.pause();
        jazzMusicPlayer.stop();

    }
}
