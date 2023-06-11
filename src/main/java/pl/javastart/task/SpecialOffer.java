package pl.javastart.task;

public class SpecialOffer {
    Product product;
    String description;
    String startTime;
    String endTime;
    int rabat;

    SpecialOffer(Product product, String description, String startTime, String endTime, int rabat) {
        this.product = product;
        this.description = description;
        this.startTime = startTime;
        this.endTime = endTime;
        this.rabat = rabat;
    }
}
