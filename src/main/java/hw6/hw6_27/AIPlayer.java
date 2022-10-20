package hw6.hw6_27;

public class AIPlayer {
    private int hp;

    public void setHp(int hp) {
        if ((hp < 0) || (hp > 100)) {
            throw new IllegalArgumentException();
        } else {
            this.hp = hp;
        }
    }
}
