package projektval;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class UserInterface implements Runnable {

	private JFrame frame;

	@Override
	public void run() {

		// create new frame with the title "learn chinese"
		frame = new JFrame("Learn chinese");
		frame.setPreferredSize(new Dimension(880, 500));

		// System.out.println("test 1");

		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		// get the instruction frame ???
		playAudio(frame.getContentPane());
		frame.pack();
		frame.setVisible(true);

	}

	public void playAudio(Container container) {
		GridLayout layout = new GridLayout(6, 2);
		container.setLayout(layout);

		JLabel Instructions = new JLabel(
				"Here you can see several audo in chinese with the translation to swedish.");
		container.add(Instructions);
		
		JLabel Instructions2 = new JLabel(" click on wish one you wana hear.");
		container.add(Instructions2);
		
		
		MessageListener click = new MessageListener();

		// button to hear swedish bra
		JButton buttonBra = new JButton("Bra");
		// in setActionCommand we named it Bra, its not connected to the JButton("Bra");
		buttonBra.setActionCommand("cmdBra");
		buttonBra.addActionListener(click);
		container.add(buttonBra);

		// button to hear chinese hao
		JButton buttonHao = new JButton("Hao");
		// in setActionCommand we named it Hao, its not connected to the JButton("Hao");
		buttonHao.setActionCommand("cmdHao");
		buttonHao.addActionListener(click);
		container.add(buttonHao);

		JButton buttonDu = new JButton("Du");
		buttonDu.setActionCommand("cmdDu");
		buttonDu.addActionListener(click);
		container.add(buttonDu);
		
		JButton buttonNi = new JButton("Ni");
		buttonNi.setActionCommand("cmdNi");
		buttonNi.addActionListener(click);
		container.add(buttonNi);

		JButton buttonNihao = new JButton("Ni Hao ma");
		buttonNihao.setActionCommand("cmdNIhaoma");
		buttonNihao.addActionListener(click);
		container.add(buttonNihao);

		JButton buttonHurmardu = new JButton("Hur mår du");
		buttonHurmardu.setActionCommand("cmdHurmardu");
		buttonHurmardu.addActionListener(click);
		container.add(buttonHurmardu);
	}

	public JFrame getFrame() {

		return frame;

	}

}
