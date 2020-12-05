package cl.evilcorp.perritos.model;

import java.util.List;

public class BreedImg {
    private List<String> images;

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    @Override
    public String toString() {
        return "BreedImg{" +
                "images=" + images +
                '}';
    }
}
