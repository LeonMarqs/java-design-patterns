package br.com.designpattern.observer.swingExample;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SwingObserverExample extends JFrame {
	private static final long serialVersionUID = 7444171803584788233L;

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					SwingObserverExample frame = new SwingObserverExample();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public SwingObserverExample() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();

		JButton button = new JButton("Should I do it?");

		button.addActionListener(new AngelListener());
		button.addActionListener(new DevilListener());

		contentPane.add(button);
		setContentPane(contentPane);

	}

}
