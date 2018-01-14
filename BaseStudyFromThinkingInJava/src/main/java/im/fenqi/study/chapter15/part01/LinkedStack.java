package im.fenqi.study.chapter15.part01;
/*
*
* 15.2.2、实现一个堆栈类
* */
public class LinkedStack<AnyType> {
    private static class Node<AnyType>{
        AnyType x;
        Node<AnyType> next;

        public Node() {
            x=null;next=null;
        }

        public Node(AnyType x, Node<AnyType> next) {
            this.x = x;
            this.next = next;
        }
        boolean end(){
            return x==null&&next==null;
        }
    }
    private Node<AnyType> top = new Node<>();
    public void push(AnyType x)
    {
        top=new Node<>(x,top);
    }
    public AnyType pop()
    {
        AnyType result = top.x;
        if(!top.end())
            top=top.next;
        return result;
    }

    public static void main(String[] args) {
        LinkedStack<String> stack = new LinkedStack<>();
        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.push("4");
        stack.push("5");
        for (int i=0;i<5;i++)
            System.out.println(stack.pop());
    }
}
