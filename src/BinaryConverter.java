import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements MouseListener {
	JTextField txt = new JTextField(20);
	JLabel jill = new JLabel();
	JFrame jeff = new JFrame();
	public static void main(String[] args) {
	BinaryConverter bob = new BinaryConverter();
	bob.setup();
}
String convert(String input) {
    if(input.length() != 8){
         JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
         return "-";
    }
    String binary = "[0-1]+";    //must contain numbers in the given range
    if (!input.matches(binary)) {
         JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
         return "-";
    }
    try {
         int asciiValue = Integer.parseInt(input, 2);
         char theLetter = (char) asciiValue;
         return "" + theLetter;
    } catch (Exception e) {
         JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
         return "-";
    }
}

void setup() {
	
	jeff.setVisible(true);
	JPanel pan = new JPanel();
	jeff.add(pan);
	
	pan.add(txt);
	
	pan.add(jill);
	JButton hoi = new JButton();
	pan.add(hoi);
	hoi.addMouseListener(this);
	jeff.pack();
}
@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	String idk = txt.getText();
	String idek = convert(idk);
	jill.setText(idek);
	jeff.pack();

}
@Override
public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseEntered(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub
	
}


}

