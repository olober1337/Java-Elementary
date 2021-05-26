package homework2.ComparatorAndComparable;

public class Laptop implements Comparable<Laptop> {

    @Override
    public int compareTo(Laptop laptop) {
        return model.compareTo(laptop.getModel());
    }

    private String model;
    private int price;
    private int amountOfRam;
    private int rating;
    private String company;

    public Laptop(String model, int price, int amountOfRam, int rating, String company) {
        this.model = model;
        this.price = price;
        this.amountOfRam = amountOfRam;
        this.rating = rating;
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmountOfRam() {
        return amountOfRam;
    }

    public void setAmountOfRam(int amountOfRam) {
        this.amountOfRam = amountOfRam;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", amountOfRam=" + amountOfRam +
                ", rating=" + rating +
                ", company='" + company + '\'' +
                '}';
    }
}
