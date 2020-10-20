public class Demo{

  public static void main(String[] args){

    if(args.length==0)
    printLoop(5);
    else {
      int commandLineArgument = Integer.parseInt(args[0]);
      printLoop(commandLineArgument);
    }
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

}
