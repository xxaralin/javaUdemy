public class Main {
    public static void main(String[] args) {
        MyLinkedList list=new MyLinkedList(null);
        list.traverse(list.getRoot());
        //String stringData="Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";
        String stringData="5 7 8 9 6 3 0 1 2 4 7";

        String [] data=stringData.split(" ");
        for (String s :data){
            list.addItem(new Node(s));
        }
        list.traverse(list.getRoot());
        list.removeItem(new Node("7"));
        list.traverse(list.getRoot());
        
    }
}