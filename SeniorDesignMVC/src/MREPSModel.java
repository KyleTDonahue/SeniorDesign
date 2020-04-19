/*
 * Kyle Donahue April 2020
 * MREPSModel
 * 		The model stores data for the other components to utilize. In this
 * 		case, part of the initialization should be to import an existing 
 * 		data set from a file or create a new default one based on user input.
 * 		In this version, path is used as an example datum being stored in the model.
 */
import java.util.ArrayList;
import java.util.Observable;

public class MREPSModel extends Observable
{
	private String path;
	
	public MREPSModel()
    {
        path=null;
    }
    
	public void update() {
		
	}
	
    public String getPath() {
    	return path;
    }
    public void setPath(String path) {
    	this.path = path;
    }

    
}


