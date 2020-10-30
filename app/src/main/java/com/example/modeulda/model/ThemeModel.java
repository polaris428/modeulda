package com.example.modeulda.model;

public class ThemeModel {
    private String InRE;
    private String InTop;

public ThemeModel(){}
public ThemeModel(String theme){
    this.InRE= theme;
    this.InTop= theme;
}
    public String getInRE() {
        return InRE;
    }

    public void setInRE(String inRE) {
        InRE = inRE;
    }

    public String getInTop() {
        return InTop;
    }

    public void setInTop(String inTop) {
        InTop = inTop;
    }

}
