package jutsu.main.java.model;

public interface TemplateJutsu {

    JutsusClassification getJutsusClassification();
    HandSeals getHandSeals();
    ElementalChackraType getElementalChackraType();

    void prepareJutsu();

    void executeJutsu();
}
