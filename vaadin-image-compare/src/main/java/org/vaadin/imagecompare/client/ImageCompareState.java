package org.vaadin.imagecompare.client;

import com.vaadin.shared.ui.JavaScriptComponentState;

/**
 * Transfer states to JavaScript connector
 *
 * @author Marten Prieß (http://www.rocketbase.io)
 * @version 1.0
 */
public class ImageCompareState extends JavaScriptComponentState {

    public ImageHolder left;

    public ImageHolder right;

    public String repaint;

}
