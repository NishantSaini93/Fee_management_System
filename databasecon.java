import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.lang.*;
import javax.swing.*;
import java.awt.Color.*;

public class databasecon
{
 Frame f;
Panel p;
Label l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,lmsg;
TextField t1,t2,t3,t5,t6,t7,t8,t9,t10,t11;
Choice t4;
Button b1,b2,b3,b4,b5;
GridBagLayout gbl;
GridBagConstraints gbc;
public databasecon()
{
f=new Frame("Student Management");
p=new Panel();

l1=new Label("RollNo");
l2=new Label("Name");
l3=new Label("Age");
l4=new Label("Course");
l5=new Label("Fee");
l6=new Label("EnterRecord No");
l7=new Label("RollNo");
l8=new Label("Name");
l9=new Label("Age");
l10=new Label("Course");
l11=new Label("Fee");
lmsg=new Label("**                                              **");

t1=new TextField(10);
t2=new TextField(10);
t3=new TextField(10);
t4=new Choice();
t4.addItem("C++");
t4.addItem("java");
t4.addItem("python");
t5=new TextField(10);
t6=new TextField(10);
t6.setText("#");
t7=new TextField(10);
t8=new TextField(10);
t9=new TextField(10);
t10=new TextField(10);
t11=new TextField(10);


b1=new Button("NewRecord");

b2=new Button("Save");

b3=new Button("Delete");

b4=new Button("Retrive");

b5=new Button("Modify");

Color c=new Color(24,26,27);
p.setBackground(Color.yellow);





gbl=new GridBagLayout();
gbc=new GridBagConstraints();
f.add(p);
p.setLayout(gbl);
gbc.anchor=GridBagConstraints.NORTHWEST;
gbc.gridx=1;
gbc.gridy=1;
gbl.setConstraints(l1,gbc);
p.add(l1);

gbc.gridx=4;
gbc.gridy=1;
gbl.setConstraints(t1,gbc);
p.add(t1);

gbc.gridx=1;
gbc.gridy=3;
gbl.setConstraints(l2,gbc);
p.add(l2);


gbc.gridx=4;
gbc.gridy=3;
gbl.setConstraints(t2,gbc);
p.add(t2);




gbc.gridx=1;
gbc.gridy=5;
gbl.setConstraints(l3,gbc);
p.add(l3);



gbc.gridx=4;
gbc.gridy=5;
gbl.setConstraints(t3,gbc);
p.add(t3);



gbc.gridx=1;
gbc.gridy=7;
gbl.setConstraints(l4,gbc);
p.add(l4);



gbc.gridx=4;
gbc.gridy=7;
gbl.setConstraints(t4,gbc);
p.add(t4);



gbc.gridx=1;
gbc.gridy=9;
gbl.setConstraints(l5,gbc);
p.add(l5);



gbc.gridx=4;
gbc.gridy=9;
gbl.setConstraints(t5,gbc);
p.add(t5);



gbc.gridx=1;
gbc.gridy=13;
gbl.setConstraints(b1,gbc);

Meridatabasecon rd=new Meridatabasecon();
b1.addActionListener(rd);
p.add(b1); 


gbc.gridx=3;
gbc.gridy=13;
gbl.setConstraints(b2,gbc);

Meridatabasecon ve=new Meridatabasecon();
b2.addActionListener(ve);
p.add(b2);



gbc.gridx=1;
gbc.gridy=15;
gbl.setConstraints(l6,gbc);

p.add(l6);



gbc.gridx=3;
gbc.gridy=15;
gbl.setConstraints(t6,gbc);
p.add(t6);



gbc.gridx=5;
gbc.gridy=15;
gbl.setConstraints(b3,gbc);

Meridatabasecon te=new Meridatabasecon();
b3.addActionListener(te);
p.add(b3);



gbc.gridx=7;
gbc.gridy=15;
gbl.setConstraints(b4,gbc);

Meridatabasecon eve=new Meridatabasecon();
b4.addActionListener(eve);
p.add(b4);



gbc.gridx=9;
gbc.gridy=15;
gbl.setConstraints(b5,gbc);

Meridatabasecon fy=new Meridatabasecon();
b5.addActionListener(fy);
p.add(b5);



gbc.gridx=1;
gbc.gridy=17;
gbl.setConstraints(l7,gbc);
p.add(l7);



gbc.gridx=3;
gbc.gridy=17;
gbl.setConstraints(l8,gbc);
p.add(l8);


gbc.gridx=5;
gbc.gridy=17;
gbl.setConstraints(l9,gbc);
p.add(l9);



gbc.gridx=7;
gbc.gridy=17;
gbl.setConstraints(l10,gbc);
p.add(l10);

gbc.gridx=9;
gbc.gridy=17;
gbl.setConstraints(l11,gbc);
p.add(l11);

gbc.gridx=1;
gbc.gridy=19;
gbl.setConstraints(t7,gbc);
p.add(t7);




gbc.gridx=3;
gbc.gridy=19;
gbl.setConstraints(t8,gbc);
p.add(t8);



gbc.gridx=5;
gbc.gridy=19;
gbl.setConstraints(t9,gbc);
p.add(t9);



gbc.gridx=7;
gbc.gridy=19;
gbl.setConstraints(t10,gbc);
p.add(t10);







gbc.gridx=9;
gbc.gridy=19;
gbl.setConstraints(t11,gbc);
p.add(t11);






gbc.gridx=1;
gbc.gridy=21;
gbl.setConstraints(lmsg,gbc);
p.add(lmsg);


f.setVisible(true);
f.setSize(700,550);
}



class Meridatabasecon implements ActionListener 
{
public void actionPerformed(ActionEvent ae)
{Object obj=ae.getSource();
if(obj==b1)
{NewRecord();
}
if(obj==b2)
{Save();
}
if(obj==b3)
{Delete();
}
if(obj==b4)
{Retrive();
}

if(obj==b5)
{Modify();
}

}


public void Save()
{String l1=t1.getText();
if(l1.length()==0)
{
lmsg.setText("Student Roll No. cannot be empty");
return;

}
String l2=t2.getText();
if(l2.length()==0)
{
lmsg.setText("Name cannot be empty");
return;

}
int l3=Integer.parseInt(t3.getText());
if(l3<18)
{lmsg.setText("Invalid Age ");
return;
}
String l4=String.valueOf(t4.getSelectedItem());
if(l4.length()==0)
{
lmsg.setText("Course cannot be empty ");
return;

}
double l5=Double.parseDouble(t5.getText());
if(l5<2500)
{
lmsg.setText("Fee cannot be less than rs 2500/-");
return;
}

try
{

Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

Connection co;
co=DriverManager.getConnection("jdbc:odbc:studata","sa","");
PreparedStatement st=co.prepareStatement("insert into student values(?,?,?,?,?)");
st.setString(1,l1);
st.setString(2,l2);
st.setInt(3,l3);
st.setString(4,l4);
st.setDouble(5,l5);
st.executeUpdate();
lmsg.setText("one record is added");

}
catch(SQLException e)
{System.out.println("error"+e);

}
catch(ClassNotFoundException cnfe)
{
}


}

public void Delete()
{
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection co;
co=DriverManager.getConnection("jdbc:odbc:studata","sa","");
String delId=t6.getText();
PreparedStatement st=co.prepareStatement("DELETE FROM student where sdrollno=?");
st.setString(1,delId);
st.executeUpdate();
lmsg.setText("Record deleted");

}
catch(Exception e)
{
System.out.println("error"+e);

}
//catch(SQLException e)
//{System.out.println("error"+e);

//}

}

public void Retrive()
{
try
{
String rno=t6.getText();
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection con;
con=DriverManager.getConnection("jdbc:odbc:studata","sa","");
Statement stmt=con.createStatement();
ResultSet rs=stmt.executeQuery("Select * from student where sdrollno='"+rno+"'");
rs.next();
t7.setText(rs.getString(1));
t8.setText(rs.getString(2));
t9.setText(Integer.toString(rs.getInt(3)));
t10.setText(rs.getString(4));
t11.setText(Double.toString(rs.getDouble(5)));
con.close();
}
catch(Exception ex)
{
System.out.println("error"+ex);

}
}
public void NewRecord()
{
t1.setText("");
t2.setText("");
t3.setText("");
t5.setText("");
}

public void Modify()
{
try 
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection co;
co=DriverManager.getConnection("jdbc:odbc:studata","sa","");
PreparedStatement st1=co.prepareStatement("update student set sdrollno=? where sdrollno=?");
st1.setString(1,t7.getText());
st1.setString(2,t6.getText());
st1.executeUpdate();

PreparedStatement st2=co.prepareStatement("update student set sdname=? where sdrollno=?");
st2.setString(1,t8.getText());
st2.setString(2,t6.getText());
st2.executeUpdate();



PreparedStatement st3=co.prepareStatement("update student set sdage=? where sdrollno=?");
st3.setInt(1,Integer.parseInt(t9.getText()));
st3.setString(2,t6.getText());
st3.executeUpdate();

PreparedStatement st4=co.prepareStatement("update student set sdcourse=? where sdrollno=?");
st4.setString(1,t10.getText());
st4.setString(2,t6.getText());
st4.executeUpdate();


PreparedStatement st5=co.prepareStatement("update student set sdfee=? where sdrollno=?");
st5.setFloat(1,Float.parseFloat(t11.getText()));
st5.setString(2,t6.getText());
st5.executeUpdate();
lmsg.setText("Records updated");

}
catch(Exception e)
{System.out.println("error"+e);

}
}
}
public static void main(String arg[])
{databasecon dc=new databasecon();


}


}





