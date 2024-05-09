public class Car {
    private String model;
    private double pricePerDay;
    private char typeOfTransmission;
    private String typeOfFuel;


    public Car(String model, double pricePerDay, char typeOfTransmission, String typeOfFuel) {
        this.model = model;
        this.pricePerDay = pricePerDay;
        this.typeOfTransmission = typeOfTransmission;
        this.typeOfFuel = typeOfFuel;
    }

    @Override
    public String toString() {
        String strTransmission = "";
        switch (typeOfTransmission) {
            case 'A':
                strTransmission = "automāts";
                break;
            case 'B':
                strTransmission = "mehanika";
                break;
            default:
                break;

        }

        return "Automašīnas modelis: " + model + "\n" +
                "Cena par dienu: " + pricePerDay + " EUR\n" +
                "Pārnešana veids: " + strTransmission + "\n" +
                "Degvielas veids: " + typeOfFuel + "\n";
    }

    public String getModelAndPrice() {
        return model+" "+pricePerDay+" EUR/h";
    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public char typeOfTransmission() {
        return typeOfTransmission;
    }

    public void typeOfTransmission(char typeOfTransmission) {
        this.typeOfTransmission = typeOfTransmission;
    }

    public String getTypeOfFuel() {
        return typeOfFuel;
    }

    public void setTypeOfFuel(String typeOfFuel) {
        this.typeOfFuel = typeOfFuel;
    }
}
