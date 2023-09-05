public class AddMeth {
    public static void main(String[] args) {

        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();

        int range1, range2;

        minivan.passemgers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        sportscar.passemgers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        System.out.print("Minivan can carry " + minivan.passemgers + ". ");
        minivan.range();

        System.out.print("Sportscar can carry " + sportscar.passemgers + ". ");
        sportscar.range();

    }

}
