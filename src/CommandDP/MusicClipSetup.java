/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CommandDP;

import Main.Zoo;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class MusicClipSetup {
    public Clip createClip() {
        URL urls = getClass().getResource("/Sound/Zoo.wav");
        AudioInputStream audioInputStream;
        Clip clip = null;
        try {
            audioInputStream = AudioSystem.getAudioInputStream(urls.openStream());
            clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            return clip;
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
            Logger.getLogger(Zoo.class.getName()).log(Level.SEVERE, null, ex);
            return clip;
        }
    }
}
