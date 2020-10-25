public class Demo{

  public static void main(String[] args){
    /*
    if(args.length==0)
    printLoop(5);
    else {
      int commandLineArgument = Integer.parseInt(args[0]);
      printLoop(commandLineArgument);
    }
    */
  }

  // credit to konstantinovich for the help.
  public static void printLoop(int n){
    for(int i = 1; i <= n; i++){
      for(int j = i-1; j < n; j++){
         System.out.print(i); //prints out rectangular shaped numbers (like the example above)
      }
      System.out.println();
    }
  }

  public static String arrToString(int[] arr){

    String addedArray = "";
    String result = "";

    for(int i=0; i < arr.length; i++){

      if(i != arr.length - 1)
      result = result + arr[i] + ", ";

      if(i == arr.length - 1)
      result = result + arr[i];

    }

    addedArray = "{" + result + "}";

    return addedArray;

  }

  public static String arrayDeepToString(int[][] arr) {

    String result = "";

    for(int f = 0; f < arr.length; f++){

      if(f != arr.length-1)
      result = result + Demo.arrToString(arr[f]) + ", ";

      if(f == arr.length-1)
      result = result + Demo.arrToString(arr[f]);

    }

    return "{" + result + "}";

    }

  public static int[][] create2DArray(int rows, int cols, int maxValue){

  /*
  create2DArray(6,2,3) could return the 2D array:  (6 rows, 2 columns, values from 0-3)
  {{2, 0}, {1, 3}, {2, 1}, {3, 2}, {2, 1}, {1, 0}}
  */

    int[][]x = new int[rows][cols];

    for(int f = 0; f < x.length; f++){
      for(int i = 0; i< x[f].length; i++){
        x[f][i] = (int)(Math.round( Math.random()*(maxValue+1) * 10.0) / 10);
      }
    }

    return x;

  }

  public static int[][] create2DArrayRandomized(int rows, int maxCols, int maxValue){

  /*
  create2DArrayRandomized will also randomize the number of columns in
  each row from 0 to cols inclusive.

  Create2DArrayRandomized(6,4,4)  [6 rows, 0-4 elements per row, values 0-4 ]
  {{},
  {2},
  {4, 2, 2, 3},
  {0, 3},
  {3, 1},
  {3, 2}}

  */

    int[][]y = new int[rows][];

    for(int i = 0; i < rows; i++ ){
      y[i] = new int[(int)(Math.round( Math.random()*(maxCols+1) * 10.0) / 10)];
    }

    for(int f = 0; f < y.length; f++){
      for(int i = 0; i< y[f].length; i++){
        y[f][i] = (int)(Math.round( Math.random()*(maxValue+1) * 10.0) / 10);
      }
    }

  return y;

  }

}
