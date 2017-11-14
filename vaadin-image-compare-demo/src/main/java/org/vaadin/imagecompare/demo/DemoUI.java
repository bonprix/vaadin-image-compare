package org.vaadin.imagecompare.demo;

import com.vaadin.annotations.Theme;
import com.vaadin.server.FontAwesome;
import com.vaadin.server.Page;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import org.vaadin.imagecompare.ImageCompare;
import org.vaadin.imagecompare.client.ImageHolder;
import org.vaadin.viritin.MSize;
import org.vaadin.viritin.button.MButton;
import org.vaadin.viritin.layouts.MHorizontalLayout;
import org.vaadin.viritin.layouts.MPanel;
import org.vaadin.viritin.layouts.MVerticalLayout;

@SpringUI
@Theme("valo")
public class DemoUI extends UI {

    @Override
    protected void init(final VaadinRequest vaadinRequest) {
        ImageCompare catOne = new ImageCompare(new ImageHolder("./VAADIN/sample/cat-1.jpg", "sweet with colors"),
                new ImageHolder("./VAADIN/sample/cat-1-bw.jpg", "black white"));

        ImageCompare catTwo = new ImageCompare(new ImageHolder("./VAADIN/sample/cat-2-bw.jpg", "b&w"),
                new ImageHolder("./VAADIN/sample/cat-2.jpg", "colors"));

        setContent(new MVerticalLayout()
                .add(new MHorizontalLayout()
                        .add(catOne, 1)
                        .add(catTwo, 1)
                        .withSize(MSize.FULL_SIZE), 3)
                .add(new MPanel("Sample-Panel",
                        new MVerticalLayout().add(new Label("Test 123"))
                                .add(new MButton(FontAwesome.TOGGLE_ON, event -> {
                                    catTwo.setLeft(catOne.getLeft());
                                    catTwo.setRight(catOne.getRight());
                                }))).withFullWidth()
                        .withSize(MSize.FULL_SIZE), 1)
                .withSize(MSize.FULL_SIZE));

        Page.getCurrent()
                .addBrowserWindowResizeListener(event -> {
                    catOne.repaint();
                    catTwo.repaint();
                });
    }
}
