package StructuralDesignPatterns.ProxyDesignPattern;

public class RealImage implements Image {
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadImageFromDisk();
    }

    private void loadImageFromDisk() {
        System.out.println("Loading Image: " + filename);
    }

    public void display() {
        System.out.println("Displaying Image: " + filename);
    }

}
