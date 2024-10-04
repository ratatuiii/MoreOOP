package lotr;
public class HobbitKickStrategy implements KickStrategy {
    @Override
    public void kick(Character attacker, Character defender) {
        System.out.println("Hobbit is crying!");
    }
}
