package mvc;

import javax.swing.SwingUtilities;
import mvc.models.*;
import mvc.views.*;
import mvc.controllers.*;

public class MVCEx {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Model model = new Model(0);
                View view = new View("0");
                Controller controller = new Controller(model, view);
                controller.contol();
            }
        });
    }
}
