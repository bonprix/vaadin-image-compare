package org.vaadin.imagecompare.client;

import java.io.Serializable;

/**
 * Holds Image url and label
 *
 * @author Marten Prieß (http://www.rocketbase.io)
 * @version 1.0
 */
public class ImageHolder implements Serializable {

    private String url;

    private String label;

    public ImageHolder() {
    }

    public ImageHolder(String url, String label) {
        this.url = url;
        this.label = label;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
