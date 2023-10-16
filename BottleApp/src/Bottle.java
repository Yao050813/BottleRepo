import java.util.Scanner;

public class Bottle {

    private float height;
    private int volume;

    Bottle(){}

    Bottle(float height, int volume) {
        this.height = height;
        this.volume = volume;
    }

    public float getHeight () {
        return this.height;
    }

    public int getVolume() {
        return this.volume;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setDetails() {
        System.out.println("Please enter a Height : ");
        Scanner input = new Scanner(System.in);
        this.height = input.nextFloat();

        System.out.println("Please enter a Volume : ");
        this.volume = input.nextInt();
    }
    public void print() {
        System.out.println("The Bottle Height is : " + this.height + "m");
        System.out.println("The Bottle Volume is : " + this.volume + "ml");
    }
}
