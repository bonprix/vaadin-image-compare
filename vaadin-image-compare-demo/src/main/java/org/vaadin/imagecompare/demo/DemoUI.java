package org.vaadin.imagecompare.demo;

import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.UI;
import org.vaadin.imagecompare.ImageCompare;
import org.vaadin.imagecompare.client.ImageHolder;
import org.vaadin.viritin.MSize;
import org.vaadin.viritin.layouts.MVerticalLayout;

@SpringUI
@Theme("valo")
public class DemoUI extends UI {

    @Override
    protected void init(final VaadinRequest vaadinRequest) {

        ImageCompare imageCompare = new ImageCompare(new ImageHolder("https://cdn.rocketbase.io/assets/assortments/2.jpg", "black"),
                new ImageHolder("https://cdn.rocketbase.io/assets/assortments/1.jpg", "white"));

        setContent(new MVerticalLayout()
                .add(imageCompare, 1)
                .withSize(MSize.FULL_SIZE));
    }
}
