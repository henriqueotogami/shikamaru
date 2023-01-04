package jutsu.main.java.model;

public enum HandSeals {

    BIRD("Bird"),
    BOAR("Boar"),
    DOG("Dog"),
    DRAGON("Dragon"),
    OX("Ox"), // Boi
    TIGER("Tiger"),
    SNAKE("Snake"),
    MOUSE("Mouse"),
    HORSE("Horse"),
    MONKEY("Monkey"),
    RABBIT("Rabbit"),
    RAM("Ram"); // Carneiro

    private String[] handSealsSequence = null;

    HandSeals(final String... handSealName) {
        if (handSealsSequence == null) {
            handSealsSequence = new String[handSealName.length];
        }
        int index = 0 ;
        while(handSealsSequence.length > index) {
            handSealsSequence[index] = handSealName[index];
            index++;
        }

    }

    public String[] getHandSealsSequence() { return handSealsSequence; }
}
