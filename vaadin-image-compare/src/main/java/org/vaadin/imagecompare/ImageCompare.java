package org.vaadin.imagecompare;

import com.vaadin.annotations.JavaScript;
import com.vaadin.annotations.StyleSheet;
import com.vaadin.ui.AbstractJavaScriptComponent;
import org.vaadin.imagecompare.client.ImageCompareState;
import org.vaadin.imagecompare.client.ImageHolder;

/**
 * Vaadin wrapper for the JavaScript Plugin SimpleMDE (https://github.com/sparksuite/simplemde-markdown-editor)<br>
 *
 * @author Marten Prieß (http://www.rocketbase.io)
 * @version 1.0
 */
@StyleSheet("vaadin://imagecompare/ImageComparison.css")
@JavaScript({"vaadin://imagecompare/ImageComparison.js", "ImageCompare.js"})
public class ImageCompare extends AbstractJavaScriptComponent {


    public ImageCompare(ImageHolder left, ImageHolder right) {
        setPrimaryStyleName("imagecompare");

        getState().left = left.getUrl();
        getState().leftLabel = left.getLabel();

        getState().right = right.getUrl();
        getState().rightLabel = right.getLabel();
    }

    @Override
    protected ImageCompareState getState() {
        return (ImageCompareState) super.getState();
    }

}
