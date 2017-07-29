package textbox;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class MakeTextBox{

	public static void main(String[] args) {
		Dimension dim = new Dimension(400, 150);
		
		JFrame frame = new JFrame("test");
		frame.setLocation(200, 400);
		frame.setPreferredSize(dim);
		
		JPanel panel1 = new JPanel();
		panel1.setLayout(new BoxLayout(panel1, BoxLayout.X_AXIS));
		panel1.add(new JLabel("코드를 입력하세요."));
		
		JPanel panel2 = new JPanel();
		JTextArea textArea = new JTextArea(20, 10);
		panel2.setLayout(new BoxLayout(panel2, BoxLayout.X_AXIS));
		panel2.add(new JScrollPane(textArea));
		
		JPanel main = new JPanel();
		main.setLayout(new BoxLayout(main, BoxLayout.Y_AXIS));
		main.add(panel1);
		main.add(panel2);
		
		frame.add(main, BorderLayout.CENTER);
		frame.pack();
		frame.setVisible(true);
	}

}
