public class Lab2{
    public void printTree(int levels) {
      for (int i = 1; i <= levels; i++) {
          for (int j = 0; j < levels - i; j++) {
              System.out.print(" ");
          }

          for (int k = 0; k < (2 * i - 1); k++) {
              System.out.print("♦");
          }
          System.out.println();
      }
  }

  public void createAndPrintArray(int rows, int cols) {
      int[][] array = new int[rows][cols];
      int value = 1;

      for (int i = 0; i < rows; i++) {
          for (int j = 0; j < cols; j++) {
              array[i][j] = value;
              value += 3;
          }
      }

      for (int i = 0; i < rows; i++) {
          for (int j = 0; j < cols; j++) {
              System.out.print(array[i][j] + "\t");
          }
          System.out.println();
      }
  }

  public static void main(String[] args) {
      Lab2 task = new Lab2();

      System.out.println("Tree :");
      task.printTree(10);

      System.out.println("\nTwo-dimensional array w:");
      task.createAndPrintArray(5, 5);
  }
}