import java.util.*;

public class FormatTime
{

public static void main(String[] args)
{

Scanner sc = new Scanner(System.in);

System.out.println("Enter a number in seconds to format: ");

int secs = sc.nextInt();

int hours = secs / 3600;
int remainder = secs % 3600;
int minutes = remainder / 60;
int seconds = remainder % 60;

System.out.println(hours +":"+ minutes+":"+ seconds);
}

}

