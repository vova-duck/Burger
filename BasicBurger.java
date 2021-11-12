package HomeWork11;

public class BasicBurger extends Burger {
    public String type =" Basic burger";
    public boolean souse = true;

    public String toString() {

        return this.type + " consists of " + this.bun + this.cheese + this.cutlet + this.souse + this.green;

    }

}
