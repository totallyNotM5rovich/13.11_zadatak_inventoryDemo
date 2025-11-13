public class ElectronicItem extends Product{
    private int warrentyMonths;

    public ElectronicItem(int productID, String name, double price, int warrentyMonths) {
        super(productID, name, price);
        this.warrentyMonths = warrentyMonths;
    }

    @Override
    public String getDescription() {
        return "Naziv: " + getName() + ", trajanje jamstva: " + warrentyMonths + "mj., cijena: " + getPrice() + "€";
    }
}
