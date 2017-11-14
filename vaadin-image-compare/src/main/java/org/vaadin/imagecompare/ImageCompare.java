package org.vaadin.imagecompare;

import com.vaadin.annotations.JavaScript;
import com.vaadin.annotations.StyleSheet;
import com.vaadin.ui.AbstractJavaScriptComponent;
import org.vaadin.imagecompare.client.ImageCompareState;
import org.vaadin.imagecompare.client.ImageHolder;

import java.util.Date;

/**
 * Vaadin wrapper for the JavaScript Plugin ImageComparison (https://github.com/M-Ulyanov/ImageComparison/)<br>
 *
 * @author Marten Prieß (http://www.rocketbase.io)
 * @version 1.0
 */
@StyleSheet("vaadin://imagecompare/ImageComparison.css")
@JavaScript({"vaadin://imagecompare/ImageComparison.js", "ImageCompare.js"})
public class ImageCompare extends AbstractJavaScriptComponent {


    public ImageCompare(ImageHolder left, ImageHolder right) {
        setPrimaryStyleName("imagecompare");

        setLeft(left);
        setRight(right);
    }

    @Override
    protected ImageCompareState getState() {
        return (ImageCompareState) super.getState();
    }

    public ImageHolder getLeft() {
        return getState().left;
    }

    public void setLeft(ImageHolder left) {
        getState().left = left;
    }

    public ImageHolder getRight() {
        return getState().right;
    }

    public void setRight(ImageHolder right) {
        getState().right = right;
    }

    /**
     * repaint component useful in case of window-resize...
     */
    public void repaint() {
        getState().repaint = new Date().toString();
    }

}
