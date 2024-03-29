package qiren.view;

/**
 * 
 * @author qiren
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import qiren.model.*;

@SuppressWarnings("serial")
public class CalculatorView extends JFrame {
	private JPanel standardCal;
	private JPanel extendCal;
	private JButton calcuteButton;
	private JButton resetButton;
	private JComboBox cityComboBox;
	private JLabel thresholdLabel;
	private JLabel salaryLabel;
	private JLabel insuranceLabel;
	private JLabel salaryAfterTaxLabel;
	private JLabel individualIncomeTaxLabel;
	private JLabel cityLabel;
	private JScrollPane jScrollPane1;
	private JSeparator jSeparator;
	private JTextArea displayTextArea;
	private JTextField thresholdField;
	private JTextField salaryField;
	private JTextField insuranceTextField;
	private JTextField salaryAfterTaxTextField;
	private JTextField individualIncomeTaxTextField;
	private JMenu viewMenu;
	private JMenu helpMenu;
	private JMenuBar jMenuBar1;
	private JMenuItem helpMenuItem;
	private JMenuItem aboutMenuItem;
	private JRadioButtonMenuItem jRadioButtonMenuItem1;
	private JRadioButtonMenuItem jRadioButtonMenuItem2;
	private ButtonGroup buttonGroup1;
	
	
	private JButton calcuteButton2;
	private JButton resetButton2;
	private JLabel thresholdLabel2;
	private JLabel dateLabel;
	private JLabel salaryLabel2;
	private JLabel salaryAfterTaxLabel2;
	private JLabel individualIncomeTaxLabel2;
	private JScrollPane jScrollPane2;
	private JSeparator jSeparator2;
	private JTextArea displayTextArea2;
	private JTextField thresholdField2;
	private JTextField salaryField2;
	private JTextField salaryAfterTaxTextField2;
	private JTextField individualIncomeTaxTextField2;
	private JComboBox yearComboBox;
	private JComboBox monthComboBox;
	
	private GroupLayout layout;
	private GroupLayout layout2;
	
	IndividualIncomeTax taxCal = new IndividualIncomeTax();

	private double salary = 0;
	private int pressEnterNum = 0;
	private String textMessage = null;
	

	/**
	 * Creates new form NewJFrame
	 */
	public CalculatorView() {
	
		initComponents();

	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */

	
	@SuppressWarnings("deprecation")
	private void initComponents() {
		standardCal = new JPanel();
		extendCal = new JPanel();
		cityLabel = new JLabel();
		buttonGroup1 = new ButtonGroup();
		jMenuBar1 = new JMenuBar();
		viewMenu = new JMenu();
		jRadioButtonMenuItem1 = new JRadioButtonMenuItem();
		jRadioButtonMenuItem2 = new JRadioButtonMenuItem();
		helpMenu = new JMenu();
		helpMenuItem = new JMenuItem();
		aboutMenuItem = new JMenuItem();
		
		calcuteButton = new JButton();
		resetButton = new JButton();
		cityComboBox = new JComboBox();
		jScrollPane1 = new JScrollPane();
		displayTextArea = new JTextArea();
		thresholdLabel = new JLabel();
		thresholdField = new JTextField();
		salaryLabel = new JLabel();
		salaryField = new JTextField();
		insuranceLabel = new JLabel();
		insuranceTextField = new JTextField();
		jSeparator = new JSeparator();
		salaryAfterTaxLabel = new JLabel();
		individualIncomeTaxLabel = new JLabel();
		salaryAfterTaxTextField = new JTextField();
		individualIncomeTaxTextField = new JTextField();
		
		dateLabel = new JLabel();
		yearComboBox = new JComboBox();
        monthComboBox = new JComboBox();    
		calcuteButton2 = new JButton();
		resetButton2= new JButton();
		jScrollPane2 = new JScrollPane();
		displayTextArea2 = new JTextArea();
		thresholdLabel2 = new JLabel();
		thresholdField2 = new JTextField();
		salaryLabel2 = new JLabel();
		salaryField2 = new JTextField();
		jSeparator2 = new JSeparator();
		salaryAfterTaxLabel2 = new JLabel();
		individualIncomeTaxLabel2 = new JLabel();
		salaryAfterTaxTextField2 = new JTextField();
		individualIncomeTaxTextField2 = new JTextField();
		
		
		this.add(standardCal);
		this.add(extendCal);
		layout = new GroupLayout(standardCal);
		layout2 = new GroupLayout(extendCal);
		standardCal.setLayout(layout);
		extendCal.setLayout(layout2);
		this.setContentPane(standardCal);
		
        
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		setTitle("个税计算器");
		calcuteButton.setText("计算");		
		calcuteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				calcuteButtonActionPerformed(evt);
			}
		});

		resetButton.setText("重置");
		resetButton.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent evt) {
				resetButtonMouseClicked(evt);
			}
		});
		resetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				resetButtonActionPerformed(evt);
			}
		});

		cityComboBox.setModel(new DefaultComboBoxModel(new String[] { "北京", "上海",
				"广州", "深圳" }));
		cityComboBox.setSelectedIndex(2);
		
		jScrollPane1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

		displayTextArea.setColumns(20);
		displayTextArea.setRows(5);
		jScrollPane1.setViewportView(displayTextArea);

		thresholdLabel.setHorizontalAlignment(SwingConstants.CENTER);
		thresholdLabel.setText("起征点");

		thresholdField.setHorizontalAlignment(JTextField.CENTER);
		thresholdField.setText(String.valueOf(taxCal.getThreshold()));

		thresholdField.setDisabledTextColor(new Color(255, 0, 0));
		thresholdField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				thresholdFieldActionPerformed(evt);
			}
		});

		salaryField.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent evt) {
				salaryFieldKeyPressed(evt);
			}
		});

		salaryLabel.setHorizontalAlignment(SwingConstants.CENTER);
		salaryLabel.setText(" 税前月收入");

		salaryField.setHorizontalAlignment(JTextField.CENTER);
		salaryField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				salaryFieldActionPerformed(evt);
			}
		});

		insuranceLabel.setHorizontalAlignment(SwingConstants.CENTER);
		insuranceLabel.setText("社保公积金");
		insuranceTextField.disable();
		insuranceTextField.setDisabledTextColor(new Color(255, 0, 0));
		insuranceTextField.setHorizontalAlignment(JTextField.CENTER);
		insuranceTextField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				insuranceTextFieldActionPerformed(evt);
			}
		});
		individualIncomeTaxTextField.disable();
		individualIncomeTaxTextField.setDisabledTextColor(new Color(255, 0, 0));
		salaryAfterTaxLabel.setHorizontalAlignment(SwingConstants.CENTER);
		salaryAfterTaxLabel.setText("税后月收入");
		salaryAfterTaxTextField.disable();
		salaryAfterTaxTextField.setDisabledTextColor(new Color(255, 0, 0));
		individualIncomeTaxTextField.setDisabledTextColor(new Color(255, 0, 0));
		individualIncomeTaxLabel.setHorizontalAlignment(SwingConstants.CENTER);
		individualIncomeTaxLabel.setText(" 应缴个税");

		salaryAfterTaxTextField.setHorizontalAlignment(JTextField.CENTER);
		salaryAfterTaxTextField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				salaryAfterTaxTextFieldActionPerformed(evt);
			}
		});

		individualIncomeTaxTextField.setHorizontalAlignment(JTextField.CENTER);
		individualIncomeTaxTextField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				individualIncomeTaxTextFieldActionPerformed(evt);
			}
		});

		cityLabel.setHorizontalAlignment(SwingConstants.CENTER);
		cityLabel.setText("选择城市");

		/**
		 * The layout of the calculator used to calculate 
		 * each tax
		 * 
		 */
		calcuteButton2.setText("计算");
        calcuteButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
               // calcuteButton2MouseClicked(evt);
            }
        });
        calcuteButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcuteButton2ActionPerformed(evt);
            }
        });

        resetButton2.setText("重置");
        resetButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
               // resetButton2MouseClicked(evt);
            }
        });
        resetButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButton2ActionPerformed(evt);
            }
        });

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        displayTextArea2.setColumns(20);
        displayTextArea2.setRows(5);
        jScrollPane2.setViewportView(displayTextArea2);

        dateLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dateLabel.setText("时间（年/月）");

        thresholdField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        thresholdField2.setText(String.valueOf(taxCal.getThreshold()));
        

        salaryLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        salaryLabel2.setText("税前单笔收入");

        salaryField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        salaryField2.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent evt) {
				salaryFieldKeyPressed2(evt);
			}

			private void salaryFieldKeyPressed2(KeyEvent evt) {
				// TODO Auto-generated method stub
				if (evt.getKeyCode() == 10) 
					produceDataToUser();
				
			}
			
        });

        salaryAfterTaxLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        salaryAfterTaxLabel2.setText("税后单笔收入");

        individualIncomeTaxLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        individualIncomeTaxLabel2.setText(" 应缴个税");

        salaryAfterTaxTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        salaryAfterTaxTextField2.disable();
        salaryAfterTaxTextField2.setDisabledTextColor(new Color(255, 0, 0));
        
        individualIncomeTaxTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        individualIncomeTaxTextField2.disable();
        individualIncomeTaxTextField2.setDisabledTextColor(new Color(255, 0, 0));

        thresholdLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        thresholdLabel2.setText("起征点");

        yearComboBox.setModel(new DefaultComboBoxModel(new String[] { "2015", "2014","2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005" }));

        monthComboBox.setModel(new DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        yearComboBox.setSelectedIndex(3);
        monthComboBox.setSelectedIndex(9);
        
        layout2.setHorizontalGroup(
            layout2.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout2.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout2.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout2.createSequentialGroup()
                        .addGroup(layout2.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout2.createSequentialGroup()
                                .addGroup(layout2.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(dateLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout2.createSequentialGroup()
                                        .addComponent(salaryLabel2)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(calcuteButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(thresholdLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout2.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(resetButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(salaryField2)
                            .addComponent(thresholdField2)
                            .addGroup(layout2.createSequentialGroup()
                                .addComponent(yearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(monthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout2.createSequentialGroup()
                        .addComponent(individualIncomeTaxLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(individualIncomeTaxTextField2))
                    .addGroup(layout2.createSequentialGroup()
                        .addComponent(salaryAfterTaxLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(salaryAfterTaxTextField2)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        layout2.setVerticalGroup(
            layout2.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout2.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout2.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout2.createSequentialGroup()
                        .addGroup(layout2.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(thresholdLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(thresholdField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout2.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(monthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout2.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(salaryLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(salaryField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(layout2.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(calcuteButton2)
                            .addComponent(resetButton2))
                        .addGap(45, 45, 45)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addGroup(layout2.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(salaryAfterTaxLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(salaryAfterTaxTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addGroup(layout2.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(individualIncomeTaxLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(individualIncomeTaxTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        
	
		
		viewMenu.setText("视图");

		jRadioButtonMenuItem1.setSelected(true);
		jRadioButtonMenuItem1.setText("标准型");

		viewMenu.add(jRadioButtonMenuItem1);
		jRadioButtonMenuItem1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				jRadioButtonMenuItem1ActionPerformed(evt);
			}

		});
		jRadioButtonMenuItem2.setText("单笔计算型");
		jRadioButtonMenuItem2.setToolTipText("计算每月单笔收入");
		viewMenu.add(jRadioButtonMenuItem2);
		jRadioButtonMenuItem2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt) {
				jRadioButtonMenuItem2ActionPerformed(evt);
				
			}
			
			
		});
		
		jMenuBar1.add(viewMenu);
		helpMenu.setText("帮助");
		helpMenuItem.setText("查看帮助");
		helpMenu.add(helpMenuItem);
		helpMenuItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent evt) {
				// TODO Auto-generated method stub
				helpMenuItemActionPerformed(evt);
			}

			private void helpMenuItemActionPerformed(ActionEvent evt) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "兄弟你就这点出息么，这么简单还看帮助文件！！");
			}
		});
		aboutMenuItem.setText("关于");
		helpMenu.add(aboutMenuItem);
		jMenuBar1.add(helpMenu);
		aboutMenuItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent evt) {
				// TODO Auto-generated method stub
				aboutMenuItemActionPerformed(evt);
			}

			private void aboutMenuItemActionPerformed(ActionEvent evt) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "个税计算器 1.0版\n\t--作者：漆仁");
			}
		});
		buttonGroup1.add(jRadioButtonMenuItem1);
		buttonGroup1.add(jRadioButtonMenuItem2);
		setJMenuBar(jMenuBar1);
						
		//this.getComponent(0).setVisible(true);
		layout.setHorizontalGroup(layout
				.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGap(35, 35, 35)
								.addGroup(
										layout.createParallelGroup(
												GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createSequentialGroup()
																.addGroup(
																		layout.createParallelGroup(
																				GroupLayout.Alignment.LEADING)
																				.addGroup(
																						layout.createSequentialGroup()
																								.addGroup(
																										layout.createParallelGroup(
																												GroupLayout.Alignment.LEADING,
																												false)
																												.addComponent(
																														thresholdLabel,
																														GroupLayout.Alignment.TRAILING,
																														GroupLayout.DEFAULT_SIZE,
																														GroupLayout.DEFAULT_SIZE,
																														Short.MAX_VALUE)
																												.addGroup(
																														layout.createSequentialGroup()
																																.addGroup(
																																		layout.createParallelGroup(
																																				GroupLayout.Alignment.LEADING)
																																				.addComponent(
																																						insuranceLabel)
																																				.addComponent(
																																						salaryLabel))
																																.addGap(0,
																																		6,
																																		Short.MAX_VALUE))
																												.addComponent(
																														calcuteButton,
																														GroupLayout.DEFAULT_SIZE,
																														GroupLayout.DEFAULT_SIZE,
																														Short.MAX_VALUE))
																								.addGap(0,
																										0,
																										Short.MAX_VALUE))
																				.addComponent(
																						cityLabel,
																						GroupLayout.Alignment.TRAILING,
																						GroupLayout.DEFAULT_SIZE,
																						82,
																						Short.MAX_VALUE))
																.addPreferredGap(
																		LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(
																		layout.createParallelGroup(
																				GroupLayout.Alignment.LEADING,
																				false)
																				.addComponent(
																						resetButton,
																						GroupLayout.DEFAULT_SIZE,
																						GroupLayout.DEFAULT_SIZE,
																						Short.MAX_VALUE)
																				.addComponent(
																						insuranceTextField)
																				.addComponent(
																						salaryField)
																				.addComponent(
																						thresholdField)
																				.addComponent(
																						cityComboBox,
																						0,
																						81,
																						Short.MAX_VALUE)))
												.addGroup(
														GroupLayout.Alignment.TRAILING,
														layout.createSequentialGroup()
																.addGroup(
																		layout.createParallelGroup(
																				GroupLayout.Alignment.TRAILING)
																				.addComponent(
																						jSeparator)
																				.addGroup(
																						layout.createSequentialGroup()
																								.addGroup(
																										layout.createParallelGroup(
																												GroupLayout.Alignment.TRAILING,
																												false)
																												.addComponent(
																														individualIncomeTaxLabel,
																														GroupLayout.DEFAULT_SIZE,
																														GroupLayout.DEFAULT_SIZE,
																														Short.MAX_VALUE)
																												.addComponent(
																														salaryAfterTaxLabel,
																														GroupLayout.DEFAULT_SIZE,
																														GroupLayout.DEFAULT_SIZE,
																														Short.MAX_VALUE))
																								.addGap(28,
																										28,
																										28)
																								.addGroup(
																										layout.createParallelGroup(
																												GroupLayout.Alignment.LEADING)
																												.addComponent(
																														salaryAfterTaxTextField,
																														GroupLayout.DEFAULT_SIZE,
																														81,
																														Short.MAX_VALUE)
																												.addComponent(
																														individualIncomeTaxTextField,
																														GroupLayout.DEFAULT_SIZE,
																														81,
																														Short.MAX_VALUE))))
																.addGap(1, 1, 1)))
								.addGap(47, 47, 47)
								.addComponent(jScrollPane1,
										GroupLayout.PREFERRED_SIZE, 219,
										GroupLayout.PREFERRED_SIZE)
								.addGap(20, 20, 20)));
		layout.setVerticalGroup(layout
				.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGap(33, 33, 33)
								.addGroup(
										layout.createParallelGroup(
												GroupLayout.Alignment.TRAILING)
												.addComponent(
														jScrollPane1,
														GroupLayout.PREFERRED_SIZE,
														386,
														GroupLayout.PREFERRED_SIZE)
												.addGroup(
														layout.createSequentialGroup()
																.addGroup(
																		layout.createParallelGroup(
																				GroupLayout.Alignment.BASELINE)
																				.addComponent(
																						cityComboBox,
																						GroupLayout.PREFERRED_SIZE,
																						GroupLayout.DEFAULT_SIZE,
																						GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						cityLabel,
																						GroupLayout.PREFERRED_SIZE,
																						22,
																						GroupLayout.PREFERRED_SIZE))
																.addGap(18, 18,
																		18)
																.addGroup(
																		layout.createParallelGroup(
																				GroupLayout.Alignment.LEADING)
																				.addComponent(
																						thresholdField,
																						GroupLayout.PREFERRED_SIZE,
																						GroupLayout.DEFAULT_SIZE,
																						GroupLayout.PREFERRED_SIZE)
																				.addGroup(
																						layout.createSequentialGroup()
																								.addGap(5,
																										5,
																										5)
																								.addComponent(
																										thresholdLabel,
																										GroupLayout.PREFERRED_SIZE,
																										22,
																										GroupLayout.PREFERRED_SIZE)))
																.addPreferredGap(
																		LayoutStyle.ComponentPlacement.UNRELATED)
																.addGroup(
																		layout.createParallelGroup(
																				GroupLayout.Alignment.LEADING)
																				.addComponent(
																						salaryField,
																						GroupLayout.PREFERRED_SIZE,
																						GroupLayout.DEFAULT_SIZE,
																						GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						salaryLabel,
																						GroupLayout.PREFERRED_SIZE,
																						29,
																						GroupLayout.PREFERRED_SIZE))
																.addGap(18, 18,
																		18)
																.addGroup(
																		layout.createParallelGroup(
																				GroupLayout.Alignment.BASELINE)
																				.addComponent(
																						insuranceTextField,
																						GroupLayout.PREFERRED_SIZE,
																						GroupLayout.DEFAULT_SIZE,
																						GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						insuranceLabel,
																						GroupLayout.PREFERRED_SIZE,
																						29,
																						GroupLayout.PREFERRED_SIZE))
																.addGap(43, 43,
																		43)
																.addGroup(
																		layout.createParallelGroup(
																				GroupLayout.Alignment.BASELINE)
																				.addComponent(
																						calcuteButton)
																				.addComponent(
																						resetButton))
																.addGap(38, 38,
																		38)
																.addComponent(
																		jSeparator,
																		GroupLayout.PREFERRED_SIZE,
																		GroupLayout.DEFAULT_SIZE,
																		GroupLayout.PREFERRED_SIZE)
																.addGap(34, 34,
																		34)
																.addGroup(
																		layout.createParallelGroup(
																				GroupLayout.Alignment.BASELINE)
																				.addComponent(
																						salaryAfterTaxLabel,
																						GroupLayout.PREFERRED_SIZE,
																						29,
																						GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						salaryAfterTaxTextField,
																						GroupLayout.PREFERRED_SIZE,
																						GroupLayout.DEFAULT_SIZE,
																						GroupLayout.PREFERRED_SIZE))
																.addGap(18, 18,
																		18)
																.addGroup(
																		layout.createParallelGroup(
																				GroupLayout.Alignment.BASELINE)
																				.addComponent(
																						individualIncomeTaxLabel,
																						GroupLayout.PREFERRED_SIZE,
																						29,
																						GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						individualIncomeTaxTextField,
																						GroupLayout.PREFERRED_SIZE,
																						GroupLayout.DEFAULT_SIZE,
																						GroupLayout.PREFERRED_SIZE))))
								.addContainerGap(105, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>

	private void resetButtonActionPerformed(ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void thresholdFieldActionPerformed(ActionEvent evt) {
		// TODO add your handling code here:
		taxCal.setThreshold(Double.valueOf(thresholdField.getText()));

	}

	private void salaryFieldActionPerformed(ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void insuranceTextFieldActionPerformed(ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void salaryAfterTaxTextFieldActionPerformed(ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void individualIncomeTaxTextFieldActionPerformed(ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jRadioButtonMenuItem1ActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		if (jRadioButtonMenuItem1.isSelected()) {
			this.setContentPane(standardCal);
			pack();		
			this.repaint();
			this.getContentPane().setVisible(true);
		}

	}
	
	private void jRadioButtonMenuItem2ActionPerformed(ActionEvent evt) {
		if (jRadioButtonMenuItem2.isSelected()) {			
			this.setContentPane(extendCal);
			pack();		
			this.repaint();
			this.getContentPane().setVisible(true);					
		}
	}

	private void resetButtonMouseClicked(MouseEvent evt) {
		// TODO add your handling code here:
		individualIncomeTaxTextField.setText(null);
		insuranceTextField.setText(null);
		salaryAfterTaxTextField.setText(null);
		salaryField.setText(null);
		displayTextArea.setText(null);
		salary = 0;
		pressEnterNum = 0;
		textMessage = null;
		
		

	}
	
	private void calculate() {
		if (salaryField.getText().isEmpty() && salary == 0) {
			JOptionPane.showMessageDialog(null, "请输入税前月收入");
			return;
		}
		if (!salaryField.getText().matches(
				"^[-+]?(([0-9]+)([.]([0-9]+))?|([.]([0-9]+))?)$")) {
			JOptionPane.showMessageDialog(null, "税前月收入必须时数字");
			salaryField.setText(null);
		}

		else {

			String city = cityComboBox.getSelectedItem().toString();
			if (salary == 0 && !salaryField.getText().isEmpty()) 
				salary = Double.valueOf(salaryField.getText());
			else if (salary != 0 && !salaryField.getText().isEmpty()) {
				++pressEnterNum;
				textMessage += "第" + pressEnterNum + "笔收入"
				+ salaryField.getText() + "\n";
				salary += Double.valueOf(salaryField.getText());
			}
				
			if (salary < FiveOneInsuranceFund.getFundFloor()) {
				JOptionPane.showMessageDialog(null,
						"工资没达到当地的最低要求哦");
				salaryField.setText(null);
				return;
			}
			taxCal.calculate(salary, city);
			individualIncomeTaxTextField.setText(String.format("%.2f", taxCal.getTax()));
			insuranceTextField.setText(String.format("%.2f",
					taxCal.getFiveOneInsuranceFund()));
			salaryAfterTaxTextField.setText(String.format("%.2f",
					taxCal.getSalaryAfterTax()));
			if (textMessage != null) {
				textMessage += "本月总工资为:" + salary + "\n"
				+ "----------------------------------------\n";
				displayTextArea.setText(textMessage);
			}
			salary = 0;
			pressEnterNum = 0;
			// textMessage = null;
			salaryField.setText(null);
		}
	}
		
	private void calcuteButtonActionPerformed(ActionEvent evt) {
		// TODO add your handling code here:
		
		calculate();
		

	}

	private void salaryFieldKeyPressed(KeyEvent evt) {
		if (evt.getKeyCode() == 10) {
			if (salaryField.getText().isEmpty() && salary == 0) {
				JOptionPane.showMessageDialog(null, "请输入税前月收入");
				return;
			}
			else if (salaryField.getText().isEmpty() && salary != 0)
				calculate();
			
			else if (!salaryField.getText().matches(
			"^[-+]?(([0-9]+)([.]([0-9]+))?|([.]([0-9]+))?)$")) {
				JOptionPane.showMessageDialog(null, "税前月收入必须时数字");
				salaryField.setText(null);
			} 
			
			else {
				pressEnterNum++;
				if (textMessage != null)
					textMessage += "第" + pressEnterNum + "笔收入"
							+ salaryField.getText() + "\n";
				else
					textMessage = "第" + pressEnterNum + "笔收入"
							+ salaryField.getText() + "\n";
				displayTextArea.setText(textMessage);
				salary += Double.valueOf(salaryField.getText());
				salaryField.setText(null);
			}
		}		

	}
	
	private void calcuteButton2ActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		produceDataToUser();
	}


	private void resetButton2ActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		salaryField2.setText(null);
		salaryAfterTaxTextField2.setText(null);
		individualIncomeTaxTextField2.setText(null);
		displayTextArea2.setText(null);
		taxCal.getEachTax().clear();	
	}
	
	private void produceDataToUser() {
		if (salaryField2.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "请输入税前月收入");
			return;
		}
		
		if (!salaryField2.getText().matches(
		"^[-+]?(([0-9]+)([.]([0-9]+))?|([.]([0-9]+))?)$")) {
			JOptionPane.showMessageDialog(null, "税前月收入必须时数字");
			salaryField2.setText(null);
			return;
		} 
		
		salaryAfterTaxTextField2.setText(null);
		textMessage = null;
		double monthTotalTax = 0;
		String date = yearComboBox.getSelectedItem().toString() + "-" + monthComboBox.getSelectedItem().toString();
		
		if (taxCal.getEachTax().containsKey(date))
			salary = taxCal.getEachTax().get(date).get(0);
		else
			salary = 0;
		
		salary += Double.valueOf(salaryField2.getText());
		taxCal.calculateEachIncome(date, salary);
		salaryAfterTaxTextField2.setText(String.format("%.2f",Double.valueOf(salaryField2.getText()) - taxCal.getEachTax().get(date).get(taxCal.getEachTax().get(date).size() - 1)));
		individualIncomeTaxTextField2.setText(String.format("%.2f",taxCal.getEachTax().get(date).get(taxCal.getEachTax().get(date).size() - 1)));
		
		if (taxCal.getEachTax().containsKey(date)) {
			for (int i = 1; i <= taxCal.getEachTax().get(date).size() - 1; i++) {
				if (textMessage == null)
					textMessage = date + "  第" + i + "笔应缴：" 
										+ String.format("%.2f", taxCal.getEachTax().get(date).get(i)) + "\n";
				else {
					textMessage += date + "  第" + i + "笔应缴：" 
										+ String.format("%.2f", taxCal.getEachTax().get(date).get(i)) + "\n";
				}
				monthTotalTax += taxCal.getEachTax().get(date).get(i);
			}
			if (textMessage == null)
				textMessage = "\n" + date + "  总工资为：" + taxCal.getEachTax().get(date).get(0)
									+ "\n本月应缴个税总额:" + String.format("%.2f", monthTotalTax)
									+ "\n税后总收入:" + String.format("%.2f", (taxCal.getEachTax().get(date).get(0) - monthTotalTax));
			else {
				textMessage += "\n" + date + "  总工资为：" + taxCal.getEachTax().get(date).get(0) 
									+ "\n本月应缴个税总额:" + String.format("%.2f", monthTotalTax)
									+ "\n税后总收入:" + String.format("%.2f", (taxCal.getEachTax().get(date).get(0) - monthTotalTax));
			}
		}
		if (!textMessage.isEmpty())
			displayTextArea2.setText(textMessage);
		salaryField2.setText(null);
	}
	
	

}
