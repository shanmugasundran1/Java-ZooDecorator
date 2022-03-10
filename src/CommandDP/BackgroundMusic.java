package CommandDP;

import javax.sound.sampled.Clip;

public class BackgroundMusic {

    Clip musicClip;

    
    StopMusic stopMusic;
    PlayMusic playMusic;
    
    public BackgroundMusic(Clip musicClip) {
        this.musicClip = musicClip;

    }
    
    public void playMusic() {
    	musicClip.start();
    	musicClip.loop(Clip.LOOP_CONTINUOUSLY);
    }

    public void stopMusic() {
    	musicClip.stop();
    }
}
