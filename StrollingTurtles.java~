public class StrollingTurtles {
  
  public static void main(String[] args) throws InterruptedException {  
    
    // Create the world and the turtles here and other necessary initializations 
    World w = new World(400, 400);
    Turtle t1 = new Turtle(w, 175, 200);
    Turtle t2 = new Turtle(w, 225, 200);
    int collision = 0;
    int steps = 0;
    
    
    while (t1.distance(t2) < 200) {
      // Move the turtles and check for collisions
      t1.moveRandom();
      t2.moveRandom();
      steps++;
      
      if (t1.distance(t2) < 20) {
        System.out.println("Collision!");
        collision++;
      } 
      Thread.sleep(200);  // Make the program sleep for 0.2 sec.
    }
    
    // Printing the number of steps and collisions     
    System.out.println("It took " + steps + " steps.");
    System.out.println("Number of collisions: " + collision);
    
    
    
  } // End of main method
  
} // End of class 