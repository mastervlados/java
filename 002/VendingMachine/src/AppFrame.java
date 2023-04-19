import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import Products.Product;
import VendingMachines.VendingMachine;

public class AppFrame extends JFrame implements ActionListener {
	
	private JPanel contentPane;
	private JLabel labelBalanceCounter;
	private JTextField textFieldEnterAmount;
	private JTextField textTakeProduct;
	private JTextField textProductNumber;
	private JButton btnPay;
	private JButton btnBuy;
	private JTextPane boxWarnings;
	private ArrayList<Product> data;
	private DefaultListModel<String> listModel;
	private JList<String> listOfProducts;
	
	public AppFrame(VendingMachine box) {
		this.setTitle(String.format("Vending Machine [%d vol.]", box.getVolume()));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setBounds(100, 100, 500, 497);
		createFrame();
		this.setVisible(true);
		loadMachine(box.getProdAll());
	}
	
	private String getTextFieldEnterAmount() {
		return this.textFieldEnterAmount.getText();
	}
	
	private String getTextProductNumber() {
		return this.textProductNumber.getText();
	}
	
	public void setLabelBalanceCounter(Double amount) {
		if (amount == 0) {
			this.labelBalanceCounter.setText("0.00");
		} else {
			this.labelBalanceCounter.setText(String.format("%.2f", amount));
		}
	}
	
	public String getCurrentBalance() {
		return this.labelBalanceCounter.getText();
	}
	
	public void showMessage(String message, boolean type) {
		if (!type) {
			this.boxWarnings.setText(message);
			this.boxWarnings.setForeground(Color.RED);
		} else {
			this.boxWarnings.setText(message);
			this.boxWarnings.setForeground(Color.BLUE);
		}
	}
	
	private void loadMachine(ArrayList<Product> list) {
		this.data = new ArrayList(list);
	    for (int i = 0; i < data.size(); i++) {
	          System.out.println(data.get(i).toString());
	          addProductToMachine(i, data.get(i).getLabelForVendingMachine());
	    }
	}
	
	private void addProductToMachine(int productIndex, String productLabel) {
		this.listModel.addElement(String.format("%d | %s", productIndex, productLabel));
	}
	
	private String getProductFromMachine(int index) {
		return " " + this.data.get(index).getName();
	}
	/** 
	 * Create Frame
	 * */
	private void createFrame() {
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		listModel = new DefaultListModel();
		listOfProducts = new JList(listModel);
		listOfProducts.setFont(new Font("Tahoma", Font.PLAIN, 14));
		listOfProducts.setBounds(10, 11, 223, 369);
		contentPane.add(listOfProducts);
		
		JLabel labelBalance = new JLabel("Balance:");
		labelBalance.setFont(new Font("Tahoma", Font.PLAIN, 18));
		labelBalance.setBounds(243, 11, 141, 33);
		contentPane.add(labelBalance);
		
		labelBalanceCounter = new JLabel("0.00");
		labelBalanceCounter.setHorizontalAlignment(SwingConstants.RIGHT);
		labelBalanceCounter.setFont(new Font("Tahoma", Font.BOLD, 18));
		labelBalanceCounter.setBounds(388, 12, 86, 32);
		contentPane.add(labelBalanceCounter);
		
		JLabel labelEnterAmount = new JLabel("Enter Amount:");
		labelEnterAmount.setFont(new Font("Tahoma", Font.PLAIN, 12));
		labelEnterAmount.setBounds(243, 286, 141, 20);
		contentPane.add(labelEnterAmount);
		
		textFieldEnterAmount = new JTextField();
		textFieldEnterAmount.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textFieldEnterAmount.setBounds(243, 305, 231, 33);
		contentPane.add(textFieldEnterAmount);
		textFieldEnterAmount.setColumns(10);
		
		btnPay = new JButton("Pay");
		btnPay.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnPay.setBounds(243, 347, 231, 33);
		btnPay.addActionListener(this);
		contentPane.add(btnPay);
		
		boxWarnings = new JTextPane();
		boxWarnings.setEditable(false);
		boxWarnings.setFont(new Font("Tahoma", Font.PLAIN, 12));
		boxWarnings.setBackground(new Color(238, 238, 238));
		boxWarnings.setBounds(371, 117, 103, 156);
		contentPane.add(boxWarnings);
		
		btnBuy = new JButton("Buy");
		btnBuy.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnBuy.setBounds(282, 234, 79, 41);
		btnBuy.addActionListener(this);
		contentPane.add(btnBuy);
		
		textTakeProduct = new JTextField();
		textTakeProduct.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textTakeProduct.setEnabled(false);
		textTakeProduct.setEditable(false);
		textTakeProduct.setBounds(10, 391, 223, 33);
		contentPane.add(textTakeProduct);
		
		JLabel lblEnterNumber = new JLabel("Enter Number:");
		lblEnterNumber.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEnterNumber.setBounds(243, 55, 141, 20);
		contentPane.add(lblEnterNumber);
		
		textProductNumber = new JTextField();
		textProductNumber.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textProductNumber.setColumns(10);
		textProductNumber.setBounds(243, 73, 231, 33);
		contentPane.add(textProductNumber);
		
		JButton btnTakeIt = new JButton("Take it!");
		btnTakeIt.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnTakeIt.setBounds(243, 391, 89, 33);
		btnTakeIt.addActionListener(this);
		contentPane.add(btnTakeIt);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnPay) {
			try {
				Double userEnteredAmount = Double.parseDouble(getTextFieldEnterAmount());
				setLabelBalanceCounter(userEnteredAmount);
				textFieldEnterAmount.setText("");
				showMessage("Your balance is up now!", true);
			} catch (Exception ex) {
				System.out.println(ex.getMessage());
				showMessage("Only numbers allowed! Try again..", false);
			}
		} else if (e.getSource() == btnBuy) {
			try {
				int userEnteredNumber = Integer.parseInt(getTextProductNumber());
				Double balance = Double.parseDouble(getCurrentBalance());
				Double productCost = this.data.get(userEnteredNumber).getPrice();
				if ((balance - productCost) >= 0.00) {
					setLabelBalanceCounter(balance - productCost);
					textProductNumber.setText("");
					this.textTakeProduct.setText(getProductFromMachine(userEnteredNumber));
					showMessage("Take your product.", true);
				}
			} catch (Exception ex) {
				System.out.println(ex.getMessage());
				showMessage("Something wrong! Try again..", false);
			}
		} else {
			this.textTakeProduct.setText("");
		}
	}
}
