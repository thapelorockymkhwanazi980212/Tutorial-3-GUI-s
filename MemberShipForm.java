
package za.ac.tut.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;

public class MemberShipForm extends JFrame
{
    private JLabel headingLabel, nameLabel,surnameLabel,idNoLabel, genderLabel,ContractOptionsLabel,personaltrainerLabel;
    
    private JTextField nameTextField, surnameTextField, idNoTextField;
    
    private JComboBox genderComboBox; 
    
    private JRadioButton monthToMonthRadioButton, sixMonthsRadioButton, annualRadioButton;
    
    private JCheckBox personalTrainerCheckBox;
    
    private ButtonGroup buttonGroup;
    
    private JTextArea commentsArea;
    
    private JButton applyButton;
    
    private JScrollPane scrollPaneTextArea;
    
    private JPanel headingPanel, clientDetailsPanel, namePanel, surnamePanel,idNoPanel,genderPanel,contractPanel, personalTrainerPanel, memberShipPanel,
            commentsPanel,buttonsPanel, headingAndClientsCombinedPanel, memberShipAndCommentsCombinedPanel, mainPanel;

    public MemberShipForm() 
    {
        //creating my frame
        setTitle("Gym MemberShip");
        setSize(500, 550);
        
        //creating labels
        headingLabel = new JLabel("MemberShip Form");
        headingLabel.setFont(new Font(Font.SANS_SERIF, Font.ITALIC + Font.BOLD, 20)) ;
        headingLabel.setForeground(Color.BLUE);
        headingLabel.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));
        
       nameLabel = new JLabel("Name:");
       surnameLabel = new JLabel("Surname:");
       idNoLabel = new JLabel("ID no:");
       genderLabel = new JLabel("Gender");
       ContractOptionsLabel =  new JLabel("Type of contract:");
       personaltrainerLabel = new JLabel("Select the checkbox if you need a personal trainer");
       
       //creating text fields
       nameTextField = new JTextField(20);
       surnameTextField = new JTextField(20); 
       idNoTextField = new JTextField(20);
       
       //combox box
       genderComboBox = new JComboBox();
       genderComboBox.addItem("Male");
       genderComboBox.addItem("Female");
       
       //radio buttons
       monthToMonthRadioButton = new JRadioButton("Month-to-month");
       sixMonthsRadioButton = new JRadioButton("Six-months");
       annualRadioButton = new JRadioButton("Annual");
       
       //textarea
       commentsArea = new JTextArea(20, 50);
       
       //button
       applyButton = new JButton("APPLY");
       
       //srollpane
       scrollPaneTextArea = new JScrollPane(commentsArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
       
       //checkbox
       personalTrainerCheckBox = new JCheckBox();
       
       //Button group
       buttonGroup = new ButtonGroup();
       buttonGroup.add(monthToMonthRadioButton);
       buttonGroup.add(sixMonthsRadioButton);
       buttonGroup.add(annualRadioButton);
        
        //creating panels and adding the components to their panels
        
        //this client part
        headingPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        headingPanel.add(headingLabel);
        
        
        namePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        namePanel.add(nameLabel);
        namePanel.add(nameTextField);
        
        surnamePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        surnamePanel.add(surnameLabel);
        surnamePanel.add(surnameTextField);
        
        idNoPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        idNoPanel.add(idNoLabel);
        idNoPanel.add(idNoTextField);
        
        genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        genderPanel.add(genderLabel);
        genderPanel.add(genderComboBox);
        
        clientDetailsPanel = new JPanel(new GridLayout(4,1,1,1));
        clientDetailsPanel.setBorder(new TitledBorder(new LineBorder(Color.BLACK,1), "Client Details"));   //this line above will create a line border titled "Client details" with color black and a width of 1
        clientDetailsPanel.add(namePanel);
        clientDetailsPanel.add(surnamePanel);
        clientDetailsPanel.add(idNoPanel);
        clientDetailsPanel.add(genderPanel);
        
        //this is the membership part
        contractPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        contractPanel.add(ContractOptionsLabel);
        contractPanel.add(monthToMonthRadioButton);
        contractPanel.add(sixMonthsRadioButton);
        contractPanel.add(annualRadioButton);
        
        personalTrainerPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        personalTrainerPanel.add(personaltrainerLabel);
        personalTrainerPanel.add(personalTrainerCheckBox);
        
        memberShipPanel = new JPanel(new GridLayout(2,1));
        memberShipPanel.setBorder(new TitledBorder(new LineBorder(Color.BLACK,1),"Contract Options"));
        memberShipPanel.add(contractPanel);
        memberShipPanel.add(personalTrainerPanel);
        
        commentsPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        commentsPanel.setBorder(new TitledBorder((new LineBorder(Color.BLACK, 1)),"Comments"));
        commentsPanel.add(commentsArea);
        commentsPanel.add(scrollPaneTextArea);
        
        buttonsPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        buttonsPanel.add(applyButton);
        
        headingAndClientsCombinedPanel = new JPanel(new BorderLayout());
        headingAndClientsCombinedPanel.add(headingPanel, BorderLayout.NORTH);
        headingAndClientsCombinedPanel.add(clientDetailsPanel, BorderLayout.CENTER);
        
        memberShipAndCommentsCombinedPanel = new JPanel(new BorderLayout());
        memberShipAndCommentsCombinedPanel.add(memberShipPanel, BorderLayout.NORTH);
        memberShipAndCommentsCombinedPanel.add(commentsPanel, BorderLayout.CENTER);
        
        mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(headingAndClientsCombinedPanel, BorderLayout.NORTH);
        mainPanel.add(memberShipAndCommentsCombinedPanel, BorderLayout.CENTER);
        mainPanel.add(buttonsPanel, BorderLayout.SOUTH);
        
        add(mainPanel);
        
        
        //mu scrollbar is is very swak and sick
        
        
        pack();
        setVisible(true);
      
    }
    
    
}
