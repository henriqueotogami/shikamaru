package kagemane.test.java.model;

import jutsu.main.java.model.TemplateJutsu;

import java.util.ServiceLoader;

public class TestKagameNoJutsu {

    private static boolean isSuccessExecuteKagameNoJutsu = false;

    public static void main(String[] args) { startTraining(); }

    private static void startTraining() {
        System.out.println("TestKagameNoJutsu - startTraining(): BEGIN");
        try{
            final TemplateJutsu loadServiceTemplateJutsu = ServiceLoader.load(TemplateJutsu.class).findFirst().get();
            loadServiceTemplateJutsu.prepareJutsu();
            System.out.println("TestKagameNoJutsu - startTraining() - Jutsu classification: " + loadServiceTemplateJutsu.getJutsusClassification());
            System.out.println("TestKagameNoJutsu - startTraining() - Hand seals: " + loadServiceTemplateJutsu.getHandSeals());
            System.out.println("TestKagameNoJutsu - startTraining() - Elemental chackra type: " + loadServiceTemplateJutsu.getElementalChackraType());
            loadServiceTemplateJutsu.executeJutsu();
            isSuccessExecuteKagameNoJutsu = (loadServiceTemplateJutsu.getHandSeals().getHandSealsSequence().length > 0);
        } catch (final Exception exception) {
            exception.printStackTrace();
        }
        System.out.println("TestKagameNoJutsu - startTraining(): END");
    }
}
