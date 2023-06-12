package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Category milkProducts = new Category("milkProducts", "Good quality");
        Category bioProducts = new Category("BioProducts", "Health Food");

        Product firstProd = new Product("Butter", 25, "87% quality", milkProducts);
        Product secondProd = new Product("Milk", 15, "32% milk", milkProducts);
        Product thirdProd = new Product("Joghurt", 5, "Greek joghurt", bioProducts);
        Product fourthProd = new Product("Ham", 30, "Best quality ham");
        SpecialOffer specialOfferMarch = new SpecialOffer(firstProd, "March offer for ham",
                "2023.03.01", "2023.03.31", 20);
    }
}

