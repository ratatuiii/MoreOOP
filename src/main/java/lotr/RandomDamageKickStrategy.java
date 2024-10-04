package lotr;
import java.util.Random;

public class RandomDamageKickStrategy implements KickStrategy {
    @Override
    public void kick(Character attacker, Character defender) {
        int damage = new Random().nextInt(attacker.getPower()) + 1;
        defender.setHp(defender.getHp() - damage);
    }
}