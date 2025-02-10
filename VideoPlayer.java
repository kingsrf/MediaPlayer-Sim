
class VideoPlayer implements MediaPlayer {
    private String title;
    
    @Override
    public void play(String title) {
        this.title = title;
        System.out.println("Playing video: " + title);
    }
    
    @Override
    public void pause() {
        System.out.println("Video is paused: " + title);
    }
    
    @Override
    public void stop() {
        System.out.println("Video is stopped: " + title);
    }
}