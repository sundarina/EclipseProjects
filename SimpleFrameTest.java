import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class SimpleFrameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleFrame frame = new SimpleFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
}

class SimpleFrame extends JFrame {
	public SimpleFrame() {
		setSize(DEFAULT_WIDTH, DEFAULT_WEIGHT);
	}
	public static final int DEFAULT_WIDTH = 300;
	public static final int DEFAULT_WEIGHT = 200;
}