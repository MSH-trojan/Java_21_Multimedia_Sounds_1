package audiotest;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.sound.sampled.*;

public class AudioTest extends JFrame{
   public static void main(String [] args) {
      AudioTest app = new AudioTest();
      app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
   }
   public AudioTest() {

    try {
        AudioInputStream a =  AudioSystem.getAudioInputStream(this.getClass().getResource("welcome.wav"));
        Clip clip = AudioSystem.getClip();
        clip.open(a);
        clip.start();
        clip.loop(Clip.LOOP_CONTINUOUSLY);
          } catch (Exception ex) {  ex.printStackTrace();  }

         }  // end AudioTest()
     }  // end class
