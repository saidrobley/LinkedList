/**
 * Created by saidrobley on 8/20/17.
 */
public class BasicLinkedList {
    private Node first;
    private Node last;
    private int nodeCount;

    public BasicLinkedList(){
        this.first = null;
        this.last = null;
        nodeCount = 0;
    }

    public int size(){
        return nodeCount;
    }

    public void addToLast(int item){
        // adding something for the first time
        if(first == null){
            first = new Node(item);
            last = first;
        } else{
            Node newLastNode = new Node(item);
            last.setNextNode(newLastNode);
            last = newLastNode;

        }
        nodeCount++;
    }
    public void addToFirst(int item){
        if(first == null){
            first = new Node(item);
            last = first;
        }else{
            Node newFirst = new Node(item);
            newFirst.setNextNode(first);
            first = newFirst;
        }
        nodeCount++;
    }


    public int removeFirst(){
        if (first == null){
            throw new IllegalArgumentException("the list is empty there are no items to remove");
        } else{
            Node temp = first;
            first = first.getNextNode();
            nodeCount--;
            return temp.getData();


        }
    }

    public int removeLast(){
        Node temp = first;
        Node temp2 = first.getNextNode();
        if(last == null){
            throw new IllegalArgumentException("the list is empty there are not items to remove");
        }else{
            while(temp2.getNextNode() != null){
                temp = temp.getNextNode();
                temp2 = temp2.getNextNode();
            }
            last = temp;
            last.setNextNode(null);

        }

        nodeCount--;
        last = temp;
        return last.getData();

    }

    public void insertAt(int pos, int item){
        Node temp = first;
        if(pos > nodeCount){
            throw new IllegalArgumentException("can not insert at that position");
        } else{

        }
    }



    public static void print(Node l){
       // Node temp = first;
        while(l != null){
            System.out.print(l.getData() + " ");
            l = l.getNextNode();
        }
    }



    public static void main(String[] args){
        BasicLinkedList ls = new BasicLinkedList();
        ls.addToLast(1);
        ls.size();
        ls.addToLast(2);
        ls.addToLast(3);
        ls.addToLast(4);
        ls.addToFirst(10);
        ls.addToLast(20);
        print(ls.first);
        System.out.println();
        ls.removeLast();
        ls.removeFirst();
       // System.out.println(ls.last.getData());
        print(ls.first);

    }





}
