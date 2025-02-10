
class AudioPlayer implements MediaPlayer {
    private String title;
    
    @Override
    public void play(String title) {
        this.title = title;
        System.out.println("Playing audio: " + title);
    }
    
    @Override
    public void pause() {
        System.out.println("Audio is paused: " + title);
    }
    
    @Override
    public void stop() {
        System.out.println("Audio is stopped: " + title);
    }
}