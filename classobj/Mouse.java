package classobj;

public class Mouse {
    
    private int x;
    private int y;


    private int calcSensorDelay() {
        return 3;
    }
    public void move(int a, int b) {
        x = a + calcSensorDelay();
        y = b + calcSensorDelay();
    }

    public void setX(int a) {
        x = a;
    }

    public int getX() {
        return x;
    }



}
