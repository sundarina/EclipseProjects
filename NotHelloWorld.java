import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;


public class NotHelloWorld {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
			JFrame frame = new NotFrame();
			frame.setTitle("Not-Hello-World");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
				
			}
		});
	}

}

	//фрейм, содержащий панели сообщений

class NotFrame extends JFrame {
	public NotFrame(){
		add(new NotComponent());
		pack();
	}
}

	//компонент выводящий сообщение

class NotComponent extends JComponent {
	
	public static final int MESSAGE_X = 150;
	public static final int MESSAGE_Y = 200;
	
	//размеры открывающегося окна 
	
	private static final int DEFAULT_WIDTH = 600;
	private static final int DEFAULT_HEIGHT = 400;
	
	public void paintComponent(Graphics g){
		g.drawString("Not hello world", MESSAGE_X, MESSAGE_Y);
		
		Graphics2D g2 = (Graphics2D) g;
		
		//прямоугольник
		
		double leftX = 100;
		double topY = 100;
		double width = 200;
		double height = 150;
		
		Rectangle2D rect = new Rectangle2D.Double(leftX, topY, width, height);
		g2.draw(rect);
		
		//вписанный элипс
		
		Ellipse2D ellipse = new Ellipse2D.Double();
		ellipse.setFrame(rect);
		g2.draw(ellipse);
		
		//диагональная линия
		
		g2.draw(new Line2D.Double(leftX, topY, leftX + width, topY + height));
		
		//окружность с тем же центром
		
		double centerX = rect.getCenterX();
		double centerY = rect.getCenterY();
		double radius = 125;
		
		Ellipse2D circle = new Ellipse2D.Double();
		circle.setFrameFromCenter(centerX, centerY, centerX + radius, centerY + radius);
		g2.draw(circle);
		
				
				
			
	}
	public Dimension getPreferredSize() {
		return new Dimension (DEFAULT_WIDTH, DEFAULT_HEIGHT);
		
	}
	

}