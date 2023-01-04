package kagemane.main.java.model.external;

import jutsu.main.java.model.ElementalChackraType;
import jutsu.main.java.model.HandSeals;
import jutsu.main.java.model.JutsusClassification;
import jutsu.main.java.model.TemplateJutsu;

public class ExecuteKagemaneNoJutsu implements TemplateJutsu {

    private JutsusClassification jutsusClassification;
    private HandSeals handSeals;
    private ElementalChackraType elementalChackraType;

    public ExecuteKagemaneNoJutsu(final JutsusClassification jutsusClassification,
                                  final HandSeals handSeals, final ElementalChackraType elementalChackraType) {
        this.jutsusClassification = jutsusClassification;
        this.handSeals = handSeals;
        this.elementalChackraType = elementalChackraType;
    }

    public ExecuteKagemaneNoJutsu() {
        super();
        this.jutsusClassification = JutsusClassification.NINJUTSU;
        this.handSeals = HandSeals.MOUSE;
        this.elementalChackraType = ElementalChackraType.YIN;
    }

    /**
     * @return
     */
    @Override
    public JutsusClassification getJutsusClassification() { return jutsusClassification; }

    /**
     * @return
     */
    @Override
    public HandSeals getHandSeals() { return handSeals; }

    /**
     * @return
     */
    @Override
    public ElementalChackraType getElementalChackraType() { return elementalChackraType; }

}
