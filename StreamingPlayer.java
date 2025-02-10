
class StreamingPlayer implements MediaPlayer {
    private String title;
    
    @Override
    public void play(String title) {
        this.title = title;
        System.out.println("Playing stream: " + title);
    }
    
    @Override
    public void pause() {
        System.out.println("Stream is paused: " + title);
    }
    
    @Override
    public void stop() {
        System.out.println("Stream is stopped: " + title);
    }
}