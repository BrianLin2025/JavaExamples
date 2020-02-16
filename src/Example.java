public class Example {

    public static void moveToLine(int color) {
        // move leftMotor
        // move rightMotor
        // check color sensor reading
        if (color == 1) {
            // return when whiteline detected
        } else if (color == 0) {
            // return when black line detected
        }
    }

    public static double calculateVolume(double length) {
        return Math.pow(length, 3);
    }

    public static void main(String[] args) {
        moveToLine(0);
        moveToLine(1);
        moveStraight(3);
    }
}
