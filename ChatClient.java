import java.awt.*;

public class ChatClient {
	private Frame f;
	private TextArea textArea;
	private Panel panelNorth;
	private Panel panelSouth;
	private TextField text1;
	private TextField text2;
	private Button button1;
	private Button button2;

	public ChatClient() {
		f = new Frame("Chat-Client");
		text1 = new TextField("\\192.168.21.2");
		text2 = new TextField("Hello Vasya!!!!!");
		textArea = new TextArea("Vasya: Hello all!!! \nPetr: Hi!!!");
		button1 = new Button("Connect");
		button2 = new Button("Send");
		
	}

	public void launchFrame() {

		panelNorth = new Panel();
		panelNorth.setLayout(new BorderLayout());
		panelNorth.add(text1, BorderLayout.CENTER);
		panelNorth.add(button1, BorderLayout.EAST);
		f.add(panelNorth, BorderLayout.NORTH);
		f.add(textArea, BorderLayout.CENTER);
		panelSouth = new Panel();
		panelSouth.setLayout(new BorderLayout());
		panelSouth.add(text2, BorderLayout.CENTER);
		panelSouth.add(button2, BorderLayout.EAST);
		f.add(panelSouth, BorderLayout.SOUTH);
		f.pack();
		f.setVisible(true);
	}

	public static void main(String[] args) {

		ChatClient chat = new ChatClient();
		chat.launchFrame();

	}

}
