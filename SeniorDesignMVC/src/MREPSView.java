import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;



public class MREPSView
{
    private MREPSControl control;
    private String currentState;
    private JFrame frame;
    private String error;

    
	public MREPSView(MREPSControl control)
        {
                this.control=control;
                currentState= "Start";
                frame = new JFrame("MREPSInterfaceView");
                frame.setSize(1000,750);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                update();
        }
	
	public void setState(String state)
    {
            currentState=state;
    }

	
	 public void update()
     {
             if(currentState.equalsIgnoreCase("Start")){
            	 frame.getContentPane().removeAll();
            	 frame.setLayout(new GridLayout());
            	 
            	 JButton startButton = new JButton("Go to main");
            	 startButton.addActionListener(new ActionListener()
                 {
                         public void actionPerformed(ActionEvent e)
                         {
                                 setState("Main");
                                 update();
                         }
                 });
            	 
            	 frame.add(startButton);
                 frame.setVisible(true);
             }
             else if(currentState.equalsIgnoreCase("Main")) {
            	 frame.getContentPane().removeAll();
            	 GridBagConstraints c = new GridBagConstraints();
         		
         		///////COLUMN A//////////
         		JPanel cola = new JPanel(); 
         		cola.setLayout(new BoxLayout(cola,BoxLayout.Y_AXIS));
         		c.fill = GridBagConstraints.VERTICAL;//Should fill up the vertical column given////////////////
         		c.gridx = 0;
         		c.gridy = 0;
         		c.gridwidth = 1;
         		c.gridheight = 3;
         		cola.setBackground(new Color(200,200,200));
         		frame.add(cola,c);

         		//Col A Subcomponents
         		JLabel colATitle = new JLabel("Connected Modules     ");
         		cola.add(colATitle);
         		JList<String> modList=null;
         		/*
         		try {
         			sc = new Scanner(new File(path+"\\test.txt"));
         			ArrayList<String>read = new ArrayList<String>();
         			int i=0;
         			while(sc.hasNextLine()) {
         				read.add(sc.nextLine());
         			}
         			String[] data = read.toArray(new String[read.size()]);
         			modList = new JList<String>(data);
         		}
         		catch(Exception e) {
         			e.printStackTrace(System.err);
         			System.err.println("Error reading from file \""+path+"\test.txt");
         		}
         		if(modList!=null) {
         			modList.setBackground(new Color(200,200,200));
         			cola.add(modList);
         		}
         		else {
         			System.err.println("Error reading from file \""+path+"\test.txt\nNull JList");
         		}
         		*/
         		
         		
         		///////COLUMN B//////////
         		JPanel colb = new JPanel();
         		colb.setMinimumSize(new Dimension(1000,1000));//ignored???//////////////////////////////////////
         		colb.setLayout(new BoxLayout(colb,BoxLayout.Y_AXIS));

         		c.fill = GridBagConstraints.VERTICAL;//Should fill up the vertical column given/////////////////
         		c.gridx = 1;
         		c.gridy = 0;
         		c.gridwidth = 1;
         		c.gridheight = 3;
         		colb.setBackground(new Color(150,150,150));
         		frame.add(colb,c);
         		
         		//Col B Subcomponents
         		JLabel colBTitle = new JLabel("  Current Module Settings  ");
         		colb.add(colBTitle);
         		JPanel currentMod = new JPanel();
         		
         		currentMod.setBackground(new Color(110,110,110));
         		currentMod.setLayout(new BoxLayout(currentMod,BoxLayout.Y_AXIS));
         		currentMod.add(new JLabel("Part Number:"));
         		currentMod.add(new JLabel("Line 1:"));
         		currentMod.add(new JLabel("Line 2:"));
         		currentMod.add(new JLabel("Line 3:"));
         		currentMod.add(new JLabel("Line 4:"));
         		currentMod.add(new JLabel("Line 5:"));
         		colb.add(currentMod);
         		
         		JPanel config = new JPanel();
         		config.setBackground(new Color(160,160,160));
         		config.setLayout(new GridLayout(3,2));
         		config.add(new JLabel("Current Config:"));
         		JLabel currConfig = new JLabel("________.txt");
         		config.add(currConfig);
         		
         		config.add(new JLabel("Current Status:"));
         		JLabel currStatus = new JLabel("status");
         		config.add(currStatus);
         		
         		JButton exportButton = new JButton("Export");
                exportButton.addActionListener(new ActionListener()
                {
                        public void actionPerformed(ActionEvent e)
                        {
                                System.out.println("Export Pressed");
                        }
                });
         		config.add(exportButton);
         		JButton importButton = new JButton("Import");
                importButton.addActionListener(new ActionListener()
                {
                        public void actionPerformed(ActionEvent e)
                        {
                                System.out.println("Import Pressed");
                        }
                });
         		config.add(importButton);
         		colb.add(config);
         		
         		///////COLUMN C//////////
         		JPanel colc = new JPanel();
         		colc.setLayout(new BoxLayout(colc,BoxLayout.Y_AXIS));
         		c.fill = GridBagConstraints.VERTICAL;//Should fill up the vertical column given/////////////////
         		c.gridx = 2;
         		c.gridy = 0;
         		c.gridwidth = 1;
         		c.gridheight = 3;
         		colc.setBackground(new Color(200,200,200));
         		frame.add(colc,c);
         		
         		//Col C Subcomponents
         		JLabel colCTitle = new JLabel("  Current Module Outputs  ");
         		colc.add(colCTitle);
         		JPanel outputs = new JPanel();
         		outputs.setBackground(new Color(160,160,160));
         		colc.add(outputs);
         		JPanel export = new JPanel();
         		export.setBackground(new Color(110,110,110));
         		colc.add(export);
         		
                frame.setVisible(true);
         		//frame.pack();
             }
     }

	
}