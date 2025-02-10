
class Player {
    
    public static void main(String[] args) {
        MediaPlayer audio = new AudioPlayer();
        MediaPlayer video = new VideoPlayer();
        MediaPlayer stream = new StreamingPlayer();
        
        audio.play("Song - Imagine Dragons");
        audio.pause();
        audio.stop();
        System.out.println();
        
        video.play("Movie - Inception");
        video.pause();
        video.stop();
        System.out.println();
        
        stream.play("Stream - Coldplay concert");
        stream.pause();
        stream.stop();
    }
}