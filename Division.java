import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Division extends JFrame {

	private JPanel contentPane;
	private JTextField txtValueOne;
	private JTextField resultOfSum;
	private JTextField txtValueTwo;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Division frame = new Division();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Division() {
		setTitle("Division");
		setBounds(100, 100, 228, 314);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnAddition = new JButton("Divide");
		btnAddition.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					double val1 = Double.parseDouble(txtValueOne.getText());
					double val2 = Double.parseDouble(txtValueTwo.getText());

					double result = val1 / val2;

					resultOfSum.setText(Double.toString(result));
				}
				catch(Exception ex){
					ex.printStackTrace();
				}
			}
		});
		btnAddition.setBounds(15, 208, 175, 29);
		contentPane.add(btnAddition);

		txtValueOne = new JTextField();
		txtValueOne.setBounds(15, 16, 175, 48);
		contentPane.add(txtValueOne);
		txtValueOne.setColumns(10);

		resultOfSum = new JTextField();
		resultOfSum.setEditable(false);
		resultOfSum.setBounds(15, 144, 175, 48);
		contentPane.add(resultOfSum);
		resultOfSum.setColumns(10);

		txtValueTwo = new JTextField();
		txtValueTwo.setBounds(15, 80, 176, 48);
		contentPane.add(txtValueTwo);
		txtValueTwo.setColumns(10);
	}

}
