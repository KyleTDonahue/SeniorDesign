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



}