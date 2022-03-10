/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CommandDP;

public class MusicManager {
    Command command;

    public MusicManager() {
        
    }
    public void setCommand(Command command){
        this.command = command;
    }
    public void buttonWasPressed(){
    	command.play();
    }
    
}
