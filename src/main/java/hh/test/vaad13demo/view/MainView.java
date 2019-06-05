package hh.test.vaad13demo.view;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

import javax.servlet.http.HttpServletRequest;

@Route("")
public class MainView extends VerticalLayout {
    public MainView(HttpServletRequest request) {
        // конструируем UI из компонентов
        Button button = new Button("Click me");
        // подписываемся на события
        button.addClickListener(event -> {
            new Notification(request.getSession().getId()).open();
        });

        add(button);
    }
}
