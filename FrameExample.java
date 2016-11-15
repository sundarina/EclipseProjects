import java.awt.*;

public class FrameExample {
	private Frame f;
	
	public FrameExample() {
		f = new Frame("Hello Out There!");
	}

	public void launchFrame() {
		f.setSize(270,270);
		f.setBackground(Color.YELLOW);
		f.setVisible(true);
	}

	public static void main(String args[]) {
		FrameExample guiWindow = new FrameExample();
		guiWindow.launchFrame();
	}

}
