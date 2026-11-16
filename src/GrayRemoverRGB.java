import java.util.Scanner;

public class GrayRemoverRGB {
  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);

    int red = scnr.nextInt();
    int green = scnr.nextInt();
    int blue = scnr.nextInt();

    int gray = Math.min(red, Math.min(green, blue));

    red = red - gray;
    green = green - gray;
    blue = blue - gray;

    System.out.println(red + " " + green + " " + blue);

  }
}

  }
}
