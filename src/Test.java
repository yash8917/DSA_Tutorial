import java.util.Stack;

public class Test {
    public static void main(String[] args) {
    Stack<String> anima=new Stack<>();
    anima.push("dog");
    anima.push("Horse");
    anima.push("Cat");
    anima.push("Hen");
    while(!anima.empty())
        System.out.println(anima.pop());
    }

}
