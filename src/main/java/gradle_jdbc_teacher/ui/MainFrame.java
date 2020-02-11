package gradle_jdbc_teacher.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class MainFrame extends JFrame implements ActionListener {

	private JPanel contentPane;
	private LoginFrame loginFrame;
	private JButton btnLogOut;
	
	public MainFrame() {
		initialize();
	}
	
	private void initialize() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblLoginName = new JLabel("New label");
		lblLoginName.setFont(new Font("굴림", Font.BOLD, 40));
		lblLoginName.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblLoginName);
		
		btnLogOut = new JButton("로그아웃");
		btnLogOut.addActionListener(this);
		contentPane.add(btnLogOut);
		
		
		lblLoginName.setText(LoginFrame.loingEmp.getEmpName());
	}

	public void setLoginFrame(LoginFrame loginFrame) {
		this.loginFrame = loginFrame;
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnLogOut) {
			btnLogOutActionPerformed(e);
		}
	}
	protected void btnLogOutActionPerformed(ActionEvent e) {
		LoginFrame.loingEmp = null;
		dispose();
		loginFrame.setVisible(true);
		loginFrame.clearTf();
	}
}
