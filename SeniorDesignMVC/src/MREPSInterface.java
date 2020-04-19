/*
 * Kyle Donahue April 2020
 * MREPSInterface
 * 	This is the highest level class in the project. The main function
 * 		creates a new instance of the class, which has an instance of
 * 		the model, view, and control. Nothing else should need to be
 * 		added to this class.
 * 
 * 	MVC (Model View Controller) Explanation:
 * 		This system separates different functions of the application to
 * 		streamline and simplify the coding project. 
 */

import java.awt.Container;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MREPSInterface {

	private MREPSModel model;
	private ArrayList<MREPSControl> controls;

	
	public static void main(String[] args) { 
		
		new MREPSInterface();
	} 

	public MREPSInterface()
	{
        MREPSControl control = new MREPSControl();
        MREPSView view = new MREPSView(control);
        control.setViewModel(model, view);
        
        model = new MREPSModel();
        controls = new ArrayList<MREPSControl>();
	}

	
    public void update()
    {
            model.update();
            for(int i=0;i<controls.size();i++)
            {
                    controls.get(i).updateView();
            }
    }
    

}