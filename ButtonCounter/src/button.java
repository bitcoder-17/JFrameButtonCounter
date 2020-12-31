import javax.swing.*;
import java.awt.event.*;
public class button {
	
	
	public static class ButtonCounting extends JFrame implements ActionListener {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		JFrame frame = new JFrame("Button Counter");
		JButton button1 = new JButton("+1");
		JButton button2 = new JButton("-1");
		JLabel counter = new JLabel("Count: ");
		JLabel display = new JLabel("0");
		int count = 0;
		
		public ButtonCounting() {
			frame.setSize(500, 500);
			button1.setBounds(100, 200, 150, 50);
			button1.addActionListener(this);
			button2.setBounds(250, 200, 150, 50);
			button2.addActionListener(this);
			counter.setBounds(150, 50, 50, 50);
			display.setBounds(350, 50, 50, 50);
			frame.add(button1);
			frame.add(button2);
			frame.add(counter);
			frame.add(display);
			frame.setLayout(null);
			frame.setVisible(true);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			Object obj = e.getSource();
			if (obj == button1) {
				count++;
				display.setText(Integer.toString(count));
			} else if (obj == button2) {
				if (count > 0) {
					count--;
					display.setText(Integer.toString(count));
				} else if (count < 0) {
					display.setText("0");
				}

			}
		}
	}
	
	public static void main(String[] args) {
		ButtonCounting counter = new ButtonCounting();
	}
}
