import java.util.*;

public class squish {
  public static void main (String [] args){
    double[] inputs = {-1337.1337, -10.5, -5.5, -1.5, -1, -0.3, -0.113, 0, 0.31, 0.76, 1.3, 1.99, 7.4, 160, 1337};
    for (double input : inputs){
      double submission = squish(input);
      if (submission != 8008135){
        System.out.println (submission);
      }else{
        System.out.println ("The requested number was outside the required range");
      }
    }
  }

  public static double squish (double input){
    if (input <= 100 && input >= -100){
      return (input/200+0.5);
    }
    return 8008135; //This means that the input was outside of the required range
  }

}
