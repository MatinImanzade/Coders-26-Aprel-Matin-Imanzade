package az.coders.lesson6.tasks.music;

public class JazzMusicPlayer implements MusicPlayer{
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

    public void playJazzMusic(){
        System.out.println("Jazz Music Play");
    }
}
