package jutsu.main.java.model;

public enum JutsusClassification {

    GENJUTSU("GENJUTSU"),
    NINJUTSU("NINJUTSU"),
    TAIJUTSU("TAIJUTSU"),
    SHINJUTSU("SHINJUTSU");

    private String jutsuName;

    JutsusClassification(final String jutsuName) { this.jutsuName = jutsuName; }

    private String getJutsuName() { return jutsuName; }
}
