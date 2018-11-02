import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class CalculatorGUI {
	private JFrame frame;
	private JPanel headerPane, calcPane;
	private JLabel inputLabel, outputLabel;
	private JTextField expression, outputDisplay;
	private JRadioButton postFixBtn, infixBtn;

	public CalculatorGUI() {
		makeComponents();
		makePanels();
		makeFrame();
	}

	
	private void makeFrame() {
		frame = new JFrame("PostFix Calculator App");
		Container contentPane = frame.getContentPane();
		ButtonGroup buttonGrp = new ButtonGroup();
		
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));	
		
		contentPane.add(headerPane);
		contentPane.add("Center",calcPane);
		
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private void makeComponents() {
		inputLabel = new JLabel("Enter Expression");
		inputLabel.setFont(new Font("Georgia", Font.BOLD, 15));
		expression = new JTextField(12);
		outputLabel = new JLabel("Final Result");
		outputLabel.setFont(new Font("Georgia", Font.BOLD, 15));
		outputDisplay = new JTextField(12);
		outputDisplay.setEnabled(false);
		postFixBtn = new JRadioButton("PostFix");
		infixBtn  = new JRadioButton("InFix");
		postFixBtn.setHorizontalAlignment(AbstractButton.RIGHT);
		infixBtn.setHorizontalAlignment(AbstractButton.LEFT);
		
		
	}

	private void makePanels() {
		headerPane = new JPanel(new GridLayout(3, 2, 5, 2));
		headerPane.setBorder(BorderFactory.createTitledBorder("Expression & Result Fields"));
		calcPane = new JPanel(new GridBagLayout());
	
		GridBagConstraints c = new GridBagConstraints();
		c.gridheight = 1;					// cell height
		c.fill = GridBagConstraints.BOTH;	// fill all the space in cell
		c.weightx = 1.0;					// horizontal space
		c.weighty = 1.0;					// vertical space
		c.anchor = GridBagConstraints.CENTER;	// Center positioning inside cell
		
		headerPane.add(inputLabel);
		headerPane.add(expression);
		headerPane.add(outputLabel);
		headerPane.add(outputDisplay);
		headerPane.add(postFixBtn);
		headerPane.add(infixBtn);
		
		JButton addSubtrct = new JButton("+ -");
		JButton seven = new JButton("7");
		JButton eightPeren = new JButton("( 8");
		JButton nineParen = new JButton(") 9");
		calcPane.add(addSubtrct,c);
		calcPane.add(seven,c);
		calcPane.add(eightPeren,c);
		calcPane.add(nineParen,c);
		
		JButton divMult = new JButton("'\' *");
		calcPane.add(divMult, c);
		for (int i = 4; i <= 6; i++) {
			JButton numsMiddle = new JButton(Integer.toString(i));
			 calcPane.add(numsMiddle, c);
	
		}
		
		JButton exponDot = new JButton("^ .");
		calcPane.add(exponDot, c);
		for (int i = 1; i <= 3; i++) {
			JButton numsMiddle2 = new JButton(Integer.toString(i));
			calcPane.add(numsMiddle2, c);
	
		}
		
		JButton shift = new JButton("Shift");
		JButton zero = new JButton("0");
		JButton space = new JButton("Space");
		JButton enter = new JButton("Enter");
		calcPane.add(shift, c);
		calcPane.add(zero, c);
		calcPane.add(space, c);
		calcPane.add(enter, c);
		
	}



	







} // End Class
