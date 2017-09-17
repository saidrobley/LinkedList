/**
 * Created by saidrobley on 8/20/17.
 */
public class Node {
    private Node nextNode;
    private int data;

     public Node(int data){
        this.nextNode = null;
         this.data = data;
    }

    public void setNextNode(Node nextNode){
        this.nextNode = nextNode;
    }

    public Node getNextNode(){
        return nextNode;
    }


    public int getData(){
        return data;
    }
    public String toString(){
        return data + "";
    }
}
