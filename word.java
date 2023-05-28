package uz.pdp.googleTranslate;

import java.util.List;

public class word {
    private String translate;
    private List<String> example;
    private List<String> synonymes;

    public word() {
    }
    public word(String translate, List<String> example, List<String> synomes) {
        this.translate = translate;
        this.example = example;
        this.synonymes = synomes;
    }

    public String getTranslate() {
        return translate;
    }

    public void setTranslate(String translate) {
        this.translate = translate;
    }

    public List<String> getExample() {
        return example;
    }

    public void setExample(List<String> example) {
        this.example = example;
    }

    public List<String> getSynomes() {
        return synonymes;
    }

    public void setSynomes(List<String> synomes) {
        this.synonymes = synomes;
    }

    @Override
    public String toString() {
        return "word{" +
                "translate='" + translate + '\'' +
                ", example=" + example +
                ", synomes=" + synonymes +
                '}';
    }
}
