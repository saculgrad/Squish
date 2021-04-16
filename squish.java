import java.util.*;

public class squish {
  public static void main (String [] args){
    double[] inputs = {-1337.1337, -10.5, -5.5, -1.5, -1, -0.3, -0.113, 0, 0.31, 0.76, 1.3, 1.99, 7.4, 160, 1337};
    for (double input : inputs){
      double submission = squish(input);
      if (submission != 8008135){
        System.out.println (input+" ---> "+submission);
      }else{
        System.out.println ("The requested number was outside the required range");
      }
    }
System.out.println ("\n");
    double[] newInputs = {0, 0.000027535691114583473, 0.004070137715896128, 0.18242552380635635, 0.2689414213699951, 0.425557483188341, 0.47178002201963243, 0.5, 0.5768852611320463, 0.6813537337890256, 0.7858349830425586, 0.8797431375322491, 0.9993891206405656, 1, 1};
    for (double newInput : newInputs){
      double newSubmission = CloseToBoundryA(newInput);
      if (newSubmission != 8008135){
        System.out.println (newInput+ " ---> " +newSubmission);
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

  public static double CloseToBoundryA (double input){
    if (input <= 1 && input >=0){
      double answer = (-1.0/2.0 * (double)(Math.abs(input-0.5))+0.25);
      return answer;
    }
    return 8008135;
  }

}
