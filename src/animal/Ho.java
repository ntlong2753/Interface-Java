package animal;

public class Ho extends DongVat implements Edible{
    @Override
    public String amThanh() {
        return "Hổ: Yahoooo!!!!!";
    }
    @Override
    public String howToEat() {
        return "Thịt hổ nướng";
    }

}
