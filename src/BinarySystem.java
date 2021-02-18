import java.util.*;

public class BinarySystem {
    public static void main(String[] args) {
while(true)
{
    Scanner scan = new Scanner(System.in);
    float a = scan.nextInt();

    //Обєкт класу List
    List<Integer> ints = new ArrayList<Integer>();

    while (a > 0)
    {
        float b = 2f;
        float remainder = a % b;
        float aDilene = a / 2;
        int rounding = (int) Math.floor(aDilene);
        a = rounding;
        int roundingIO = (int) Math.floor(remainder);

        //Додаєму обєкт в List ints.add
        ints.add((int) roundingIO);
    }
        //Вивід List в зворотньму порядку
        Collections.reverse(ints);
    for (int b = 0; b != ints.size(); )
    {
        System.out.print(ints.get(b));
        b++;
    }
    System.out.println("");
        }
    }
}
