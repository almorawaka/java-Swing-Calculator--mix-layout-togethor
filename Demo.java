import javax.swing.*;
import java.awt.*;
class Calculator extends JFrame{
    JTextField textField;
    JButton southButton;
    JButton [] buttonArray;

    Calculator(){
        setSize(300,300);
        setTitle("Calculator");
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setLocationRelativeTo(null);
        setLayout(new BorderLayout()); 
        
        textField=new JTextField("",8); //8-->size
        textField.setFont(new Font("",1,25));
        add("North",textField);

        southButton=new JButton("South");
        southButton.setFont(new Font("",1,25));
        add("South",southButton);
 
        JPanel centerPanel=new JPanel();
        centerPanel.setLayout(new GridLayout(4,4));
        buttonArray=new JButton[16];
        String[] buttonName={"7","8","9","x","4","5","6","/","1","2","3","+","0",".","=","-"};
        for(int i=0; i<16; i++){
            buttonArray[i]=new JButton(buttonName[i]);
            buttonArray[i].setFont(new Font("",1,25));
            centerPanel.add(buttonArray[i]);
        }
        add("Center",centerPanel);
        
        setVisible(true);
    }    
}
class Demo{ 
    public static void main(String args[]){   
        new Calculator();
    } 
}
