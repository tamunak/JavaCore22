package chapter.chapter3;

public class Light {

    public static void main(String[] args) {

        int LightSpeed;
        long days;
        long seconds;
        long distance;

        LightSpeed = 186000;
        days = 1000;
        seconds = days * 24 * 60 * 60;
        distance = LightSpeed * seconds;

        System.out.print("За " + days);
        System.out.print(" дней свет пройдет около ");
        System.out.println(distance + " миль");
    }

}
