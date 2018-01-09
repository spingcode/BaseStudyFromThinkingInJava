package im.fenqi.study.chapter11.part05.stack;
/*
 * 11.8、栈测试
 *
 * */
public class StackTest {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        for (String s:"my dog is tomy hello aa".split(" "))
            stack.push(s);
        while (!stack.isEmpty())
            System.out.print(stack.pop()+" ");
    }
}