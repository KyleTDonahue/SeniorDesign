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