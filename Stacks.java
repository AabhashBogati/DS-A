import java.util.Stack;

public class Stacks {
    public static void main(String[] args) throws Exception {
        
        Stack<String> stack = new Stack<String>();

        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("Doom");
        stack.push("GTA V");
        stack.push("Farcry");

        //String lastGame = stack.pop();
        //System.out.println(stack.peek());
        System.out.println(stack.search("Doom"));
    }
}
