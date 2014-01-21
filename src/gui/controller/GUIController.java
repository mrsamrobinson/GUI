package gui.controller;

import gui.model.GUI;
import gui.view.GUIFrame;


public class GUIController
{
	private GUIFrame appFrame;
	private GUI myGUI;
	
	public GUIController()
	{
		this.myGUI = new GUI();
	}
	
	
	public void start()
	{
		appFrame = new GUIFrame(this);
	}
	
}
