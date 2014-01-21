package gui.view;

import gui.controller.GUIController;
import gui.model.GUI;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SpringLayout;

public class GUIPanel extends JPanel
{
	private GUIController baseController;
	private SpringLayout baseLayout;
	private JTextArea textArea;
	private JButton submitButton;
	private JScrollPane textPane;

	public GUIPanel(GUIController baseController)
	{
		this.baseController = baseController;

		baseLayout = new SpringLayout();
		textArea = new JTextArea(25, 25);
		submitButton = new JButton("I'm a button!");
		textPane = new JScrollPane(textArea);

		setupPanel();
		setupListeners();
		setupLayout();

	}

	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.BLACK);
		this.add(submitButton);
		this.add(textPane);

		textArea.setWrapStyleWord(true);
		textArea.setLineWrap(true);
		textArea.setEditable(false);

	}

	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, submitButton, 84,
				SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, submitButton, -53,
				SpringLayout.EAST, this);

		baseLayout.putConstraint(SpringLayout.NORTH, textPane, 24,
				SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, textPane, 48,
				SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, textPane, 251,
				SpringLayout.WEST, this);
	}

	private void setupListeners()
	{
		submitButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{

			}
		});
	}

}
