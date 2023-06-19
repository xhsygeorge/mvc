package mvc.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import mvc.models.*;
import mvc.views.*;

public class Controller {
    private Model model;
    private View view;
    private ActionListener actionListener;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void contol() {
        view.getButton().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                model.incX();
                view.setText(Integer.toString(model.getX()));
            }
        });
    }

}
