import javax.swing.*;
import java.awt.*;
import javax.swing.JFrame;
public class Drawer extends JFrame
{

	public Drawer(int sx,int sy)
	{
		super();
		setSize(sx*16,sy*16);
		setResizable(false);
		setTitle("Snake Game");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		layout = new GridLayout(sx,sy);
		setLayout(layout);
		int numComponents = sx * sy;
		for(int i = 0; i < numComponents; ++i)
			add(new JPanel());
		
		resolution = sx;
	}
	public void draw(int px, int py, Color clr)
	{
		this.getRootPane().getContentPane().getComponent(py + px*resolution).setBackground(clr);
	}
	private GridLayout layout;
	private int resolution;

}