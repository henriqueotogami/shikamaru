package kagemane.main.java.model.external;

import jutsu.main.java.model.ElementalChackraType;
import jutsu.main.java.model.HandSeals;
import jutsu.main.java.model.JutsusClassification;
import jutsu.main.java.model.TemplateJutsu;

public class KagemaneNoJutsu implements TemplateJutsu {

    private JutsusClassification jutsusClassification;
    private HandSeals handSeals;
    private ElementalChackraType elementalChackraType;

    private int amountShadowsAround = 0;


    @Override
    public void prepareJutsu() { prepareJutsu(10); }

    public void prepareJutsu(final JutsusClassification jutsusClassification, final HandSeals handSeals,
                           final ElementalChackraType elementalChackraType,  final int amountShadowsAround) {
        this.jutsusClassification = jutsusClassification;
        this.handSeals = handSeals;
        this.elementalChackraType = elementalChackraType;
        this.amountShadowsAround = amountShadowsAround;
    }

     public void prepareJutsu(final int amountShadowsAround) {
        this.jutsusClassification = JutsusClassification.NINJUTSU;
        this.handSeals = HandSeals.MOUSE;
        this.elementalChackraType = ElementalChackraType.YIN;
        this.amountShadowsAround = amountShadowsAround;
    }

    @Override
    public void executeJutsu() { executeKagamaneNoJutsu(); }

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

    public int getAmountShadowsAround() { return amountShadowsAround; }

    public void executeKagamaneNoJutsu() {
        System.out.println("KagemaneNoJutsu - executeKagamaneNoJutsu(): START");
        int index = 0;
        while(amountShadowsAround > index) {
            System.out.println("KagemaneNoJutsu - executeKagamaneNoJutsu(): Firing shadows beams");
            index++;
        }
    }

}
