public class Traktrix {
  
  public static void main(String[] args) throws InterruptedException {
    
    World w = new World(400, 400);
    Turtle t1 = new Turtle(w, 20, 20);
    Turtle t2 = new Turtle(w,20, w.getHeight() - 20);
    Turtle t3 = new Turtle(w, w.getWidth() - 20, 20);
    Turtle t4 = new Turtle(w, w.getWidth() - 20, w.getHeight() - 20);
    
    
    
    while(t1.distanceRealOrigo() > 20 || t2.distanceRealOrigo() > 20 || t3.distanceRealOrigo() > 20 || t4.distanceRealOrigo() > 20){
      t1.turnTo(t3);
      t1.move(5);
      t2.turnTo(t1);
      t2.move(5);
      t3.turnTo(t4);
      t3.move(5);
      t4.turnTo(t2);
      t4.move(5);      
      Thread.sleep(35); 
    }
  
  }
}




