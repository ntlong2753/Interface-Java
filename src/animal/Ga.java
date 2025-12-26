package animal;

import edible.Edible;

public class Ga extends DongVat implements Edible {
    @Override
    public String amThanh() {
        return "Gà: pac pac pac";
    }
    @Override
    public String howToEat() {
        return "Gà luộc";
    }
}
