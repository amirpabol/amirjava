public class Rope {
    public void swing() {
        System.out.print(" swing ");
    }
    
    public void climb() {
        System.out.println(" climb ");
    }

    public void play() {
        swing();  // Calls static method swing()
        // climb();  // Calls non-static method climb()
    }

    public static void main(String[] args) {
        Rope rope = new Rope();   // Creates a new instance of Rope
        rope.play();              // Calls the instance method play()

        Rope rope2 = null;        // Creates a null reference of Rope
        rope2.play();             // Tries to call play() on a null reference
    }
}
