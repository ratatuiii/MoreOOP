package lotr;
public class Hobbit extends Character {
    public Hobbit() {
        super(0, 3, new HobbitKickStrategy());
    }
}
