import java.util.Scanner;

public class TestTurtles { 
  
  public static void main(String[] args) throws InterruptedException { 
   
    
    World w = new World(600,600);
    Turtle t1 = new Turtle(w);
    
    
    while (1 < 200) {
      t1.move(5);
      Thread.sleep(200);
    }
    
    
  }
}
