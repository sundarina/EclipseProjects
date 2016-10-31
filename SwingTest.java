import java.awt.*;
import javax.swing.*;


public class SwingTest {

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
			JFrame frame = new SizedFrame();
			frame.setTitle("SizedFrame");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
				
			}
		});
	}

}

class SizedFrame extends JFrame {
	
	public SizedFrame(){
		
		//получить размеры экрана
		
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int screenWidth = screenSize.width;
		int screenHeigh = screenSize.height;
		
		//задать высоту и ширину фрейма, местополож выбирает система
		
		setSize(screenWidth /2 , screenHeigh /2);
		setLocationByPlatform(true);
		
		//задать пиктограму для фрейма
		
		Image img = new ImageIcon("icon.gif").getImage();
		setIconImage(img);
		
	}
}