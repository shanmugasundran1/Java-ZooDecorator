/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CommandDP;

public class StopMusic implements Command {
	BackgroundMusic backgroundMusic;
    
    public StopMusic(BackgroundMusic backgroundMusic) {
        this.backgroundMusic = backgroundMusic;
    }

    @Override
    public void play() {
    	backgroundMusic.stopMusic();
    }
}
