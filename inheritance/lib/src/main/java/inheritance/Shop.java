package inheritance;

public class Shop {
    private String name;
    private String priceCategory;
    private String description;

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", priceCategory='" + priceCategory + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public Shop(String name, String priceCategory, String description) {
        this.name = name;
        this.priceCategory = priceCategory;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPriceCategory() {
        return priceCategory;
    }

    public void setPriceCategory(String priceCategory) {
        this.priceCategory = priceCategory;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
