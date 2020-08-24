package src;
import org.junit.*;

public class A {
    @Test
    public void test(){
        System.out.println("JAVA_HOME: " + System.getenv("JAVA_HOME"));
    }
}