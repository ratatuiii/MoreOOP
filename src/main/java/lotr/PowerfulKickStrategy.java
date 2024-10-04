package lotr;
public class PowerfulKickStrategy implements KickStrategy {
    @Override
    public void kick(Character attacker, Character defender) {
        if (attacker.getPower() > defender.getPower()) {
            defender.setHp(0);
        } else {
            defender.setPower(defender.getPower() - 1);
        }
    }
}