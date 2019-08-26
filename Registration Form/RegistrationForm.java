import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class RegistrationForm{
    JFrame f;
    JButton b,b2;
    JLabel lbl1;
    JLabel lbl2;
    JLabel lbl3;
    JLabel lbl4;
    JLabel lbl5;
    JLabel lbl6;
    JLabel lbl7;
    JTextField t1,t2,t3;
    JTextArea t4;
    JRadioButton r1,r2;
    JComboBox jb;
    ButtonGroup g;
    RegistrationForm(){
        //creating a frame


        Font fo=new Font("Arial",Font.BOLD,22);
        lbl7=new JLabel("Registration Form");
        f= new JFrame("Registration Form");
        ImageIcon icon = new ImageIcon("C:\\Users\\hp\\Desktop\\Registration Form\\hqdefault.jpg");
        f.setLayout(null);
        f.setIconImage(icon.getImage());
        lbl1=new JLabel("Name :");
        lbl2= new JLabel("Phone No :");
        lbl3= new JLabel("Email :");
        lbl4= new JLabel("Address :");
        lbl5=new JLabel("City :");
        lbl6=new JLabel("Gender :");
        lbl7.setFont(fo);
        String a[]={"--Select--","Jacobabad","Karachi","Jamshoro","Hyderabad","Larkana"};
        jb=new JComboBox(a);

        r1=new JRadioButton("Male");
        r2=new JRadioButton("Female");
        g=new ButtonGroup();
        g.add(r1);
        g.add(r2);

        b=new JButton("Submit");
        b2= new JButton("Clear");
        t1=new JTextField();
        t2=new JTextField();
        t3=new JTextField();
        t4= new JTextArea();

        f.setBounds(100,100,500,600);
        lbl7.setBounds(150,10,200,70);
        lbl1.setBounds(100,100,140,30);
        lbl2.setBounds(100,150,140,30);
        lbl3.setBounds(100,200,140,30);
        lbl4.setBounds(100,247,140,30);
        lbl5.setBounds(100,325,140,60);
        lbl6.setBounds(100,387,140,80);
        b.setBounds(100,500,130,40);
        b2.setBounds(270,500,130,40);
        t1.setBounds(200,100,190,30);
        t2.setBounds(200,150,190,30);
        t3.setBounds(200,200,190,30);
        t4.setBounds(200,250,190,60);
        r1.setBounds(200,383,120,90);
        r2.setBounds(325,383,120,90);
        jb.setBounds(200,330,150,50);

        
        
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        f.setResizable(true);
        f.add(b);
        f.add(b2);
        f.add(lbl1);
        f.add(lbl2);
        f.add(lbl3);
        f.add(lbl4);
        f.add(lbl5);
        f.add(lbl6);
        f.add(lbl7);
        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.add(t4);
        f.add(r1);
        f.add(r2);
        f.add(jb);
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                t1.setText("");
                t2.setText("");
                t3.setText("");
                t4.setText("");
                jb.setSelectedIndex(0);
                
            }
        });
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                boolean bl;
                if(jb.getSelectedIndex()>0){
                    bl=true;

                }
                else{
                    bl=false;
                }
                if(!(t1.getText().isEmpty()) && !(t2.getText().isEmpty()) && !(t3.getText().isEmpty()) && !(t4.getText().isEmpty()) && bl && (r1.isSelected() || r2.isSelected())){
                    JOptionPane.showMessageDialog(null, " Form submitted successfully");
                }
                else{
                    JOptionPane.showMessageDialog(null, " Please fill all fields!");
                }

            }
        });
    }
    public static void main(String[]args){
        new RegistrationForm();
    }
}