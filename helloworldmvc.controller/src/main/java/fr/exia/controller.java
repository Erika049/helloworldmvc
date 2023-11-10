package fr.exia;

public class controller {
    private final IView view;
    private final IModel model;

    public controller(final IView view, final IModel model){
        this.view = view;
        this.model = model;
    }
    public void run(){
        this.view.displayMessage(this.model.getHelloWorld());
    }

}
