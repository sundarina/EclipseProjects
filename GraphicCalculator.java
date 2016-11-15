import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;

public class GraphicCalculator {
	private Frame f;
	private Panel p;
	private Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bDot, bMyltiply, bMinus, bPlus, bDivided, bEqually;
	private TextField textField;

	public GraphicCalculator() {
		f = new Frame("GUI example 3");
		textField = new TextField("1234567890");

		b1 = new Button("1");
		b2 = new Button("2");
		b3 = new Button("3");
		b4 = new Button("4");
		b5 = new Button("5");
		b6 = new Button("6");
		b7 = new Button("7");
		b8 = new Button("8");
		b9 = new Button("9");
		b0 = new Button("0");
		bDot = new Button(".");
		bMinus = new Button("-");
		bPlus = new Button("+");   
		bDivided = new Button("/");
		bMyltiply = new Button("*");
		bEqually = new Button("=");
	}

	public void launchFrame() {
		f.add(textField, BorderLayout.NORTH);
		p = new Panel();
		p.setLayout(new GridLayout(4, 4));
		p.add(b7);
		p.add(b8);
		p.add(b9);
		p.add(bDivided);
		p.add(b4);
		p.add(b5);
		p.add(b6);
		p.add(bMyltiply);
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(bMinus);
		p.add(b0);
		p.add(bDot);
		p.add(bEqually);
		p.add(bPlus);	
		f.add(p, BorderLayout.CENTER);
		f.pack();
		f.setVisible(true);
	}

	public static void main(String args[]) {
		GraphicCalculator graphicCalc = new GraphicCalculator();
		graphicCalc.launchFrame();
	}

}
