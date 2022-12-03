import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
public class menu extends JFrame{
   //Integer c;
    public static String Readdata(String filepath)throws IOException{

	String str="";
	Scanner sc=new Scanner(new File(filepath));      //first txt document menu (1.indian,2,chinese,etc)
		while(sc.hasNextLine())
			str=str+sc.nextLine()+"\n";
      
      
     // System.out.println(str);
      return str;
}
public static void secondframe(JFrame f,String s,int c1){
  f.getContentPane().removeAll();
		f.repaint();

	 JLabel l=new JLabel(s);
   // l.setSize(100,200);
    l.setBounds(100,200,200,30);
		f.add(l);

	if(c1!=-1){
	
	JTextField t=new JTextField("enter your choice");
    t.setBounds(100,300,200,30);
	f.add(t);
  
    //t.setSize(200,400);
    JButton b=new JButton("submit");
    b.setBounds(100,400,200,40);
	
	b.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
     String s1=t.getText();
     int c2=Integer.parseInt(s1);  
	System.out.println(c2);
	if(c1==1 && c2==1 ){
		thirdframe(f,"<html> 1.Idli <br/>  2.Dosa </html>",c1,c2);
	}
	else if(c1==1 && c2==2 ){
		thirdframe(f,"<html> 1.Biryani <br/>  2.Roti </html>",c1,c2);
	}
	else if(c1==2 && c2==1){
		thirdframe(f,"<html> 1.Eggs in salsa <br/>  2.Eggs with chorizo</html>",c1,c2);
	}
	else if(c1==2 && c2==2){
		thirdframe(f,"<html> 1.Guacamole <br/>  2.Tacos</html>",c1,c2);
	}

	else if(c1==3 && c2==1){
		thirdframe(f,"<html> 1.Steamed Buns <br/>  2.Rice Porridge</html>",c1,c2);
	}
	else if(c1==3 && c2==2){
		thirdframe(f,"<html> 1.HotPot <br/>  2.Wonton</html>",c1,c2);
	}
	else if(c1==4 && c2==1){
		thirdframe(f,"<html> 1.kimchijigae <br/>  2.manduguk</html>",c1,c2);
	}
	else if(c1==4 && c2==2){
		thirdframe(f,"<html> 1.TTeokbokki <br/>  2.Jajangmyeon</html>",c1,c2);
	}
	else if(c1==5 && c2==1){
		thirdframe(f,"<html> 1.Cereal <br/>  2.Pancakes</html>",c1,c2);
	}
	else if(c1==5 && c2==2){
		thirdframe(f,"<html> 1.Burger <br/>  2.Hotdog</html>",c1,c2);
	}
	
	
}});
	
	f.add(b);
	
	}
}


public static void thirdframe(JFrame f,String s,int c1,int c2){

	f.getContentPane().removeAll();
		f.repaint();

	 JLabel l=new JLabel(s);
   // l.setSize(100,200);
    l.setBounds(100,200,200,30);
		f.add(l);
	
	JTextField t=new JTextField("enter your choice");
    t.setBounds(100,300,200,30);
	f.add(t);


	JButton b=new JButton("submit");
    b.setBounds(100,400,200,40);
		
	b.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
     String s1=t.getText();
     int c3=Integer.parseInt(s1);  
	System.out.println(c3);
	if(c1==1&&c2==1&&c3==1){
		fourthframe(f,"Your Choice :: Idli");
	}
	if(c1==1&&c2==1&&c3==2){
		fourthframe(f,"Your Choice :: Dosa");
	}
	if(c1==1&&c2==2&&c3==1){
		fourthframe(f,"Your Choice :: Biryani");
	}
	if(c1==1&&c2==2&&c3==2){
		fourthframe(f,"Your Choice :: Roti");
	}
	if(c1==2&&c2==1&&c3==1){
		fourthframe(f,"Your Choice :: Eggs in salsa");
	}
	if(c1==2&&c2==1&&c3==2){
		fourthframe(f,"Your Choice :: Eggs with chorizo");
	}
	if(c1==2&&c2==2&&c3==1){
		fourthframe(f,"Your Choice :: Guacamole");
	}
	if(c1==2&&c2==2&&c3==2){
		fourthframe(f,"Your Choice :: Tacos");
	}
	if(c1==3&&c2==1&&c3==1){
		fourthframe(f,"Your Choice :: Steamed Buns");
	}
	if(c1==3&&c2==1&&c3==2){
		fourthframe(f,"Your Choice :: Rice Porridge");
	}
	if(c1==3&&c2==2&&c3==1){
		fourthframe(f,"Your Choice :: HotPot");
	}
	if(c1==3&&c2==2&&c3==2){
		fourthframe(f,"Your Choice :: Wonton");
	}
	if(c1==4 &&c2==1&&c3==1){
		fourthframe(f,"Your Choice :: kimchijigae");
	}
	if(c1==4 &&c2==1&&c3==2){
		fourthframe(f,"Your Choice :: manduguk");
	}
	if(c1==4 &&c2==2&&c3==1){
		fourthframe(f,"Your Choice :: TTeokbokki");
	}
	if(c1==4 &&c2==2&&c3==2){
		fourthframe(f,"Your Choice :: Jajangmyeon");
	}

	if(c1==5 &&c2==1&&c3==1){
		fourthframe(f,"Your Choice :: Cereal");
	}
	if(c1==5 &&c2==1&&c3==2){
		fourthframe(f,"Your Choice :: Pancakes");
	}
	if(c1==5 &&c2==2&&c3==1){
		fourthframe(f,"Your Choice :: Burger");
	}
	if(c1==5 &&c2==2&&c3==2){
		fourthframe(f,"Your Choice :: HotDog");
	}


	}});
	
	f.add(b);

	
}


public static void fourthframe(JFrame g,String s)
{
	g.getContentPane().removeAll();
		g.repaint();

	 JLabel l=new JLabel(s);
   // l.setSize(100,200);
    l.setBounds(100,200,200,30);
		g.add(l);
}


 public static void main(String args[]) throws IOException{
   
   String Filecontent=Readdata("menu.txt");
   
    JFrame f=new JFrame("menu rec");
    f.getContentPane().removeAll();
		f.repaint();
    
    JLabel l=new JLabel("<html>"+Filecontent.replaceAll("\n","<br/>")+"</html>");
   // l.setSize(100,200);
    l.setBounds(100,200,200,30);
    
    JTextField t=new JTextField("enter your choice");
    t.setBounds(100,500,200,30);
  
    //t.setSize(200,400);
    JButton b=new JButton("submit");
    b.setBounds(100,800,200,40);

//int c=-1;
   b.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
     String s1=t.getText();
     int c=Integer.parseInt(s1);  
	System.out.println(c);
	if(c==1){
		secondframe(f,"<html> 1.Breakfast <br/>  2.lunch </html>",c);
	}
	else if(c==2){
		secondframe(f,"<html> 1.Breakfast <br/>  2.lunch </html>",c);
	}
	else if(c==3){
		secondframe(f,"<html> 1.Breakfast <br/>  2.lunch </html>",c);
	}
	else if(c==4){
		secondframe(f,"<html> 1.Breakfast <br/>  2.lunch </html>",c);
	}
	else if(c==5){
		secondframe(f,"<html> 1.Breakfast <br/>  2.lunch </html>",c);
	}
	else if(c==6){
		secondframe(f,"<html> 1.latte <br/>  2.Cappucino</html>",-1);
	}
      	else if(c==7){
		secondframe(f,"<html> 1.Chocolate Milkshake <br/> <br/> 2.oreo milkshake </html>",-1);
	}
	
}});

	f.setSize(1000,1000);
    	f.setLayout(new FlowLayout());
    	f.setVisible(true);	 
    	f.add(l);
    	f.add(t);
    	f.add(b);
    
    //f.setLayout(null);

  
}

}
