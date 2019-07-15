package pl.carshare.carshare.car.model;

public enum CarBody {
    SUV("SUV","SUV"), COUPE("coupe","coupe"),
    DUAL_COWL("dual cowl","dual cowl"), FASTBACK("fastback","fastback"),
    HATCHBACK("hatchback","hatchback"), CABRIOLET("cabriolet", "kabriolet"),
    KOMBI("kombi","kombi"), LIFTBACK("liftback","liftback"),
    LIMOUSINE("limousine", "limuzyna"), MICROVAN("microvan", "mikrovan"),
    MINIVAN("minivan","minivan"), PICKUP("pickup","pickup"),
    ROADSTER("roadster","roadster"), SEDAN("sedan","sedan"),
    TARGA("targa","targa"), VAN("van","van");

    private String englishName;
    private String polishName;

    CarBody(String englishName, String polishName) {
        this.englishName = englishName;
        this.polishName = polishName;
    }

    public String getEnglishName() {
        return englishName;
    }

    public String getPolishName() {
        return polishName;
    }
}
