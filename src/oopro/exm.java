//Dharithri-4SF19CS058
package oopro;
import javax.imageio.ImageIO;
import javax.swing.*; 
import java.awt.Color;
import java.awt.Font ;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File ;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;


public class exm {  
public  static void main(String[] args) throws IOException {
JFrame f=new JFrame();
//creating instance of JFrame  
JLabel l1;  
l1=new JLabel("PORTFOLIO");
l1.setForeground( new Color(0, 0,0));
l1.setFont(new Font("SANS_SERIF", Font.BOLD, 24));
l1.setBounds(370,3, 200,40);            
f.add(l1);
//adding button in JFrame  
          
JLabel lblName = new JLabel("DHARITHRI RAI B ");//Name
lblName.setFont(new Font("Tahoma", Font.BOLD, 14));
lblName.setBounds(50, 80, 230, 70);
f.add(lblName);

JLabel lblusn = new JLabel("USN:4SF19CS058 ");//USN
lblusn.setFont(new Font("Tahoma", Font.PLAIN, 14));
lblusn.setBounds(50, 100, 130, 70);
f.add(lblusn);
 

BufferedImage myPicture = ImageIO.read(new File("./images/Capture.PNG"));
JLabel picLabel = new JLabel(new ImageIcon(myPicture));
picLabel.setBounds(700, 30,250,200);
f.add(picLabel);


JLabel l3 = new JLabel("Email Id:dharithrirai18@gmail.com ");
l3.setFont(new Font("Tahoma", Font.PLAIN, 14));
l3.setBounds(50, 120, 430, 70);
f.add(l3);

JLabel l4 = new JLabel("Contact Number: 9620016132");
l4.setFont(new Font("Tahoma", Font.PLAIN, 14));
l4.setBounds(50, 140, 430, 70);
f.add(l4);


JLabel l5 = new JLabel("EDUCATIONAL QUALIFICATION ");
l5.setFont(new Font("Tahoma", Font.BOLD, 14));
l5.setBounds(50, 190, 430, 70);
f.add(l5);


String data[][]={ {"COURSE","INSTITUTE","AGGREGATE"},
		{"BE","Sahyadri College Of Engineering and management","Pursuing"},    
        {" II PUC","Expert Pre University College","93.5%"},    
        {"SSLC","St.Theresa's School","91.5%"}};    
String column[]={"COURSE","INSTITUTE","AGGREGATE"};         
JTable jt=new JTable(data,column);
jt.setForeground( new Color(0,0,0));
jt.setBackground( new Color(252, 194,95));
l5.setFont(new Font("Tahoma", Font.BOLD, 14));
jt.setBounds(50,240,900,70);          
f.add(jt); 

JLabel l6 = new JLabel("PROGRAMMING LANGUAGE ");
l6.setFont(new Font("Tahoma", Font.BOLD, 14));
l6.setBounds(50, 290, 430, 70);
f.add(l6);

String language[]={"Python","C","Java","C++","HTML"};        
JComboBox cb=new JComboBox(language);
cb.setForeground( new Color(255, 255,255));
cb.setBackground( new Color(0, 0,0));
cb.setBounds(50, 340,100,70);    
f.add(cb);  

JLabel l7 = new JLabel("SEMESTER ");//Name
l7.setFont(new Font("Tahoma", Font.BOLD, 14));
l7.setBounds(50, 400, 430, 70);
f.add(l7);

JCheckBox c1 = new JCheckBox("1 sem",true);  
c1.setBounds(58,460, 70,30);  
JCheckBox c2 = new JCheckBox("2 sem", true);  
c2.setBounds(240,460, 70,30); 
JCheckBox c3 = new JCheckBox("3 sem",true);  
c3.setBounds(480,460, 70,30);  
JCheckBox c4 = new JCheckBox("4 sem", true);  
c4.setBounds(720,460, 70,30); 
JCheckBox c5 = new JCheckBox("5 sem");  
c5.setBounds(58,510, 70,30);  
JCheckBox c6 = new JCheckBox("6 sem");  
c6.setBounds(240,510, 70,30); 
JCheckBox c7 = new JCheckBox("7 sem");  
c7.setBounds(480,510, 70,30);  
JCheckBox c8 = new JCheckBox("8 sem");  
c8.setBounds(720,510, 70,30); 

c1.setForeground( new Color(0, 0,0));
c1.setBackground( new Color(252, 194,95));
c2.setForeground( new Color(0, 0,0));
c2.setBackground( new Color(252, 194,95));
c3.setForeground( new Color(0, 0,0));
c3.setBackground( new Color(252, 194,95));
c4.setForeground( new Color(0, 0,0));
c4.setBackground( new Color(252, 194,95));
c5.setForeground( new Color(0, 0,0));
c5.setBackground( new Color(252, 194,95));
c6.setForeground( new Color(0, 0,0));
c6.setBackground( new Color(252, 194,95));
c7.setForeground( new Color(0, 0,0));
c7.setBackground( new Color(252, 194,95));
c8.setForeground( new Color(0, 0,0));
c8.setBackground( new Color(252, 194,95));

f.add(c1);  f.add(c2);  f.add(c3);  f.add(c4);  f.add(c5);  f.add(c6);  f.add(c7);  f.add(c8);  

JLabel l8 = new JLabel("GENDER ");
l8.setFont(new Font("Tahoma", Font.BOLD, 14));
l8.setBounds(50, 530, 430, 70);
f.add(l8);

JRadioButton r1=new JRadioButton(" Female");    
JRadioButton r2=new JRadioButton("Male");    
JRadioButton r3=new JRadioButton("others"); 

r1.setForeground( new Color(255, 255,255));
r1.setBackground( new Color(0, 0,0));
r2.setForeground( new Color(255, 255,255));
r2.setBackground( new Color(0, 0,0));
r3.setForeground( new Color(255, 255,255));
r3.setBackground( new Color(0, 0,0));

r1.setBounds(50,590,70,30);    
r2.setBounds(240,590,70,30); 
r3.setBounds(480,590,70,30);


ButtonGroup bg=new ButtonGroup();
bg.add(r1);bg.add(r2);   bg.add(r3);
f.add(r1);f.add(r2); f.add(r3); 

JLabel l9 = new JLabel("HOBBIES ");//Name
l9.setFont(new Font("Tahoma", Font.BOLD, 14));
l9.setBounds(50, 620, 430, 70);
f.add(l9);

DefaultListModel<String> l10 = new DefaultListModel<>();  
l10.addElement("Painting");  
l10.addElement("Art Work");  ;

JList<String> list = new JList<>(l10);  
list.setForeground( new Color(0, 0,0));
list.setBackground( new Color(252, 194,95));
list.setBounds(50,680, 75,45);  
f.add(list); 

JButton redButton = new JButton("Red");
JButton greenButton = new JButton("Green");
JButton blueButton = new JButton("Blue");
JButton yellowButton = new JButton("orange");
JButton grayButton = new JButton("gray");
JButton pinkButton = new JButton("pink");

redButton.setBackground( new Color(255,0,0));
greenButton.setBackground( new Color(0,255,0));
blueButton.setBackground( new Color(0,0,255));
grayButton.setBackground( new Color(128,128,128));
yellowButton.setBackground( new Color(252, 194,95));

redButton.setBounds(50,45, 75,45);  
greenButton.setBounds(150,45, 75,45);  
blueButton.setBounds(250,45, 75,45);  
yellowButton.setBounds(350,45, 75,45); 
grayButton.setBounds(450,45, 75,45);  

class Listener extends JPanel implements ActionListener {
  public void actionPerformed(ActionEvent event) {
    Color color;
	if (event.getSource() == redButton) {
      color = Color.red;
      f.getContentPane().setBackground(color);
    } else if (event.getSource() == greenButton)
    {
      color = Color.green;
      f.getContentPane().setBackground(color);
      
    }
    else if (event.getSource() == blueButton) 
    {
        color = Color.blue;
        f.getContentPane().setBackground(color);
        
     }
    else if (event.getSource() == yellowButton)
    {
        color = Color.orange;
        f.getContentPane().setBackground(color);
        
      }
    else if (event.getSource() == grayButton)
    {
        color = Color.gray;
        f.getContentPane().setBackground(color);
        
      }else 
      {
      color = Color.pink;
      blueButton.setBackground(color);
      f.setBackground(color);
    }
    setBackground(color);
    repaint();
  }
}
redButton.addActionListener(new Listener());
greenButton.addActionListener(new Listener());
blueButton.addActionListener(new Listener());
yellowButton.addActionListener(new Listener());
pinkButton.addActionListener(new Listener());
grayButton.addActionListener(new Listener());
f.add(redButton);
f.add(greenButton);
f.add(blueButton);
f.add(yellowButton);
f.add(grayButton);
f.setSize(1000,2000);//400 width and 500 height  
f.setLayout(null);//using no layout managers  
f.setVisible(true);//making the frame visible  
f.getContentPane().setBackground( new Color(255, 255,255));
}   
}