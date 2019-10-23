import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;
class gui1 implements ActionListener{
   JTextField a;
    String str="";
    JPanel s;
    JButton x1,x2,x3,x4,x5,x6,x7,x8,x9,x0,xad,xsu,xmu,xdi,xeq,xac;
    gui1(){   
       JFrame jf=new JFrame("adv calc");
       JLabel jl=new JLabel("nice calc");
       a=new JTextField("");
       xac=new JButton("AC");
       x1=new JButton("1");
       x2=new JButton("2");
       x3=new JButton("3");
       x4=new JButton("4");
       x5=new JButton("5");
       x6=new JButton("6");
       x7=new JButton("7");
       x8=new JButton("8");
       x9=new JButton("9");
       x0=new JButton("0");
       xad=new JButton("+");
       xsu=new JButton("-");
       xmu=new JButton("*");
       xeq=new JButton("=");
       xdi=new JButton("/");
       s=new JPanel(new GridLayout(4,4));
       x1.addActionListener(this);
       x2.addActionListener(this);
       x3.addActionListener(this);
       x4.addActionListener(this);
       x5.addActionListener(this);
       x6.addActionListener(this);
       x7.addActionListener(this);
       x8.addActionListener(this);
       x9.addActionListener(this);
       x0.addActionListener(this);
       xad.addActionListener(this);
       xsu.addActionListener(this);
       xmu.addActionListener(this);
       xdi.addActionListener(this);
       xeq.addActionListener(this);
       xac.addActionListener(this);
        s.setBounds(50,200,300,300);
        s.add(xad);
       s.add(xsu);
       s.add(xmu);
       s.add(xdi);
       s.add(x1);
       s.add(x2);
       s.add(x3);
       s.add(x4);
       s.add(x5);
       s.add(x6);
       s.add(x7);
       s.add(x8);
       s.add(x9);
       s.add(x0);
       s.add(xeq);
       s.add(xac);
       a.setBounds(50,100,300,50);
       jl.setBounds(50,25,200,20);
       jf.getContentPane().setBackground(Color.white);
       jf.add(a);
       jf.add(jl);
       jf.add(s);
       jf.setLayout(null);
       jf.setSize(600,600);
       jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       jf.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==xeq){
            try{
            maexp(a.getText());
            a.setText(str);
          }
            catch(Exception err){}  
        }
        else if (e.getSource()==xac){
             a.setText("");
        }  
        else{
             a.setText(a.getText()+e.getActionCommand());
        } 
    }
     public void maexp(String s) throws ScriptException{
    ScriptEngineManager mgr = new ScriptEngineManager();
    ScriptEngine engine = mgr.getEngineByName("JavaScript");
    str = engine.eval(s).toString();
    }
}
public class advcalc{
    public static void main(String[] args) {
        new gui1();
    }
}
