import java.util.Random;

enum Suite{SPADE, CLUB, DIAMOND, HEART;
}
enum Face{ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING;
}
public class Card {
    private Suite suite;
    private Face face;

    public Card(Suite suite, Face face) {
        this.suite = suite;
        this.face = face;
    }

    public Card(){
        Random random = new Random();
        int randomInt = random.nextInt(0,4);
        suite = switch(randomInt){
            case 0 -> Suite.SPADE;
            case 1 -> Suite.CLUB;
            case 2-> Suite.DIAMOND;
            case 3 -> Suite.HEART;
            default -> throw new IllegalStateException("Unexpected value: " + randomInt);
        };
        int randomFace = random.nextInt(1,14);
        face = switch (randomFace){
            case 1 -> Face.ACE;
            case 2 -> Face.TWO;
            case 3 -> Face.THREE;
            case 4 -> Face.FOUR;
            case 5 -> Face.FIVE;
            case 6 -> Face.SIX;
            case 7 -> Face.SEVEN;
            case 8 -> Face.EIGHT;
            case 9 -> Face.NINE;
            case 10 -> Face.TEN;
            case 11 -> Face.JACK;
            case 12 -> Face.QUEEN;
            case 13 -> Face.KING;
            default -> throw new IllegalStateException("Unexpected value: " + randomFace);
        };
    }
    @Override
    public String toString(){
        return face + " of " + suite;
    }
}
