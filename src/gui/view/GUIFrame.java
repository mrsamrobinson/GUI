package gui.view;

import gui.controller.GUIController;

import javax.swing.JFrame;



public class GUIFrame extends JFrame
{
	
	private GUIController baseController;
	private GUIPanel basePanel;
	
	public GUIFrame(GUIController baseController)
	{
		this.baseController = baseController;
		basePanel = new GUIPanel(baseController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(500, 500);
		this.setVisible(true);
	}
	
	
	
}
