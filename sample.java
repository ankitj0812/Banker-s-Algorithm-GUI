import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingConstants;
import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Image;

import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JCheckBox;
import javax.swing.JToggleButton;


public class sample implements ActionListener {
    private static JLabel userLabel;
    private static JTextField userText;
    private static JPasswordField passwordText;
    private static JButton btnLogIn;
    private static JLabel success;
    private static JFrame frame;
    private static JLabel lblNewLabel;
    private static JLabel lblPassword;
    private static JLabel lblNewLabel_1;
    private static JLabel lblNewLabel_2;
    private static JLabel lblNewLabel_3;
    private static JLabel lblNewLabel_4;
       

    public static void main(String[] args) throws Exception {
    	
        
        JPanel panel = new JPanel();
        frame = new JFrame();
        frame.setSize(761, 534);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.getContentPane().add(panel);

        panel.setLayout(null);
        
                btnLogIn = new JButton("Log In");
                btnLogIn.setBackground(new Color(51, 153, 255));
                btnLogIn.setBorder(null);
                btnLogIn.setFont(new Font("Berlin Sans FB", Font.PLAIN, 18));
                btnLogIn.setBounds(517, 365, 92, 25);
                btnLogIn.addActionListener(new sample());
                
                JToggleButton tglbtnNewToggleButton = new JToggleButton("");
                tglbtnNewToggleButton.setForeground(Color.WHITE);
                tglbtnNewToggleButton.setBackground(Color.WHITE);
                tglbtnNewToggleButton.addActionListener(new ActionListener() {
                	public void actionPerformed(ActionEvent e) {
                		if(tglbtnNewToggleButton.isSelected()) {
                			passwordText.setEchoChar((char)0);
                		}
                		else {
                			passwordText.setEchoChar('●');
                		}
                	}
                });
                
                lblNewLabel_4 = new JLabel("");
                lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\ANKIT\\Downloads\\5172988-32.png"));
                lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
                lblNewLabel_4.setBounds(395, 257, 43, 38);
                panel.add(lblNewLabel_4);
                
                lblNewLabel_3 = new JLabel("");
                lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\ANKIT\\Downloads\\4714992-32.png"));
                lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
                lblNewLabel_3.setBounds(395, 154, 40, 39);
                panel.add(lblNewLabel_3);
                
                lblNewLabel_2 = new JLabel("");
                lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\ANKIT\\Downloads\\5049207-64.png"));
                lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
                lblNewLabel_2.setBounds(511, 44, 53, 44);
                panel.add(lblNewLabel_2);
                tglbtnNewToggleButton.setBorder(null);
                tglbtnNewToggleButton.setIcon(new ImageIcon("C:\\Users\\ANKIT\\Downloads\\4472995-32.png"));
                tglbtnNewToggleButton.setBounds(695, 257, 33, 25);
                panel.add(tglbtnNewToggleButton);
                
                JButton btnNewButton = new JButton("Forgot Password?");            
                btnNewButton.setForeground(Color.BLACK);
                btnNewButton.setFont(new Font("Berlin Sans FB", Font.PLAIN, 12));
                btnNewButton.setBorder(null);
                btnNewButton.setBackground(Color.WHITE);
                btnNewButton.setBounds(483, 454, 159, 21);
                panel.add(btnNewButton);
                panel.add(btnLogIn);
        
        lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\ANKIT\\OneDrive\\Desktop\\starbucks_sign_in_button_animated_0 (1).gif"));
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1.setBounds(500, 358, 125, 44);
        panel.add(lblNewLabel_1);
        
        lblPassword = new JLabel("Password");
        lblPassword.setFont(new Font("Berlin Sans FB", Font.PLAIN, 18));
        lblPassword.setBounds(444, 222, 80, 25);
        panel.add(lblPassword);

        userLabel = new JLabel("Username");
        userLabel.setFont(new Font("Berlin Sans FB", Font.PLAIN, 18));
        userLabel.setBounds(444, 120, 80, 25);
        panel.add(userLabel);

        userText = new JTextField();
        userText.addFocusListener(new FocusAdapter() {
        	@Override
			public void focusGained(FocusEvent e) {
				if(userText.getText().equals("Username")) {
					userText.setText("");
				}
				else {
					userText.selectAll();
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(userText.getText().equals(""))
					userText.setText("Username");
			}	
        });
        userText.setBorder(new LineBorder(Color.BLACK, 1, true));
        userText.setBounds(444, 158, 241, 35);
        panel.add(userText);

        passwordText = new JPasswordField();
        passwordText.addFocusListener(new FocusAdapter() {
        	@Override
			public void focusGained(FocusEvent e) {
				if(passwordText.getText().equals("Password")) {
					passwordText.setEchoChar('●');
					passwordText.setText("");
			}
				else {
					passwordText.selectAll();
				}
				}
			@Override
			public void focusLost(FocusEvent e) {
				if(passwordText.getText().equals("")) {
					passwordText.setText("Password");
					passwordText.setEchoChar((char)0);
				}
			}
        });
        passwordText.setBorder(new LineBorder(Color.BLACK, 1, true));
        passwordText.setBounds(444, 257, 241, 35);
        panel.add(passwordText);

        success = new JLabel("");
        success.setForeground(Color.RED);
        success.setBounds(416, 316, 286, 25);
        panel.add(success);
        
        lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ANKIT\\OneDrive\\Desktop\\login-form-design-03.jpg"));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(0, 0, 744, 496);
        panel.add(lblNewLabel);
        
        frame.setVisible(true);


    }
 
	protected void dispose() {
		System.exit(0);
		
	}
	@Override
    public void actionPerformed (ActionEvent e) {
        String user = userText.getText();
        String password = passwordText.getText();

        if (user.equals("Ankit") && password.equals("Deadlock")) {
            success.setText("Logged in successfully!");
            JOptionPane.showMessageDialog(frame, "You are successfully logined", "Login Succeed" , JOptionPane.YES_OPTION);
            Home h = new Home();
            h.setVisible(true);
            frame.dispose();
        }
        else if(user.equals("") || user.equals("Username") || password.equals("") || password.equals("password")) {
        	success.setText("Please enter all the requirements!");
        }
       
        else {
            success.setText("Your username or password is wrong! Try it again!");
            JOptionPane.showMessageDialog(frame, "Invalid username or password", "Invalid login", JOptionPane.NO_OPTION);
        }

    }

	public void show() {
		frame.setVisible(true);
		
	}
}