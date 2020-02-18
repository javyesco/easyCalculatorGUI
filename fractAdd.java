import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class fractAdd extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField txtValueOne;
	private JTextField resultOfSum;
	private JTextField txtValueTwo;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					fractAdd frame = new fractAdd();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public fractAdd() {
		setTitle("Add");
		setBounds(100, 100, 228, 314);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnAddition = new JButton("Add");
		btnAddition.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				newRationalNum rationalVal1 = null, rationalVal2, theResult = null;
				try {
					//First rational value
					String temp = txtValueOne.getText(); //Recovers the inputed text
					String [] values = temp.split("/"); //Splits the inputed text into values[0] and values[1] with the "/"

					int numerator = Integer.parseInt(values[0]);
					int denominator = Integer.parseInt(values[1]);

					verifyNum(denominator);

					rationalVal1 = new newRationalNum(numerator,denominator); //Utilize the constructor

					//Second rational value
					temp = txtValueTwo.getText();
					values = temp.split("/");

					numerator = Integer.parseInt(values[0]);
					denominator = Integer.parseInt(values[1]);

					rationalVal2 = new newRationalNum(numerator,denominator);

					theResult = newRationalNum.add(rationalVal1, rationalVal2);

					resultOfSum.setText(theResult.toString());
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

	private void verifyNum(int a){
		if(a<=0) {
			JOptionPane.showMessageDialog(null, "DENOMINATOR CAN'T BE ZERO");
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	}

}
