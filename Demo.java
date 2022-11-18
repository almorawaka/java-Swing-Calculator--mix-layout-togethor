import javax.swing.*;
import java.awt.*;
class AddCustomerForm extends JFrame{
	private JLabel titleLabel;
	private JButton addButton;
	private JButton cancelButton;
	
	private JLabel idLabel;
    private JLabel nameLabel;
    private JLabel addressLabel;
    private JLabel salaryLabel;
    
    private JTextField idText;
    private JTextField nameText;
    private JTextField addressText;
    private JTextField salaryText;

	
	
	
	AddCustomerForm(){
		setSize(400,300);
		setTitle("Add Customer Form");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		
		titleLabel=new JLabel("Add Customer Form");
		titleLabel.setFont(new Font("",1,25));
		titleLabel.setHorizontalAlignment(JLabel.CENTER);
		
		addButton=new JButton("Add Customer");
		addButton.setFont(new Font("",1,15));
		
		cancelButton=new JButton("Cancel");
		cancelButton.setFont(new Font("",1,15));
		
		JPanel buttonPanel=new JPanel(new FlowLayout(FlowLayout.RIGHT)); //right align flowlayout add to button panel 
		buttonPanel.add(addButton);
		buttonPanel.add(cancelButton);
		add("South",buttonPanel);
		add("North",titleLabel);
		
	 //  JPanel centerPanel=new JPanel(new GridLayout(4,2));
	    JPanel labelPanel=new JPanel(new GridLayout(4,1));
	    JPanel textPanel=new JPanel(new GridLayout(4,1));
	    
	    idLabel = new JLabel("Customer ID");
	    idLabel.setFont(new Font("",1,15));
	    labelPanel.add(idLabel);
	    idText=new JTextField(8);
	    idText.setFont(new Font("",1,15));
	    textPanel.add(idText);
	    
	    
	    nameLabel = new JLabel("Name");
	    nameLabel.setFont(new Font("",1,15));
	    labelPanel.add(nameLabel);
	    nameText=new JTextField(15);
	    nameText.setFont(new Font("",1,15));
	    textPanel.add(nameText);
	    
	    addressLabel = new JLabel("Address");
	    addressLabel.setFont(new Font("",1,15));
	    labelPanel.add(addressLabel);
	    addressText=new JTextField(20);
	    addressText.setFont(new Font("",1,15));
	    textPanel.add(addressText);
	    
	    salaryLabel = new JLabel("Salary");
	    salaryLabel.setFont(new Font("",1,15));
	    labelPanel.add(salaryLabel);
	    salaryText=new JTextField(15);
	    salaryText.setFont(new Font("",1,15));
	    textPanel.add(salaryText);
	    
	    add("West",labelPanel);
	    add("East",textPanel);
	    
		setVisible(true);
  }
}
class Demo{ 
    public static void main(String args[]){   
        new AddCustomerForm();
    } 
}
