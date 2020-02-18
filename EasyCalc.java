/**
 * Basic Calculator Program
 * 
 * This is a simple calculator
 * which solves the basic operations (+,-,*,/)
 * of two numbers, as well as the basic operations (+,-,*,/)
 * of two rational numbers (fractions).
 * 
 * Language used: JAVA
 * 
 * Made by: Luis J. Escobar
 * 
 * Email: <javyesco@hotmail.com>
 */

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Image;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;

public class EasyCalc extends JFrame {

	private JPanel contentPane;
	private JLabel lblPhoto;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EasyCalc frame = new EasyCalc();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public EasyCalc() {
		setTitle("EasyCalc");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 558, 421);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu newMenu = new JMenu("Basic Operations");
		menuBar.add(newMenu);

		JMenuItem mntmExit = new JMenuItem("Multiply");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Multiply mult = new Multiply();
				mult.setVisible(true);
			}
		});

		JMenuItem mntmAddition = new JMenuItem("Addition");
		mntmAddition.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Addition add = new Addition();
				add.setVisible(true);
			}
		});
		newMenu.add(mntmAddition);

		JMenuItem mntmSubtract = new JMenuItem("Subtract");
		mntmSubtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Subtract sub = new Subtract();
				sub.setVisible(true);
			}
		});
		newMenu.add(mntmSubtract);
		newMenu.add(mntmExit);

		JMenuItem mntmDivision = new JMenuItem("Division");
		mntmDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Division div = new Division();
				div.setVisible(true);
			}
		});
		newMenu.add(mntmDivision);

		JMenu mnFractions = new JMenu("Fractions");
		menuBar.add(mnFractions);

		JMenuItem mntmAddition_1 = new JMenuItem("Addition");
		mntmAddition_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fractAdd fracadd = new fractAdd();
				fracadd.setVisible(true);
			}
		});
		mnFractions.add(mntmAddition_1);

		JMenuItem mntmSubtracction = new JMenuItem("Subtract");
		mntmSubtracction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fracSubtract fracsubt = new fracSubtract();
				fracsubt.setVisible(true);
			}
		});
		mnFractions.add(mntmSubtracction);

		JMenuItem mntmMultiply = new JMenuItem("Multiply");
		mntmMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fracMultiply fracmulti = new fracMultiply();
				fracmulti.setVisible(true);
			}
		});
		mnFractions.add(mntmMultiply);

		JMenuItem mntmDivision_1 = new JMenuItem("Division");
		mntmDivision_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fractDivision fracdiv = new fractDivision();
				fracdiv.setVisible(true);
			}
		});
		mnFractions.add(mntmDivision_1);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblPhoto = new JLabel("");
		lblPhoto.setBounds(0, 0, 536, 334);
		contentPane.add(lblPhoto);

		ImageBackgroung();
	}

	public void ImageBackgroung() {
		ImageIcon icon = new ImageIcon("C:/Users/javye/eclipse-workspace/EasyCalPrac/src/5xyoITc.png");
		Image img = icon.getImage();
		Image imgScale = img.getScaledInstance(lblPhoto.getWidth(), lblPhoto.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon scaledIcon = new ImageIcon(imgScale);
		lblPhoto.setIcon(scaledIcon);
	}
}
