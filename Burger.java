package HomeWork11;

public class Burger {

    public String type = " burger ";
    public String bun = " bun ";
    public String cheese = "cheese ";
    public int cutlet = 1;
    public boolean souse = false;
    public String green = " green ";


    public String toString() {
return this.type + " consists of " + this.bun + this.cheese  + this.cutlet + "cutlet"  + this.green;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Burger burger)) {
            return false;
        }
        return this.type.equals(burger.type);
    }


}


