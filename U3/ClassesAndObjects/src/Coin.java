public class Coin {

    private int faceUp;

    public Coin() {
        faceUp = 1;
    }

    public int showFace() {
        return faceUp;
    }

    public void flipCoin() {
        faceUp = (int) (Math.random() * 2);
    }
}
