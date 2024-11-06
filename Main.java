public class Main {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5.0);
        RoundPeg rpeg = new RoundPeg(5.0);
        System.out.println("Round peg r5 fits round hole r5: " + hole.fits(rpeg)); // true

        SquarePeg smallSqPeg = new SquarePeg(5.0);
        SquarePeg largeSqPeg = new SquarePeg(10.0);

        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);
        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);

        System.out.println("Small square peg w5 fits round hole r5: " + hole.fits(smallSqPegAdapter)); // true
        System.out.println("Large square peg w10 fits round hole r5: " + hole.fits(largeSqPegAdapter)); // false
    }
}
