import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
public class MainSound { // Introducir un .wav llamado primavera
    public static void main(String args[]) {
        try {
            AudioInputStream audioInput = AudioSystem.getAudioInputStream(
                    new File("primavera.wav"));
            Clip clip = AudioSystem.getClip();
            clip.open(audioInput);
            clip.start();
        } catch(Exception ex) {
            System.out.println("Error playing sound.");
            ex.printStackTrace();
        }
    }
}
