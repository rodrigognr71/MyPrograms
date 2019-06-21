import controller.Controller;
import model.Model;
import view.View;

public class MVC {
    public static void main(String [] args){
        Model model = new Model();
        View view = new View();

        Controller controller = new Controller(view, model);
        controller.start();

        view.setVisible(true);
    }
}
