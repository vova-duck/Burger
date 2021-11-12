package HomeWork11;

public class DoubleBurger extends Burger{
    public String type = "Double burger";
    public int cutlet = 2;
    public boolean souse = true;
    public String toString() {

        return this.type + " consists of " + this.bun + this.cheese  + this.cutlet +" cutlets" + this.souse + this.green;

    }
}
