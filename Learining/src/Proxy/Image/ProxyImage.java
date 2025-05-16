package Proxy.Image;

public class ProxyImage implements Image {
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        // lazy loading: creează RealImage doar la nevoie
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}