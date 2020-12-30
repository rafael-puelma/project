package projektval;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class MessageListener implements ActionListener {

	public MessageListener() {

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// System.out.println(e.getActionCommand());

		// if statement to to play the corerct file with the correct incoming comand
		// if the comand that e gets is the same ass the comand from button
		if (e.getActionCommand().equals("cmdBra")) {
			String filebra = "wavfiles/bra.wav";
			playBra(filebra);

		} else if (e.getActionCommand().equals("cmdHao")) {
			String filehao = "wavfiles/hao.wav";
			playBra(filehao);

		} else if (e.getActionCommand().equals("cmdNi")) {
			String fileNi = "wavfiles/ni.wav";
			playBra(fileNi);

		} else if (e.getActionCommand().equals("cmdDu")) {
			String filedu = "wavfiles/du.wav";
			playBra(filedu);

		} else if (e.getActionCommand().equals("cmdNIhaoma")) {
			String filenihaoma = "wavfiles/nihaoma.wav";
			playBra(filenihaoma);

		} else if (e.getActionCommand().equals("cmdHurmardu")) {
			String filehurmardu = "wavfiles/hurmardu.wav";
			playBra(filehurmardu);
		}

	}

	// the method to actually find and play the requested file and with a try and
	// catch if file dose not exist or can be played
	private void playBra(String filePath) {

		try {

			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(new File(filePath)));
			clip.start();

		} catch (Exception exc) {
			System.out.println("The specific audio file is not supported");
		}
	}

}
