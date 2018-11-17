package de.rhsinfolk.Kartenspiel;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.awt.GLCanvas;

public class MainFrame extends JFrame implements GLEventListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6257694112952477309L;

	private static final String NAME = "Kartenspiel by Hendrik";
	private static final int WIDTH;
	private static final int HEIGHT;

	static {
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		WIDTH = d.width;
		HEIGHT = d.height;
	}

	public MainFrame() {
		super(NAME);
		GLProfile profile = GLProfile.get(GLProfile.GL2GL3);
		GLCapabilities capabilities = new GLCapabilities(profile);
		
		GLCanvas canvas = new GLCanvas(capabilities);
		canvas.addGLEventListener(this);

		setName(NAME);
		getContentPane().add(canvas);
		
		setSize(WIDTH, HEIGHT);
		setUndecorated(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(false);
		canvas.requestFocusInWindow();
	}

	public void init(GLAutoDrawable drawable) {
		// TODO Auto-generated method stub

	}

	public void dispose(GLAutoDrawable drawable) {
		// TODO Auto-generated method stub

	}

	public void display(GLAutoDrawable drawable) {
		// TODO Auto-generated method stub

	}

	public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
		// TODO Auto-generated method stub

	}

}
