package jutsu.main.java.model;

public enum ElementalChackraType {

    FIRE("Fire"),
    WIND("Wind"),
    LIGHTNING("Lightning"),
    EARTH("Earth"),
    WATER("Water"),
    YIN("Yin");

    private String chackraTypeName;

    ElementalChackraType(final String checkraTypeName) { this.chackraTypeName = checkraTypeName; }

    public String getChackraTypeName() { return chackraTypeName; }
}
