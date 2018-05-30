package edu.eiu.tourist_app.dataModel;

import com.google.gson.annotations.SerializedName;

public class WikipediaImage {
    private String source;
    private int width;
    private int heigth;

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeigth() {
        return heigth;
    }

    public void setHeigth(int heigth) {
        this.heigth = heigth;
    }
}
