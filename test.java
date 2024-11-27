public class test {
    
public test() {
    System.out.println("a");
}

public void test(){
    System.out.println("b");
}

public void run() {
    new test();
    test();
}

    public static void main(String[] args){
        new test().run();


    }
}
