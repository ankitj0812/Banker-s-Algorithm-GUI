import javax.swing.table.DefaultTableModel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.UIManager;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class BankerAlgo {

    public static void main(String[] args) {
        Home h = new Home();
        h.setVisible(true);
    }
}
public class Home extends javax.swing.JFrame {
    int Max[][];
    int Allocation[][];
    int needM[][];
    int Available[][];
    int countA = 0;
    int countM = 0;
    
    private JFrame frame;
 
    public Home() {
    	frame = new JFrame();
		frame.setBounds(100, 100, 1454, 816);
		frame.setSize(1290,760);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
    	label.setBounds(10, 110, 0, 0);
    	label.setIcon(new ImageIcon("C:\\Users\\ANKIT\\Downloads\\Two_processes,_two_resources.gif"));
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
   
    private void initComponents() {
    	

        jPanel1 = new javax.swing.JPanel();
        jPanel1.setForeground(Color.WHITE);
        addRow = new javax.swing.JButton();
        addRow.setBounds(95, 184, 137, 21);
        addRow.setBackground(Color.WHITE);
        addRow.setFont(new Font("Arial", Font.BOLD, 11));
        addRow.setForeground(new Color(0, 128, 0));
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane2.setBounds(31, 257, 277, 196);
        jTable1 = new javax.swing.JTable();
        processID = new javax.swing.JTextField();
        processID.setBounds(10, 145, 61, 19);
        resourceA = new javax.swing.JTextField();
        resourceA.setBounds(95, 145, 62, 19);
        resourceB = new javax.swing.JTextField();
        resourceB.setBounds(183, 145, 62, 19);
        resourceC = new javax.swing.JTextField();
        resourceC.setBounds(265, 145, 62, 19);
        jLabel3 = new javax.swing.JLabel();
        jLabel3.setFont(new Font("Arial", Font.PLAIN, 12));
        jLabel3.setBounds(10, 122, 72, 13);
        jLabel4 = new javax.swing.JLabel();
        jLabel4.setFont(new Font("Arial", Font.PLAIN, 12));
        jLabel4.setBounds(92, 122, 72, 13);
        jLabel5 = new javax.swing.JLabel();
        jLabel5.setFont(new Font("Arial", Font.PLAIN, 12));
        jLabel5.setBounds(183, 122, 72, 13);
        jLabel6 = new javax.swing.JLabel();
        jLabel6.setFont(new Font("Arial", Font.PLAIN, 12));
        jLabel6.setBounds(265, 122, 72, 13);
        jLabel1 = new javax.swing.JLabel();
        jLabel1.setBounds(119, 76, 93, 23);
        jLabel1.setForeground(new Color(0, 0, 128));
        jLabel8 = new javax.swing.JLabel();
        jLabel8.setFont(new Font("Arial", Font.PLAIN, 12));
        jLabel8.setBounds(402, 122, 72, 13);
        resourceA1 = new javax.swing.JTextField();
        resourceA1.setBounds(402, 145, 62, 19);
        jLabel9 = new javax.swing.JLabel();
        jLabel9.setFont(new Font("Arial", Font.PLAIN, 12));
        jLabel9.setBounds(491, 122, 72, 13);
        resourceB1 = new javax.swing.JTextField();
        resourceB1.setBounds(491, 145, 61, 19);
        jLabel10 = new javax.swing.JLabel();
        jLabel10.setFont(new Font("Arial", Font.PLAIN, 12));
        jLabel10.setBounds(581, 122, 72, 13);
        resourceC1 = new javax.swing.JTextField();
        resourceC1.setBounds(581, 145, 62, 19);
        addRow1 = new javax.swing.JButton();
        addRow1.setBounds(455, 184, 137, 21);
        addRow1.setBackground(Color.WHITE);
        addRow1.setForeground(new Color(0, 128, 0));
        addRow1.setFont(new Font("Arial", Font.BOLD, 11));
        jLabel2 = new javax.swing.JLabel();
        jLabel2.setBounds(464, 76, 112, 23);
        jLabel2.setForeground(new Color(0, 0, 128));
        jScrollPane3 = new javax.swing.JScrollPane();
        jScrollPane3.setBounds(386, 257, 277, 196);
        jTable2 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jScrollPane4.setBounds(386, 538, 279, 196);
        jTable3 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel7.setBounds(800, 166, 94, 23);
        jLabel7.setForeground(new Color(0, 128, 128));
        avaA = new javax.swing.JTextField();
        avaA.setBounds(723, 232, 62, 19);
        avaB = new javax.swing.JTextField();
        avaB.setBounds(822, 232, 62, 19);
        avaC = new javax.swing.JTextField();
        avaC.setBounds(923, 232, 62, 19);
        jLabel11 = new javax.swing.JLabel();
        jLabel11.setFont(new Font("Arial", Font.PLAIN, 12));
        jLabel11.setBounds(724, 209, 72, 13);
        jLabel12 = new javax.swing.JLabel();
        jLabel12.setFont(new Font("Arial", Font.PLAIN, 12));
        jLabel12.setBounds(822, 209, 72, 13);
        jLabel13 = new javax.swing.JLabel();
        jLabel13.setFont(new Font("Arial", Font.PLAIN, 12));
        jLabel13.setBounds(923, 209, 72, 13);
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton1.setBounds(797, 278, 119, 23);
        jToggleButton1.setBackground(Color.WHITE);
        jToggleButton1.setFont(new Font("Arial", Font.BOLD, 12));
        jToggleButton1.setForeground(new Color(178, 34, 34));
        jScrollPane5 = new javax.swing.JScrollPane();
        jScrollPane5.setBounds(35, 538, 273, 196);
        jTable4 = new javax.swing.JTable();
        ans = new javax.swing.JLabel();
        ans.setBounds(1119, 607, 151, 24);
        ans.setForeground(new Color(51, 51, 51));
        ansArea = new javax.swing.JTextArea();
        ansArea.setBounds(800, 540, 170, 194);
        ansArea.setBackground(UIManager.getColor("Button.light"));
        ansArea.setForeground(Color.BLACK);
        jLabel14 = new javax.swing.JLabel();
        jLabel14.setBounds(53, 234, 229, 17);
        jLabel14.setForeground(new Color(0, 0, 128));
        jLabel15 = new javax.swing.JLabel();
        jLabel15.setBounds(402, 234, 241, 17);
        jLabel15.setForeground(new Color(0, 0, 128));
        jLabel16 = new javax.swing.JLabel();
        jLabel16.setBounds(53, 511, 229, 17);
        jLabel16.setForeground(new Color(0, 0, 128));
        jLabel17 = new javax.swing.JLabel();
        jLabel17.setBounds(402, 511, 229, 17);
        jLabel17.setForeground(new Color(0, 0, 128));
        jLabel18 = new javax.swing.JLabel();
        jLabel18.setBounds(800, 508, 170, 22);
        jLabel18.setForeground(new Color(128, 0, 128));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Banker's Algorithm");

        jPanel1.setBackground(SystemColor.info);

        addRow.setText("Add Process");
        addRow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addRowMouseClicked(evt);
            }
        	@Override
        	public void mouseEntered(MouseEvent e) {
        		addRow.setForeground(Color.BLUE);
        	}
        	public void mouseExited(MouseEvent e) {
        		addRow.setForeground(Color.RED);
        	}
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Process", "A", "B", "C"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jLabel3.setText("Process ID");

        jLabel4.setText("Resource 1");

        jLabel5.setText("Resource 2");

        jLabel6.setText("Resource 3");

        jLabel1.setFont(new Font("Arial", Font.BOLD, 18));
        jLabel1.setText("Allocation");

        jLabel8.setText("Resource 1");

        jLabel9.setText("Resource 2");

        jLabel10.setText("Resource 3");

        addRow1.setText("Add Process");
        addRow1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addRow1MouseClicked(evt);
            }
        	@Override
        	public void mouseEntered(MouseEvent e) {
        		addRow1.setForeground(Color.GREEN);
        	}
        	public void mouseExited(MouseEvent e) {
        		addRow1.setForeground(Color.RED);
        	}
        });

        jLabel2.setFont(new Font("Arial", Font.BOLD, 18));
        jLabel2.setText("Max matrix");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "A", "B", "C"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "A", "B", "C"
            }
        ));
        jScrollPane4.setViewportView(jTable3);

        jLabel7.setFont(new Font("Arial", Font.BOLD, 18));
        jLabel7.setText("Available");

        jLabel11.setText("Resource 1");

        jLabel12.setText("Resource 2");

        jLabel13.setText("Resource 3");

        jToggleButton1.setText("Calculate");
        jToggleButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createNeedM(evt);
            }
        	@Override
        	public void mouseEntered(MouseEvent e) {
        		jToggleButton1.setForeground(Color.GREEN);
        	}
        	public void mouseExited(MouseEvent e) {
        		jToggleButton1.setForeground(Color.RED);
        	}
        });

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "A", "B", "C"
            }
        ));
        jScrollPane5.setViewportView(jTable4);

        ans.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 20));
        ans.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ans.setText("Solution");

        ansArea.setColumns(20);
        ansArea.setRows(5);
        ansArea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel14.setFont(new Font("Arial", Font.BOLD, 18));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Allocation Table");

        jLabel15.setFont(new Font("Arial", Font.BOLD, 18));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Max Allocation");

        jLabel16.setFont(new Font("Arial", Font.BOLD, 18));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Available Matrix");

        jLabel17.setFont(new Font("Arial", Font.BOLD, 18));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Need Matrix");

        jLabel18.setFont(new Font("Arial", Font.BOLD, 18));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Safe Sequence");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jPanel1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 1463, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        			.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE)
        			.addContainerGap())
        );
        jPanel1.setLayout(null);
        jPanel1.add(jLabel3);
        jPanel1.add(processID);
        jPanel1.add(jLabel4);
        jPanel1.add(resourceA);
        jPanel1.add(jLabel5);
        jPanel1.add(resourceB);
        jPanel1.add(jLabel6);
        jPanel1.add(resourceC);
        jPanel1.add(jLabel2);
        jPanel1.add(addRow);
        jPanel1.add(jLabel8);
        jPanel1.add(avaA);
        jPanel1.add(jLabel11);
        jPanel1.add(resourceA1);
        jPanel1.add(avaB);
        jPanel1.add(jLabel9);
        jPanel1.add(resourceB1);
        jPanel1.add(jLabel7);
        jPanel1.add(jLabel12);
        jPanel1.add(jLabel10);
        jPanel1.add(jLabel13);
        jPanel1.add(resourceC1);
        jPanel1.add(avaC);
        jPanel1.add(jToggleButton1);
        jPanel1.add(jLabel1);
        jPanel1.add(addRow1);
        jPanel1.add(label);
        jPanel1.add(jScrollPane5);
        jPanel1.add(jScrollPane4);
        jPanel1.add(ans);
        jPanel1.add(jLabel14);
        jPanel1.add(jLabel16);
        jPanel1.add(jScrollPane2);
        jPanel1.add(jScrollPane3);
        jPanel1.add(jLabel17);
        jPanel1.add(jLabel15);
        jPanel1.add(ansArea);
        jPanel1.add(jLabel18);
        
        lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ANKIT\\Downloads\\Two_processes,_two_resources.gif"));
        lblNewLabel.setBounds(1111, 61, 306, 406);
        jPanel1.add(lblNewLabel);
        
        lblNewLabel_1 = new JLabel("Banker's Algorithm");
        lblNewLabel_1.setFont(new Font("Calibri", Font.BOLD, 25));
        lblNewLabel_1.setBounds(581, 22, 215, 31);
        jPanel1.add(lblNewLabel_1);
        
        JLabel lblNewLabel_2 = new JLabel("Log Out");
        lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\ANKIT\\Downloads\\iconfinder_48698_logout_icon_32px.png"));
        lblNewLabel_2.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		if(JOptionPane.showConfirmDialog(null, "Are you sure you want to log out?","Confirmation" , JOptionPane.YES_NO_OPTION)==0) {      	    	           
        			Home.this.dispose();	 
        			sample s = new sample();
        			s.show();
        		}       		
        	}
        	@Override
        	public void mouseEntered(MouseEvent e) {
        		lblNewLabel_2.setForeground(Color.RED);
        	}
        	@Override
        	public void mouseExited(MouseEvent e) {
        		lblNewLabel_2.setForeground(Color.BLACK);
        	}
        });
        lblNewLabel_2.setFont(new Font("Berlin Sans FB", Font.PLAIN, 20));
        lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2.setBounds(1334, 10, 119, 33);
        jPanel1.add(lblNewLabel_2);
        getContentPane().setLayout(layout);

        setSize(new Dimension(1477, 815));
        setLocationRelativeTo(null);
    }

    private void addRowMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        String data1 = processID.getText();
        String data2 = resourceA.getText();
        String data3 = resourceB.getText();
        String data4 = resourceC.getText();

        Object[] row = { data1, data2, data3, data4 };

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        System.out.println(countA);
        model.addRow(row);
        countA++;
        System.out.println(countA);
        
    }

    private void addRow1MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        String data2 = resourceA1.getText();
        String data3 = resourceB1.getText();
        String data4 = resourceC1.getText();
        Object[] row = { data2, data3, data4 };

        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();

        model.addRow(row);
        countM++;
        
    }

    private void createNeedM(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        Allocation=new int[countA][3];
        int i = 0;
        while(i<countA){
            for(int j=0; j<3; j++){
                Allocation[i][j]=Integer.parseInt(jTable1.getModel().getValueAt(i, j+1).toString());
            }
            i++;
        }
       
        Max=new int[countM][3];
        int k = 0;
        while(k<countM){
            for(int j=0; j<3; j++){
                Max[k][j]=Integer.parseInt(jTable2.getModel().getValueAt(k, j).toString());
             
            }
            k++;
        }
        Available=new int[1][3];
        Available[0][0] = Integer.parseInt(avaA.getText());
        Available[0][1] = Integer.parseInt(avaB.getText());
        Available[0][2] = Integer.parseInt(avaC.getText());
        needM=new int[countA][3];
        cal_need();
        algorithm();
    }

    public void cal_need(){

	if(countA==countM){
            for(int i=0;i<countA;i++){

		for(int j=0;j<3;j++){

                    needM[i][j]=Max[i][j]-Allocation[i][j];

        	}

            }
        }
        int i=0;
        while(i<countA){
            Object[] row = { needM[i][0], needM[i][1], needM[i][2] };
            DefaultTableModel model = (DefaultTableModel) jTable3.getModel();
            model.addRow(row);
            i++;
        }
    }
    
    public boolean check(int p){

	if(Available[0][0]<needM[p][0] || Available[0][1]<needM[p][1] || Available[0][2]<needM[p][2]){

            return false;

	}


	return true;

    }
    
    public void algorithm(){

	int c=0;

	boolean status[]=new boolean[countA];

	while(c<countA){

            boolean allocated=false;
            
            for(int i=0;i<countA;i++){

		if( !status[i] && check(i)){

                    status[i]=true;

                    allocated=true;
                    ansArea.append("P"+Integer.toString(i)+" Allocated\n");
                    
                    for(int j=0;j<3;j++){
                      
                        Available[0][j]=Available[0][j]+Allocation[i][j];
                    }
                    c++;
                    Object[] row = { Available[0][0], Available[0][1], Available[0][2] };
                    DefaultTableModel model = (DefaultTableModel) jTable4.getModel();
                    model.addRow(row);
                    
                }   
            }
            if(!allocated){
                break;
            }
	    //if no allocation

        }

        if(c==countA){

        ans.setText("\nSafely allocated");
        }
        else{

        ans.setText("UnSafe");
        }
    }
 
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    private javax.swing.JButton addRow;
    private javax.swing.JButton addRow1;
    private javax.swing.JLabel ans;
    private javax.swing.JTextArea ansArea;
    private javax.swing.JTextField avaA;
    private javax.swing.JTextField avaB;
    private javax.swing.JTextField avaC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    public javax.swing.JTable jTable1;
    public javax.swing.JTable jTable2;
    public javax.swing.JTable jTable3;
    public javax.swing.JTable jTable4;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField processID;
    private javax.swing.JTextField resourceA;
    private javax.swing.JTextField resourceA1;
    private javax.swing.JTextField resourceB;
    private javax.swing.JTextField resourceB1;
    private javax.swing.JTextField resourceC;
    private javax.swing.JTextField resourceC1;
    private final JLabel label = new JLabel("");
    private JLabel lblNewLabel;
    private JLabel lblNewLabel_1;
}