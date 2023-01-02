import jutsu.main.java.model.TemplateCalculator;
import kagemane.main.java.model.external.Calculator;

module kagemane {

//    requires transitive kagebunshin;
    exports kagemane.main.java.model.external;

    exports kagemane.main.java.model.internal
        to kagezukami;

//    Outra opçao é abrir um pacote específico
//    open kagemane;
//    ou
//    opens kagemane to kagebunshin

    requires jutsu;
    provides TemplateCalculator with Calculator;
}