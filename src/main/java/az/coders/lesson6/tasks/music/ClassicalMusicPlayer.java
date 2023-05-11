package az.coders.lesson6.tasks.music;

public class ClassicalMusicPlayer implements MusicPlayer {
    @Override
    public void play() {
        System.out.println("Music is playing");
    }

    @Override
    public void pause() {
        System.out.println("Music was pause");
    }

    @Override
    public void stop() {
        System.out.println("Music was stoped");
    }

    public void playClassicMusic(){
        System.out.println("Classic Music Play");
    }
}
