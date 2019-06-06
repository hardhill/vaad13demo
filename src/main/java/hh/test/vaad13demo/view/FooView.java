package hh.test.vaad13demo.view;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("foo")
public class FooView extends VerticalLayout {
    {
        add(new Text("Foo"));
    }
}
