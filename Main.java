import java.util.Random;

class Main {
  public static void Mas(){
    Random rnd = new Random();
    int mas[][] = new int[10][10];
    for(int i = 0; i < 10; i++)
    {
      for(int j = 0; j < 10; j++)
      {
        mas[i][j] = rnd.nextInt(99) + 1;
        System.out.print(mas[i][j] + "\t");
      }
      System.out.println("\n");
    }
  }

  public static void main(String[] args) {
    System.out.println("№1");
    Mas();
    System.out.println("№2");
    //Sort();
  }
}