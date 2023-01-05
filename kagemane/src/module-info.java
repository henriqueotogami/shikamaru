import jutsu.main.java.model.TemplateJutsu;
import kagemane.main.java.model.external.KagemaneNoJutsu;

module kagemane {

//    requires transitive kagebunshin;
    exports kagemane.main.java.model.external;


//    Outra opçao é abrir um pacote específico
//    open kagemane;
//    ou
//    opens kagemane to kagebunshin

    requires jutsu;
    provides TemplateJutsu with KagemaneNoJutsu;
    uses TemplateJutsu;
}