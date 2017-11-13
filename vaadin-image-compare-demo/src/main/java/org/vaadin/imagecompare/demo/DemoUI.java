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

        ImageCompare imageCompare = new ImageCompare(new ImageHolder("https://cdn.rocketbase.io/assets/rocketbase/logo-black-400x400-078f191df3.png", "black"),
                new ImageHolder("https://cdn.rocketbase.io/assets/rocketbase/logo-white-400x400-b2bf42d0ad.png", "white"));

        setContent(new MVerticalLayout()
                .add(imageCompare, 1)
                .withSize(MSize.FULL_SIZE));
    }
}
