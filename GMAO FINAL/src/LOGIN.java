import java.awt.EventQueue;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLayeredPane;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.EmptyBorder;
import java.awt.Button;
import javax.swing.JSeparator;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.DefaultListModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class LOGIN {

    private JFrame frame;
    private JTextField textField;
    private JPasswordField passwordField;
    private JPanel panel;
    private JPanel Principal;
    private JPanel panelAddCUst;
    private JPanel panelDisplayList;
    private JPanel panelDisplayList_1;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTable table;
    private JTextField textField_5;
    private JTextField textField_6;
    private JTextField textField_7;
    private JTextField textField_8;
    private JTextField textField_9;
    private JTextField textField_10;
    private JTextField textField_11;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    LOGIN window = new LOGIN();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public LOGIN() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 894, 578);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        panel = new JPanel();
        panel.setBackground(new Color(244, 164, 96));
        panel.setBounds(0, 0, 870, 541);
        frame.getContentPane().add(panel);
        panel.setLayout(null);

        JLayeredPane loginPane = new JLayeredPane();
        loginPane.setBorder(UIManager.getBorder("InternalFrame.border"));
        loginPane.setBounds(227, 100, 428, 336);
        panel.add(loginPane);

        JLabel lblNewLabel_1 = new JLabel("Username");
        lblNewLabel_1.setBounds(34, 106, 64, 23);
        loginPane.add(lblNewLabel_1);

        JLabel lblNewLabel_1_1 = new JLabel("Password");
        lblNewLabel_1_1.setBounds(34, 152, 64, 23);
        loginPane.add(lblNewLabel_1_1);

        textField = new JTextField();
        textField.setColumns(10);
        textField.setBounds(108, 108, 205, 19);
        loginPane.add(textField);

        JRadioButton rdbtnNewRadioButton = new JRadioButton("MANAGER");
        rdbtnNewRadioButton.setBackground(SystemColor.controlLtHighlight);
        rdbtnNewRadioButton.setBounds(34, 226, 103, 21);
        loginPane.add(rdbtnNewRadioButton);

        JRadioButton rdbtnOperator = new JRadioButton("OPERATOR");
        rdbtnOperator.setBackground(SystemColor.controlLtHighlight);
        rdbtnOperator.setBounds(168, 226, 103, 21);
        loginPane.add(rdbtnOperator);

        JButton btnNewButton = new JButton("Submit");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                clearPanelAndShowPrincipal();
            }
        });
        btnNewButton.setBackground(SystemColor.activeCaptionBorder);
        btnNewButton.setBounds(177, 290, 85, 21);
        loginPane.add(btnNewButton);

        JDesktopPane desktopPane = new JDesktopPane();
        desktopPane.setBorder(UIManager.getBorder("FormattedTextField.border"));
        desktopPane.setBackground(SystemColor.controlLtHighlight);
        desktopPane.setBounds(0, 38, 428, 298);
        loginPane.add(desktopPane);

        passwordField = new JPasswordField();
        passwordField.setBounds(107, 117, 207, 19);
        desktopPane.add(passwordField);
        
                JRadioButton rdbtnCustomer = new JRadioButton("ADMINISTRATEUR");
                rdbtnCustomer.setBounds(284, 189, 124, 21);
                desktopPane.add(rdbtnCustomer);
                rdbtnCustomer.setBackground(SystemColor.controlLtHighlight);

        JLabel lblNewLabel = new JLabel("LOGIN");
        lblNewLabel.setBounds(199, 10, 72, 18);
        loginPane.add(lblNewLabel);

        JButton btnNewConnection = new JButton("New connection ?");
        btnNewConnection.setBackground(SystemColor.activeCaptionBorder);
        btnNewConnection.setBounds(64, 466, 140, 21);
        panel.add(btnNewConnection);

        Principal = new JPanel();
        Principal.setLayout(null);
        Principal.setBorder(new EmptyBorder(5, 5, 5, 5));
        Principal.setBackground(new Color(255, 218, 185));
        Principal.setBounds(0, 0, 875, 533);
        Principal.setVisible(false); // Initially hidden
        frame.getContentPane().add(Principal);

        Button button = new Button("Log off");
        button.setBackground(Color.BLUE);
        button.setBounds(683, -3, 85, 21);
        Principal.add(button);

        Button button_1 = new Button("New");
        button_1.setBackground(Color.BLUE);
        button_1.setBounds(136, -3, 67, 21);
        Principal.add(button_1);

        Button button_1_1 = new Button("Open");
        button_1_1.setBackground(Color.BLUE);
        button_1_1.setBounds(229, -3, 67, 21);
        Principal.add(button_1_1);

        Button button_1_2 = new Button("Save");
        button_1_2.setBackground(Color.BLUE);
        button_1_2.setBounds(317, -3, 67, 21);
        Principal.add(button_1_2);

        Button button_1_3 = new Button("Print");
        button_1_3.setBackground(Color.BLUE);
        button_1_3.setBounds(397, -3, 67, 21);
        Principal.add(button_1_3);

        Button button_1_4 = new Button("Help");
        button_1_4.setBackground(Color.BLUE);
        button_1_4.setBounds(472, -3, 67, 21);
        Principal.add(button_1_4);

        Button button_2 = new Button("<");
        button_2.setBounds(0, -3, 56, 21);
        Principal.add(button_2);

        Button button_2_1 = new Button(">");
        button_2_1.setBounds(62, -3, 56, 21);
        Principal.add(button_2_1);

        JDesktopPane desktopPane_1 = new JDesktopPane();
        desktopPane_1.setBorder(UIManager.getBorder("Tree.editorBorder"));
        desktopPane_1.setBackground(new Color(255, 222, 173));
        desktopPane_1.setBounds(0, 24, 262, 509);
        Principal.add(desktopPane_1);

        JButton btnNewButton_1 = new JButton("Customer");
        btnNewButton_1.setBounds(38, 41, 182, 21);
        desktopPane_1.add(btnNewButton_1);
       
        // APPELER LA METHODE AFFICHER CUSTOMER
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showPanelAddCUst();
            }
        });

        JButton btnNewButton_1_1 = new JButton("Operator");
        btnNewButton_1_1.setBounds(38, 136, 182, 21);
        desktopPane_1.add(btnNewButton_1_1);

        JButton btnNewButton_2 = new JButton("Management");
        btnNewButton_2.setBounds(38, 231, 182, 21);
        desktopPane_1.add(btnNewButton_2);

        JButton btnNewButton_3 = new JButton("Ticket tracking");
        btnNewButton_3.setBounds(38, 337, 182, 21);
        desktopPane_1.add(btnNewButton_3);

        JButton btnNewButton_3_1 = new JButton("Maintenance Request");
        btnNewButton_3_1.setBounds(38, 435, 182, 21);
        desktopPane_1.add(btnNewButton_3_1);

        JPanel panelAcceuil = new JPanel();
        panelAcceuil.setBackground(new Color(222, 184, 135));
        panelAcceuil.setBounds(259, 24, 616, 509);
        Principal.add(panelAcceuil);
        panelAcceuil.setLayout(null);

        panelAddCUst = new JPanel();
        panelAddCUst.setBackground(new Color(244, 164, 96));
        panelAddCUst.setBounds(0, 0, 616, 509);
        panelAddCUst.setLayout(null);
        panelAddCUst.setVisible(false); // Initially hidden
        panelAcceuil.add(panelAddCUst);
        
        panelDisplayList = new JPanel();
        panelDisplayList.setBackground(new Color(244, 164, 96));
        panelDisplayList.setBounds(0, 0, 616, 509);
        panelDisplayList.setLayout(null);
        panelDisplayList.setVisible(false); // Initially hidden
        panelAcceuil.add(panelDisplayList);
        
//////////////////////////////////////
        
        
        textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(255, 167, 225, 19);
		panelAddCUst.add(textField);
		
		JLabel societyLabel = new JLabel("Society");
		societyLabel.setBounds(199, 166, 46, 21);
		panelAddCUst.add(societyLabel);
		
		JLabel IFULabel = new JLabel("IFU");
		IFULabel.setBounds(199, 210, 34, 21);
		panelAddCUst.add(IFULabel);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(255, 211, 225, 19);
		panelAddCUst.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(255, 254, 225, 19);
		panelAddCUst.add(textField_2);
		
		JLabel RCCMLabel = new JLabel("RCCM");
		RCCMLabel.setBounds(199, 253, 46, 21);
		panelAddCUst.add(RCCMLabel);
		
		JLabel adressLabel = new JLabel("Adress");
		adressLabel.setBounds(199, 298, 46, 21);
		panelAddCUst.add(adressLabel);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(255, 299, 225, 19);
		panelAddCUst.add(textField_3);
		
		JButton btnNewButton_5 = new JButton("Validate");
		btnNewButton_5.setBounds(292, 418, 124, 38);
		panelAddCUst.add(btnNewButton_5);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(255, 346, 225, 19);
		panelAddCUst.add(textField_4);
		
		JLabel codeLabel = new JLabel("APE code");
		codeLabel.setBounds(199, 345, 61, 21);
		panelAddCUst.add(codeLabel);
		
        
        //BOUTON ADDCU ET DISPAY LIST
        
        JButton btnNewButton_4 = new JButton("Add customer");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_4.setBackground(Color.LIGHT_GRAY);
		btnNewButton_4.setBounds(0, 59, 344, 44);
		panelAddCUst.add(btnNewButton_4);
		
		JButton btnNewButton_4_1 = new JButton("Display List");
		btnNewButton_4_1.setBackground(new Color(220, 220, 220));
		btnNewButton_4_1.setBounds(344, 59, 317, 44);
		btnNewButton_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showPanelDisplayList();
			}
		});
		panelAddCUst.add(btnNewButton_4_1);
		
		// Panel for Displaying Customer List
		panelDisplayList_1 = new JPanel();
        panelDisplayList_1.setBackground(new Color(244, 164, 96));
        panelDisplayList_1.setBounds(0, 0, 616, 509);
        panelDisplayList_1.setLayout(null);
        panelDisplayList_1.setVisible(false); // Initially hidden
        panelAcceuil.add(panelDisplayList_1);
        
        DefaultListModel<String> listModel = new DefaultListModel<>();
        listModel.addElement("Customer 1");
        listModel.addElement("Customer 2");
        listModel.addElement("Customer 3");
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(92, 155, 443, 217);
        panelDisplayList_1.add(scrollPane);
        
        table = new JTable();
        scrollPane.setViewportView(table);
        table.setModel(new DefaultTableModel(
        	new Object[][] {
        		{null, null},
        		{null, null},
        		{null, null},
        		{null, null},
        		{null, null},
        		{null, null},
        		{null, null},
        		{null, null},
        		{null, null},
        		{null, null},
        		{null, null},
        		{null, null},
        	},
        	new String[] {
        		"ID", "Customer"
        	}
        ));
        
        JPanel panel_1_1 = new JPanel();
        panel_1_1.setLayout(null);
        panel_1_1.setBackground(SystemColor.textHighlight);
        panel_1_1.setBounds(0, 0, 661, 57);
        panelDisplayList_1.add(panel_1_1);
        
        JLabel lblNewLabel_3_1 = new JLabel("Customer");
        lblNewLabel_3_1.setBounds(313, 10, 96, 25);
        panel_1_1.add(lblNewLabel_3_1);
        
        JButton btnNewButton_4_2 = new JButton("Add customer");
        btnNewButton_4_2.setBackground(Color.LIGHT_GRAY);
        btnNewButton_4_2.setBounds(0, 58, 344, 50);
        panelDisplayList_1.add(btnNewButton_4_2);
        
        JButton btnNewButton_4_1_1 = new JButton("Display List");
        btnNewButton_4_1_1.setBackground(new Color(220, 220, 220));
        btnNewButton_4_1_1.setBounds(302, 58, 314, 50);
        panelDisplayList_1.add(btnNewButton_4_1_1);
        
        JButton btnNewButton_7 = new JButton("Delete");
        btnNewButton_7.setBounds(334, 432, 141, 29);
        panelDisplayList_1.add(btnNewButton_7);

        JPanel panel_1 = new JPanel();
        panel_1.setLayout(null);
        panel_1.setBackground(SystemColor.textHighlight);
        panel_1.setBounds(0, 0, 661, 57);
        panelAddCUst.add(panel_1);
        
        JLabel lblNewLabel_3 = new JLabel("Customer");
        lblNewLabel_3.setBounds(313, 10, 96, 25);
        panel_1.add(lblNewLabel_3);
        
        JPanel panelAddOperateur = new JPanel();
        panelAddOperateur.setLayout(null);
        panelAddOperateur.setBackground(new Color(244, 164, 96));
        panelAddOperateur.setBounds(0, 0, 663, 512);
        panelAcceuil.add(panelAddOperateur);
        
        JPanel panel_op = new JPanel();
        panel_op.setLayout(null);
        panel_op.setBackground(SystemColor.textHighlight);
        panel_op.setBounds(0, 0, 661, 57);
        panelAddOperateur.add(panel_op);
        
        JLabel lblNewLabel_2 = new JLabel("Operator");
        lblNewLabel_2.setBounds(313, 10, 96, 25);
        panel_op.add(lblNewLabel_2);
        
        JButton btnNewButton_4_3 = new JButton("Add Operator");
        btnNewButton_4_3.setBackground(Color.LIGHT_GRAY);
        btnNewButton_4_3.setBounds(0, 59, 344, 44);
        panelAddOperateur.add(btnNewButton_4_3);
        
        JButton btnNewButton_4_1_2 = new JButton("Display List");
        btnNewButton_4_1_2.setBackground(new Color(220, 220, 220));
        btnNewButton_4_1_2.setBounds(344, 59, 317, 44);
        panelAddOperateur.add(btnNewButton_4_1_2);
        
        textField_5 = new JTextField();
        textField_5.setColumns(10);
        textField_5.setBounds(325, 193, 235, 19);
        panelAddOperateur.add(textField_5);
        
        JLabel IDLabel_1 = new JLabel("ID-OPERATOR");
        IDLabel_1.setBounds(166, 195, 96, 16);
        panelAddOperateur.add(IDLabel_1);
        
        JLabel FNAMELabel = new JLabel("FIRST NAME");
        FNAMELabel.setBounds(166, 224, 110, 13);
        panelAddOperateur.add(FNAMELabel);
        
        textField_6 = new JTextField();
        textField_6.setColumns(10);
        textField_6.setBounds(325, 222, 235, 19);
        panelAddOperateur.add(textField_6);
        
        textField_7 = new JTextField();
        textField_7.setColumns(10);
        textField_7.setBounds(325, 255, 235, 19);
        panelAddOperateur.add(textField_7);
        
        JLabel LNAMELabel = new JLabel("LAST NAME");
        LNAMELabel.setBounds(166, 259, 96, 13);
        panelAddOperateur.add(LNAMELabel);
        
        JLabel STARTLabel = new JLabel("SERVICE START DATE");
        STARTLabel.setBounds(166, 298, 150, 13);
        panelAddOperateur.add(STARTLabel);
        
        textField_8 = new JTextField();
        textField_8.setColumns(10);
        textField_8.setBounds(325, 297, 235, 19);
        panelAddOperateur.add(textField_8);
        
        textField_9 = new JTextField();
        textField_9.setColumns(10);
        textField_9.setBounds(325, 326, 235, 19);
        panelAddOperateur.add(textField_9);
        
        JLabel STOPLabel = new JLabel("SERVICE STOP DATE");
        STOPLabel.setBounds(166, 327, 128, 16);
        panelAddOperateur.add(STOPLabel);
        
        JLabel SPECIALLabel = new JLabel("SPECIALITIES");
        SPECIALLabel.setBounds(166, 361, 104, 13);
        panelAddOperateur.add(SPECIALLabel);
        
        textField_10 = new JTextField();
        textField_10.setColumns(10);
        textField_10.setBounds(325, 355, 235, 19);
        panelAddOperateur.add(textField_10);
        
        textField_11 = new JTextField();
        textField_11.setColumns(10);
        textField_11.setBounds(325, 384, 235, 19);
        panelAddOperateur.add(textField_11);
        
        JLabel TELLabel = new JLabel("TELEPHONE");
        TELLabel.setBounds(166, 390, 96, 13);
        panelAddOperateur.add(TELLabel);
    }

    private void clearPanelAndShowPrincipal() {
        panel.setVisible(false);
        Principal.setVisible(true);
        panelAddCUst.setVisible(false);
        panelDisplayList_1.setVisible(false);
    }

    private void showPanelAddCUst() {
        Principal.setVisible(true);
        panelAddCUst.setVisible(true);
        panelDisplayList_1.setVisible(false);
    }
    
    private void showPanelDisplayList() {
        panelAddCUst.setVisible(false);
        panelDisplayList_1.setVisible(true);
    }
}
