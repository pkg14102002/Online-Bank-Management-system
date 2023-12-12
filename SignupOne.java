
package bank.managment.system;
import java.awt.*;
import javax.swing.*;
import java.util.*;

import com.toedter.calendar.JDateChooser;
import static java.awt.Color.black;
import static java.awt.Color.white;
import java.awt.event.*;

public class SignupOne extends JFrame implements ActionListener {
    
    long random;
    JTextField  nameTextField,fnameTextField,dobTextField,emailTextField,addressTextField,cityTextField,stateTextField,pincodeTextField;
    JButton next;
    JRadioButton male,female,married ,unmarried,other;
    JDateChooser dateChooser;
    SignupOne(){
        setLayout(null);
        Random ran=new Random();
        long random =Math.abs((ran.nextLong()%9000L)+1000L);
        
        JLabel formno=new JLabel("APPLICATION FORM NO."+random);
        formno.setFont(new Font("arial",Font.BOLD,38));
        formno.setBounds(140, 20, 600, 40);
        add(formno);
        
        
        
        JLabel PersonalDetail=new JLabel("Page 1:Personal Details");
        PersonalDetail.setFont(new Font("arial",Font.BOLD,22));
        PersonalDetail.setBounds(290, 80, 600, 30);
        PersonalDetail.setForeground(Color.orange);
        add(PersonalDetail);
        
        
         JLabel name=new JLabel("Name:");
        name.setFont(new Font("arial",Font.BOLD,22));
        name.setBounds(100, 140, 600, 30);
       // name.setForeground(Color.orange);
        add(name);
        
         nameTextField=new JTextField();
        nameTextField.setBounds(300, 140, 500, 30);
        nameTextField.setFont(new Font("arial",Font.BOLD,22));
        add(  nameTextField);
        
        
        
        JLabel fname=new JLabel("Father's Name:");
        fname.setFont(new Font("arial",Font.BOLD,22));
        fname.setBounds(100, 190, 600, 30);
       // name.setForeground(Color.orange);
        add(fname);
        
        
           fnameTextField=new JTextField();
        fnameTextField.setBounds(300, 190, 500, 30);
      fnameTextField.setFont(new Font("arial",Font.BOLD,22));
        add(  fnameTextField);
        
        
        
         JLabel Dob=new JLabel("Date Of Birth:");
         Dob.setFont(new Font("arial",Font.BOLD,22));
         Dob.setBounds(100, 240, 600, 30);
       // name.setForeground(Color.orange);
        add( Dob);
        
         dateChooser=new JDateChooser();
        dateChooser.setBounds(300,240,500,30);
        dateChooser.setForeground(black);
        add(dateChooser);
        
        
        
        JLabel gender=new JLabel("Gender:");
         gender.setFont(new Font("arial",Font.BOLD,22));
         gender.setBounds(100, 290, 600, 30);
       // name.setForeground(Color.orange);
        add( gender);
         male=new JRadioButton("male");
        male.setBounds(300,290,240,30);
        male.setBackground(white);
        add(male);
        
        
          female=new JRadioButton("female");
         female.setBounds(600, 290, 200, 30);
          female.setBackground(white);
         
         add(female);
         ButtonGroup gendergroup=new ButtonGroup();
         gendergroup.add(male);
            gendergroup.add(female);
        
        
        
        
        
        
        
        JLabel email=new JLabel("Email:");
          email.setFont(new Font("arial",Font.BOLD,22));
          email.setBounds(100, 340, 600, 30);
       // name.setForeground(Color.orange);
        add(  email);
        
         emailTextField=new JTextField();
        emailTextField.setBounds(300, 340, 500, 30);
      emailTextField.setFont(new Font("arial",Font.BOLD,22));
        add(  emailTextField);
        
        
        
        JLabel maritalStatus=new JLabel("Marital Status:");
          maritalStatus.setFont(new Font("arial",Font.BOLD,22));
          maritalStatus.setBounds(100, 390, 600, 30);
       // name.setForeground(Color.orange);
        add(  maritalStatus);
        
        
        
        
            married=new JRadioButton("married");
        married.setBounds(300,390,100,30);
        married.setBackground(white);
        add(married);
        
        
        unmarried=new JRadioButton("unmarried");
         unmarried.setBounds(450, 390, 100, 30);
          unmarried.setBackground(white);
         
         add(unmarried);
         
           other=new JRadioButton("other");
         other.setBounds(630, 390, 100, 30);
          other.setBackground(white);
         
         add(other);
         ButtonGroup maritalstatusgroup=new ButtonGroup();
         maritalstatusgroup.add(married);
           maritalstatusgroup.add(unmarried);
            maritalstatusgroup.add(other);
           
           
        
        
        
        JLabel address=new JLabel("Address:");
          address.setFont(new Font("arial",Font.BOLD,22));
          address.setBounds(100, 440, 600, 30);
       // name.setForeground(Color.orange);
        add(  address);
        
          addressTextField=new JTextField();
        addressTextField.setBounds(300, 440, 500, 30);
      addressTextField.setFont(new Font("arial",Font.BOLD,22));
        add( addressTextField );
        
        
        
        
        
        
        
        
        JLabel city=new JLabel("City:");
          city.setFont(new Font("arial",Font.BOLD,22));
          city.setBounds(100, 490, 600, 30);
       // name.setForeground(Color.orange);
        add(  city);
        cityTextField=new JTextField();
        cityTextField.setBounds(300, 490, 500, 30);
      cityTextField.setFont(new Font("arial",Font.BOLD,22));
        add( cityTextField);
        
        
        
        
        
        
        JLabel state=new JLabel("State:");
          state.setFont(new Font("arial",Font.BOLD,22));
          state.setBounds(100, 540, 600, 30);
       // name.setForeground(Color.orange);
        add(  state);
        
        
         stateTextField=new JTextField();
        stateTextField.setBounds(300, 540, 500, 30);
      stateTextField.setFont(new Font("arial",Font.BOLD,22));
        add( stateTextField);
        
        
        
        
        
        
        JLabel pincode=new JLabel("Pin Code:");
         pincode.setFont(new Font("arial",Font.BOLD,22));
          pincode.setBounds(100, 590, 600, 30);
       // name.setForeground(Color.orange);
        add(  pincode);
        
        pincodeTextField=new JTextField();
        pincodeTextField.setBounds(300, 590, 500, 30);
      pincodeTextField.setFont(new Font("arial",Font.BOLD,22));
        add( pincodeTextField);
        
        
         next=new JButton("NEXT");
        next.setBackground(black);
        next.setForeground(white);
        next.setFont(new Font("raleway",Font.BOLD,14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);
        
        
        
        
        
        
        
        getContentPane().setBackground(Color.white);
        
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    
    
    
    
    
    }
    
    
    public void actionPerformed(ActionEvent ae){
        
        String formno=""+random; //long
        String name=nameTextField.getText();//set text
        String fname=fnameTextField.getText();//set text
        String dob=((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String gender=null;
        if(male.isSelected()){
            gender="male";
        
        }else if(female.isSelected()){
        
        gender="female";
        
        }
        
        String email=emailTextField.getText();
        String  maritalStatus =null;
        if(married.isSelected()){
         maritalStatus="married";
        
        
        
        }else if(unmarried.isSelected()){
             maritalStatus="unmarried";
    
    
    
    
    }else if(other.isSelected()){
         maritalStatus="other";
    
    
    
    }
        String address=addressTextField.getText();
        String city=cityTextField.getText();
        String state=stateTextField.getText();
        String pincode=pincodeTextField.getText();
        
        try{
            if(name.equals("")){
                JOptionPane.showMessageDialog(null,"name is required");
            
            
            }else {
                Conn c= new Conn();
                String query="insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+maritalStatus+"','"+address+"','"+city+"','"+state+"','"+pincode+"')";
                c.s.executeUpdate(query);
                new Signup2(formno).setVisible(true);
                setVisible(false);
                
            
            
            }
        
        
        }catch(Exception e){
            System.out.println(e);
            
        
        
        }
        
           
    
    
    
    }
    
    
    
    
    
    
    
    
    public static void main(String args[]){
        new SignupOne();
    
    }

   
    
}
