import java.awt.*;

public class FrameWithPanel {
	private Frame f; // невидим изначально
	private Panel pan;

	public FrameWithPanel(String title) {
		f = new Frame(title);
		pan = new Panel();
	}

	public void launchFrame() {
		f.setSize(200, 200);
		f.setBackground(Color.green);
		f.setLayout(null); // без правил размещения. использование точные координаты 
		pan.setSize(100, 100);
		pan.setBackground(Color.yellow);
		f.add(pan); // добавляем панель на фрейм
		f.setVisible(true); // делаем видимым фрейм
	}

	public static void main(String args[]) {
		FrameWithPanel guiWindow = new FrameWithPanel("Frame with Panel");
		guiWindow.launchFrame();
	}
}