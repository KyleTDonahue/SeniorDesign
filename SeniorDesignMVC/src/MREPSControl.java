/*
 * Kyle Donahue April 2020
 * MREPSControl
 * 		The control class acts as a go-between for the view and model. The view should
 * 		call functions from control in order to access and change the model. It also
 * 		updates the view when the model changes. I'm unsure of which category 
 * 		reading/writing files should be in, but I think it would fit best here. Looking 
 * 		around, there were some examples of pre-made XML readers for java, but I haven't
 * 		gotten a chance to see how they would fit in here. 
 */
import java.io.IOException;

public class MREPSControl
{
        private MREPSView view;
        private MREPSModel model;


        public MREPSControl()
        {

        }

        public void setViewModel(MREPSModel model, MREPSView view)
        {
                this.view=view;
                this.model=model;
        }

        public void updateView()
        {
                view.update();
        }
        
        
        public String getPath() {
        	return model.getPath();
        }
        public void setPath(String path) {
        	model.setPath(path);
        }

}


//This is some old code from a previous version of the project, but I wanted 
//	to leave it in as an example method of reading from a text file
	/*
	 try {
			path=file.getCanonicalPath();
		} catch (IOException e) {
			e.printStackTrace();
		}

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