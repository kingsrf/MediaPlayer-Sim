
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MediaPlayerTest {
    
    // Normal cases
    
    @Test
    public void testAudioPlayer() {
        MediaPlayer audio = new AudioPlayer();
        assertDoesNotThrow(() -> audio.play("Song - Imagine Dragons"));
        assertDoesNotThrow(audio::pause);
        assertDoesNotThrow(audio::stop);
    }

    @Test
    public void testVideoPlayer() {
        MediaPlayer video = new VideoPlayer();
        assertDoesNotThrow(() -> video.play("Movie - Inception"));
        assertDoesNotThrow(video::pause);
        assertDoesNotThrow(video::stop);
    }

    @Test
    public void testStreamingPlayer() {
        MediaPlayer stream = new StreamingPlayer();
        assertDoesNotThrow(() -> stream.play("Live Concert - Coldplay"));
        assertDoesNotThrow(stream::pause);
        assertDoesNotThrow(stream::stop);
    }
    
    // Edge cases

    @Test
    public void testAudioPlayerEdge() {
        MediaPlayer audio = new AudioPlayer();
        assertDoesNotThrow(() -> audio.play("")); // Empty string case
        assertDoesNotThrow(audio::pause);
        assertDoesNotThrow(audio::stop);
    }

    @Test
    public void testVideoPlayerEdge() {
        MediaPlayer video = new VideoPlayer();
        assertDoesNotThrow(() -> video.play(null)); // Null title case
        assertDoesNotThrow(video::pause);
        assertDoesNotThrow(video::stop);
    }

    @Test
    public void testStreamingPlayerEdge() {
        MediaPlayer stream = new StreamingPlayer();
        assertDoesNotThrow(() -> stream.play("A very very very long title exceeding usual limits to test boundary cases")); // Long title case
        assertDoesNotThrow(stream::pause);
        assertDoesNotThrow(stream::stop);
    }
}
