public class Main {
    public static void main(String[] args) {
        GearBox gearBox = new GearBox();
        gearBox.shiftUp();
        gearBox.shiftUp();
        gearBox.shiftUp();
        System.out.println(gearBox.getCurrentGear());
        gearBox.shiftDown();
        System.out.println(gearBox.getCurrentGear());
        gearBox.switchNeutral();
        gearBox.switchRear();
        gearBox.shiftUp();
        System.out.println(gearBox.getCurrentGear());
        gearBox.switchNeutral();
        System.out.println(gearBox.getCurrentGear());
    }
}
