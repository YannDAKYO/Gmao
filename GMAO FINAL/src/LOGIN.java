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
import javax.swing.JTextPane;
import java.awt.Label;
import java.awt.TextField;
import javax.swing.SwingConstants;
import javax.swing.JEditorPane;

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
    JPanel panelAddOperator;
    JPanel panelListOperateur;
    JPanel panelDevis;
    JPanel panelMod_Devis;
    JPanel panelTicket;
    JPanel panelResquet;
    
    
    private JTable table_1;
    private JTable table_2;
    private JTable table_3;
    private JTextField textField_15;
    private JTextField textField_16;
    private JTextField textField_17;
    private JTextField textField_18;
    private JTextField textField_19;
    private JTextField textField_20;
    private JTextField textField_21;
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
        btnNewButton_1_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		showpanelAddOperator();//afficher le panel operator
        	}
        });
        btnNewButton_1_1.setBounds(38, 136, 182, 21);
        desktopPane_1.add(btnNewButton_1_1);

        JButton btnNewButton_2 = new JButton("Management");
        btnNewButton_2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		showpanelDevis();
        	}
        });
        btnNewButton_2.setBounds(38, 231, 182, 21);
        desktopPane_1.add(btnNewButton_2);

        JButton btnNewButton_3 = new JButton("Ticket tracking");
        btnNewButton_3.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		showpanelTicket();
        	}
        });
        btnNewButton_3.setBounds(38, 337, 182, 21);
        desktopPane_1.add(btnNewButton_3);

        JButton btnNewButton_3_1 = new JButton("Maintenance Request");
        btnNewButton_3_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		showpanelResquet();
        	}
        });
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
		
		JPanel panelCustomer = new JPanel();
		panelCustomer.setLayout(null);
		panelCustomer.setBackground(SystemColor.textHighlight);
		panelCustomer.setBounds(0, 0, 661, 57);
		panelAddCUst.add(panelCustomer);
		
		JLabel lblNewLabel_7 = new JLabel("Customer");
		lblNewLabel_7.setBounds(313, 10, 96, 37);
		panelCustomer.add(lblNewLabel_7);
		
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
         
        panelAddOperator = new JPanel();
        panelAddOperator.setLayout(null);
        panelAddOperator.setBackground(new Color(244, 164, 96));
        panelAddOperator.setBounds(0, 0, 663, 512);
      //invisible au debut
        panelAddOperator.setVisible(false);
        panelAcceuil.add(panelAddOperator);
        
        
        
        JPanel panel_op = new JPanel();
        panel_op.setLayout(null);
        panel_op.setBackground(SystemColor.textHighlight);
        panel_op.setBounds(0, 0, 661, 57);
        panelAddOperator.add(panel_op);
        
        JLabel lblNewLabel_2 = new JLabel("Operator");
        lblNewLabel_2.setBounds(313, 10, 96, 25);
        panel_op.add(lblNewLabel_2);
        
        JButton btnNewButton_4_3 = new JButton("Add Operator");
        btnNewButton_4_3.setBackground(Color.LIGHT_GRAY);
        btnNewButton_4_3.setBounds(0, 59, 344, 44);
        panelAddOperator.add(btnNewButton_4_3);
        
        JButton btnNewButton_4_1_2 = new JButton("Display List");
        btnNewButton_4_1_2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		showpanelListOperateur();
        	}
        });
        btnNewButton_4_1_2.setBackground(new Color(220, 220, 220));
        btnNewButton_4_1_2.setBounds(344, 59, 317, 44);
        panelAddOperator.add(btnNewButton_4_1_2);
        
        textField_5 = new JTextField();
        textField_5.setColumns(10);
        textField_5.setBounds(325, 193, 235, 19);
        panelAddOperator.add(textField_5);
        
        JLabel IDLabel_1 = new JLabel("ID-OPERATOR");
        IDLabel_1.setBounds(166, 195, 96, 16);
        panelAddOperator.add(IDLabel_1);
        
        JLabel FNAMELabel = new JLabel("FIRST NAME");
        FNAMELabel.setBounds(166, 224, 110, 13);
        panelAddOperator.add(FNAMELabel);
        
        textField_6 = new JTextField();
        textField_6.setColumns(10);
        textField_6.setBounds(325, 222, 235, 19);
        panelAddOperator.add(textField_6);
        
        textField_7 = new JTextField();
        textField_7.setColumns(10);
        textField_7.setBounds(325, 255, 235, 19);
        panelAddOperator.add(textField_7);
        
        JLabel LNAMELabel = new JLabel("LAST NAME");
        LNAMELabel.setBounds(166, 259, 96, 13);
        panelAddOperator.add(LNAMELabel);
        
        JLabel STARTLabel = new JLabel("SERVICE START DATE");
        STARTLabel.setBounds(166, 298, 150, 13);
        panelAddOperator.add(STARTLabel);
        
        textField_8 = new JTextField();
        textField_8.setColumns(10);
        textField_8.setBounds(325, 297, 235, 19);
        panelAddOperator.add(textField_8);
        
        textField_9 = new JTextField();
        textField_9.setColumns(10);
        textField_9.setBounds(325, 326, 235, 19);
        panelAddOperator.add(textField_9);
        
        JLabel STOPLabel = new JLabel("SERVICE STOP DATE");
        STOPLabel.setBounds(166, 327, 128, 16);
        panelAddOperator.add(STOPLabel);
        
        JLabel SPECIALLabel = new JLabel("SPECIALITIES");
        SPECIALLabel.setBounds(166, 361, 104, 13);
        panelAddOperator.add(SPECIALLabel);
        
        textField_10 = new JTextField();
        textField_10.setColumns(10);
        textField_10.setBounds(325, 355, 235, 19);
        panelAddOperator.add(textField_10);
        
        textField_11 = new JTextField();
        textField_11.setColumns(10);
        textField_11.setBounds(325, 384, 235, 19);
        panelAddOperator.add(textField_11);
        
        JLabel TELLabel = new JLabel("TELEPHONE");
        TELLabel.setBounds(166, 390, 96, 13);
        panelAddOperator.add(TELLabel);
        
        panelListOperateur = new JPanel();
        panelListOperateur.setLayout(null);
        panelListOperateur.setBackground(new Color(244, 164, 96));
        panelListOperateur.setBounds(0, 0, 663, 512);
        panelListOperateur.setVisible(false);//initialement invisible
        panelAcceuil.add(panelListOperateur);
        
        
        
        JPanel panel_op_list = new JPanel();
        panel_op_list.setLayout(null);
        panel_op_list.setBackground(SystemColor.textHighlight);
        panel_op_list.setBounds(0, 0, 661, 57);
        panelListOperateur.add(panel_op_list);
        
        JLabel lblNewLabel_4 = new JLabel("Operator");
        lblNewLabel_4.setBounds(313, 10, 96, 25);
        panel_op_list.add(lblNewLabel_4);
        
        JButton btnNewButton_4_4 = new JButton("Add Operator");
        btnNewButton_4_4.setBackground(Color.LIGHT_GRAY);
        btnNewButton_4_4.setBounds(0, 59, 344, 44);
        panelListOperateur.add(btnNewButton_4_4);
        
        JButton btnNewButton_4_1_3 = new JButton("Display List");
        btnNewButton_4_1_3.setBackground(new Color(220, 220, 220));
        btnNewButton_4_1_3.setBounds(344, 59, 317, 44);
        panelListOperateur.add(btnNewButton_4_1_3);
        
        JButton btnNewButton_7_1 = new JButton("DELETE");
        btnNewButton_7_1.setBounds(465, 436, 104, 35);
        panelListOperateur.add(btnNewButton_7_1);
        
        JScrollPane scrollPane_1 = new JScrollPane();
        scrollPane_1.setBounds(82, 155, 451, 233);
        panelListOperateur.add(scrollPane_1);
        
        table_1 = new JTable();
        scrollPane_1.setViewportView(table_1);
        table_1.setModel(new DefaultTableModel(
        	new Object[][] {
        		{null, null, null},
        		{null, null, null},
        		{null, null, null},
        		{null, null, null},
        		{null, null, null},
        		{null, null, null},
        		{null, null, null},
        		{null, null, null},
        		{null, null, null},
        		{null, null, null},
        		{null, null, null},
        		{null, null, null},
        		{null, null, null},
        	},
        	new String[] {
        		"ID-OPERATOR", "OPERATOR", "SPECIALITY"
        	}
        ));
        
        panelDevis = new JPanel();
        panelDevis.setLayout(null);
        panelDevis.setBackground(new Color(244, 164, 96));
        panelDevis.setBounds(0, 0, 616, 512);
        panelDevis.setVisible(false);
        panelAcceuil.add(panelDevis);
        
        JPanel panelManLabel = new JPanel();
        panelManLabel.setLayout(null);
        panelManLabel.setBackground(SystemColor.textHighlight);
        panelManLabel.setBounds(0, 0, 661, 57);
        panelDevis.add(panelManLabel);
        
        JLabel lblNewLabel_3 = new JLabel("Operator");
        lblNewLabel_3.setBounds(313, 10, 96, 25);
        panelManLabel.add(lblNewLabel_3);
        
        JButton btnNewButton_4_2_1 = new JButton("Quote");
        btnNewButton_4_2_1.setBackground(SystemColor.activeCaptionBorder);
        btnNewButton_4_2_1.setBounds(0, 59, 344, 44);
        panelDevis.add(btnNewButton_4_2_1);
        
        JButton btnNewButton_4_1_1_1 = new JButton("Modifiy quote");
        btnNewButton_4_1_1_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		showpanelMod_Devis();
        	}
        });
        btnNewButton_4_1_1_1.setBackground(SystemColor.activeCaptionBorder);
        btnNewButton_4_1_1_1.setBounds(343, 59, 318, 44);
        panelDevis.add(btnNewButton_4_1_1_1);
        
        JButton Save_Button = new JButton("Save");
        Save_Button.setBounds(71, 445, 106, 35);
        panelDevis.add(Save_Button);
        
        JTextPane textPane = new JTextPane();
        textPane.setBackground(new Color(255, 250, 240));
        textPane.setBounds(71, 148, 186, 91);
        panelDevis.add(textPane);
        
        Label label = new Label("Date :");
        label.setBounds(412, 121, 67, 21);
        panelDevis.add(label);
        
        TextField textField_12 = new TextField();
        textField_12.setBounds(485, 121, 101, 21);
        panelDevis.add(textField_12);
        
        TextField textField_2_1 = new TextField();
        textField_2_1.setBounds(485, 148, 101, 21);
        panelDevis.add(textField_2_1);
        
        Label label_2 = new Label("N° :");
        label_2.setBounds(412, 148, 47, 21);
        panelDevis.add(label_2);
        
        Label label_3 = new Label("Customer :");
        label_3.setBounds(412, 185, 67, 21);
        panelDevis.add(label_3);
        
        TextField textField_3_1 = new TextField();
        textField_3_1.setBounds(485, 185, 101, 21);
        panelDevis.add(textField_3_1);
        
        JScrollPane scrollPane_2 = new JScrollPane();
        scrollPane_2.setBounds(45, 249, 405, 105);
        panelDevis.add(scrollPane_2);
        
        table_2 = new JTable();
        scrollPane_2.setViewportView(table_2);
        table_2.setModel(new DefaultTableModel(
        	new Object[][] {
        		{null, null, null, null},
        		{null, null, null, null},
        		{null, null, null, null},
        		{null, null, null, null},
        		{null, null, null, null},
        	},
        	new String[] {
        		"Description", "Quantity", "Unit Price", "Total Price HT"
        	}
        ));
        
        JScrollPane scrollPane_3 = new JScrollPane();
        scrollPane_3.setBounds(234, 362, 318, 44);
        panelDevis.add(scrollPane_3);
        
        table_3 = new JTable();
        scrollPane_3.setViewportView(table_3);
        table_3.setModel(new DefaultTableModel(
        	new Object[][] {
        		{null, null, null},
        	},
        	new String[] {
        		"Total HT", "TVA", "Total TTC"
        	}
        ));
        
        panelMod_Devis = new JPanel();
        panelMod_Devis.setLayout(null);
        panelMod_Devis.setBackground(new Color(244, 164, 96));
        panelMod_Devis.setBounds(0, 0, 663, 512);
        panelMod_Devis.setVisible(false);
        panelAcceuil.add(panelMod_Devis);
        
        JPanel panelManLabel_1 = new JPanel();
        panelManLabel_1.setLayout(null);
        panelManLabel_1.setBackground(SystemColor.textHighlight);
        panelManLabel_1.setBounds(0, 0, 661, 57);
        panelMod_Devis.add(panelManLabel_1);
        
        JLabel lblNewLabel_5 = new JLabel("Operator");
        lblNewLabel_5.setBounds(313, 10, 96, 25);
        panelManLabel_1.add(lblNewLabel_5);
        
        JButton btnNewButton_4_2_2 = new JButton("Quote");
        btnNewButton_4_2_2.setBackground(SystemColor.activeCaptionBorder);
        btnNewButton_4_2_2.setBounds(0, 59, 344, 44);
        panelMod_Devis.add(btnNewButton_4_2_2);
        
        JButton btnNewButton_4_1_1_2 = new JButton("Modifiy quote");
        btnNewButton_4_1_1_2.setBackground(SystemColor.activeCaptionBorder);
        btnNewButton_4_1_1_2.setBounds(343, 59, 318, 44);
        panelMod_Devis.add(btnNewButton_4_1_1_2);
        
        TextField textField_13 = new TextField();
        textField_13.setBounds(210, 148, 297, 28);
        panelMod_Devis.add(textField_13);
        
        Label label_1 = new Label("Resquest N° :");
        label_1.setBounds(103, 155, 118, 21);
        panelMod_Devis.add(label_1);
        
        Label label_1_1 = new Label("Result quote :");
        label_1_1.setBounds(103, 296, 90, 21);
        panelMod_Devis.add(label_1_1);
        
        TextField textField_1_1 = new TextField();
        textField_1_1.setBounds(210, 289, 297, 28);
        panelMod_Devis.add(textField_1_1);
        
        JButton btnNewButton_7_1_1 = new JButton("search");
        btnNewButton_7_1_1.setBounds(309, 215, 85, 28);
        panelMod_Devis.add(btnNewButton_7_1_1);
        
        JButton btnNewButton_7_2 = new JButton("Modify");
        btnNewButton_7_2.setBounds(309, 365, 90, 28);
        panelMod_Devis.add(btnNewButton_7_2);
        
        panelTicket = new JPanel();
        panelTicket.setLayout(null);
        panelTicket.setBackground(new Color(244, 164, 96));
        panelTicket.setBounds(0, 0, 663, 512);
        panelTicket.setVisible(false);
        panelAcceuil.add(panelTicket);
        
        JPanel panelTicketLabel = new JPanel();
        panelTicketLabel.setLayout(null);
        panelTicketLabel.setBackground(SystemColor.textHighlight);
        panelTicketLabel.setBounds(0, 0, 661, 57);
        panelTicket.add(panelTicketLabel);
        
        JLabel lblNewLabel_6 = new JLabel("Ticket tracking");
        lblNewLabel_6.setBounds(313, 10, 96, 37);
        panelTicketLabel.add(lblNewLabel_6);
        
        JTextPane textPane_1 = new JTextPane();
        textPane_1.setBackground(new Color(255, 250, 240));
        textPane_1.setBounds(10, 67, 237, 106);
        panelTicket.add(textPane_1);
        
        JSeparator separator = new JSeparator();
        separator.setOrientation(SwingConstants.VERTICAL);
        separator.setBounds(358, 67, 7, 120);
        panelTicket.add(separator);
        
        JSeparator separator_1 = new JSeparator();
        separator_1.setBounds(0, 183, 661, 2);
        panelTicket.add(separator_1);
        
        Label label_2_1 = new Label("Devise N° :");
        label_2_1.setBounds(479, 63, 67, 21);
        panelTicket.add(label_2_1);
        
        Label label_3_1 = new Label("Customer :");
        label_3_1.setBounds(479, 90, 67, 21);
        panelTicket.add(label_3_1);
        
        TextField textField_3_2 = new TextField();
        textField_3_2.setBounds(552, 90, 101, 21);
        panelTicket.add(textField_3_2);
        
        TextField textField_2_2 = new TextField();
        textField_2_2.setBounds(552, 63, 101, 21);
        panelTicket.add(textField_2_2);
        
        TextField textField_5_1 = new TextField();
        textField_5_1.setBounds(552, 117, 101, 21);
        panelTicket.add(textField_5_1);
        
        Label label_5 = new Label("Tel :");
        label_5.setBounds(479, 117, 41, 21);
        panelTicket.add(label_5);
        
        TextField textField_14 = new TextField();
        textField_14.setBounds(371, 221, 101, 21);
        panelTicket.add(textField_14);
        
        TextField textField_4_1 = new TextField();
        textField_4_1.setBounds(529, 221, 85, 21);
        panelTicket.add(textField_4_1);
        
        TextField textField_1_2 = new TextField();
        textField_1_2.setBounds(40, 221, 205, 21);
        panelTicket.add(textField_1_2);
        
        JEditorPane editorPane = new JEditorPane();
        editorPane.setBounds(41, 275, 573, 61);
        panelTicket.add(editorPane);
        
        Label label_1_1_1 = new Label("Description");
        label_1_1_1.setBounds(37, 248, 113, 21);
        panelTicket.add(label_1_1_1);
        
        JEditorPane editorPane_1 = new JEditorPane();
        editorPane_1.setBounds(44, 369, 573, 33);
        panelTicket.add(editorPane_1);
        
        Label label_1_1_1_1 = new Label("Comments/Observations");
        label_1_1_1_1.setBounds(40, 342, 158, 21);
        panelTicket.add(label_1_1_1_1);
        
        Label label_1_2 = new Label("Customer remarks");
        label_1_2.setBounds(44, 414, 128, 21);
        panelTicket.add(label_1_2);
        
        TextField textField_1_1_1 = new TextField();
        textField_1_1_1.setBounds(40, 441, 164, 30);
        panelTicket.add(textField_1_1_1);
        
        JSeparator separator_2 = new JSeparator();
        separator_2.setOrientation(SwingConstants.VERTICAL);
        separator_2.setBounds(345, 407, 7, 64);
        panelTicket.add(separator_2);
        
        JSeparator separator_1_1_1 = new JSeparator();
        separator_1_1_1.setBounds(80, 469, 516, 2);
        panelTicket.add(separator_1_1_1);
        
        TextField textField_1_1_1_1 = new TextField();
        textField_1_1_1_1.setBounds(442, 436, 172, 35);
        panelTicket.add(textField_1_1_1_1);
        
        Label label_1_2_1 = new Label("Customer signature");
        label_1_2_1.setBounds(481, 408, 123, 21);
        panelTicket.add(label_1_2_1);
        
        JButton btnNewButton_7_3 = new JButton("Validate");
        btnNewButton_7_3.setBounds(305, 481, 85, 21);
        panelTicket.add(btnNewButton_7_3);
        
        Label label_1_3 = new Label("Operator");
        label_1_3.setBounds(67, 194, 83, 21);
        panelTicket.add(label_1_3);
        
        Label label_4 = new Label("Date / Heure");
        label_4.setBounds(387, 194, 85, 21);
        panelTicket.add(label_4);
        
        Label label_4_1 = new Label("Durée");
        label_4_1.setBounds(547, 194, 67, 21);
        panelTicket.add(label_4_1);
        
        panelResquet = new JPanel();
        panelResquet.setLayout(null);
        panelResquet.setBackground(new Color(244, 164, 96));
        panelResquet.setBounds(0, 0, 663, 512);
        panelResquet.setVisible(false);
        panelAcceuil.add(panelResquet);
        
        JDesktopPane desktopPane_2 = new JDesktopPane();
        desktopPane_2.setBackground(Color.BLUE);
        desktopPane_2.setBounds(61, 49, 546, 92);
        panelResquet.add(desktopPane_2);
        
        JLabel lblNewLabel_8 = new JLabel("MAINTENANCE REQUEST");
        lblNewLabel_8.setBounds(214, 23, 190, 48);
        desktopPane_2.add(lblNewLabel_8);
        
        textField_15 = new JTextField();
        textField_15.setColumns(10);
        textField_15.setBounds(100, 177, 96, 19);
        panelResquet.add(textField_15);
        
        textField_16 = new JTextField();
        textField_16.setColumns(10);
        textField_16.setBounds(254, 218, 348, 19);
        panelResquet.add(textField_16);
        
        textField_17 = new JTextField();
        textField_17.setColumns(10);
        textField_17.setBounds(254, 262, 348, 19);
        panelResquet.add(textField_17);
        
        textField_18 = new JTextField();
        textField_18.setColumns(10);
        textField_18.setBounds(254, 305, 348, 19);
        panelResquet.add(textField_18);
        
        textField_19 = new JTextField();
        textField_19.setColumns(10);
        textField_19.setBounds(10, 359, 643, 92);
        panelResquet.add(textField_19);
        
        textField_20 = new JTextField();
        textField_20.setColumns(10);
        textField_20.setBounds(537, 177, 96, 19);
        panelResquet.add(textField_20);
        
        textField_21 = new JTextField();
        textField_21.setColumns(10);
        textField_21.setBounds(351, 151, 96, 19);
        panelResquet.add(textField_21);
        
        JLabel lblNewLabel_1_2 = new JLabel("DATE :");
        lblNewLabel_1_2.setBounds(45, 178, 45, 16);
        panelResquet.add(lblNewLabel_1_2);
        
        JLabel lblNewLabel_2_1 = new JLabel("Resquestin agency :");
        lblNewLabel_2_1.setBounds(100, 218, 144, 19);
        panelResquet.add(lblNewLabel_2_1);
        
        JLabel lblNewLabel_5_1 = new JLabel("Reason for request :");
        lblNewLabel_5_1.setBounds(10, 334, 124, 13);
        panelResquet.add(lblNewLabel_5_1);
       
        
        
        
        JLabel lblNewLabel_6_1 = new JLabel("TIME : ");
        lblNewLabel_6_1.setBounds(474, 177, 57, 19);
        panelResquet.add(lblNewLabel_6_1);
        
        JLabel lblNewLabel_3_2 = new JLabel("Name of Resquestin :");
        lblNewLabel_3_2.setBounds(100, 262, 144, 19);
        panelResquet.add(lblNewLabel_3_2);
        
        JLabel lblNewLabel_4_1 = new JLabel("Location :");
        lblNewLabel_4_1.setBounds(100, 305, 101, 19);
        panelResquet.add(lblNewLabel_4_1);
        
        JLabel lblNewLabel_7_1 = new JLabel("N° :");
        lblNewLabel_7_1.setBounds(311, 154, 45, 16);
        panelResquet.add(lblNewLabel_7_1);
        
        JButton btnNewButton_6 = new JButton("Submit");
        btnNewButton_6.setBounds(535, 474, 99, 28);
        panelResquet.add(btnNewButton_6);
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
   
    private void showpanelAddOperator() {
    	panelDisplayList_1.setVisible(false);
    	panelAddOperator.setVisible(true);
    }
    
    private void showpanelListOperateur() {
    	panelAddOperator.setVisible(false);
    	panelListOperateur.setVisible(true);
    }
    private void showpanelDevis() {
    	panelListOperateur.setVisible(false);
    	panelDevis.setVisible(true);	
    }
    private void showpanelMod_Devis() {
    	panelDevis.setVisible(false);
    	panelMod_Devis.setVisible(true);	
    }
    private void showpanelTicket() {
    	panelMod_Devis.setVisible(false);
    	panelTicket.setVisible(true);	
    }
     
    private void showpanelResquet() {
    	panelTicket.setVisible(false);
    	panelResquet.setVisible(true);	
    }

}
