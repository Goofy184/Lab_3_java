public class Main {
    public static void main(String[] args) {
        Vessel[] vessel = {new SailingVessel(), new Submarine()};

        for (Vessel v : vessel){
            v.PrepareToMovement();
            v.Move();
        }
    }
}