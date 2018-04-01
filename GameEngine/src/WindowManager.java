import java.awt.*;
import javax.swing.*;

public class WindowManager {
	JFrame frame = new JFrame("Default Window");
	
	public void createWindow() {
		frame = new JFrame("Default Window");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Dimension dimension = new Dimension (480, 320);
		frame.setPreferredSize(dimension);
		
		frame.pack();
		frame.setVisible(true);
	}

}
