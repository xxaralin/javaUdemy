public class MyLinkedList implements NodeList{
    private ListItem root=null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if(this.root==null){
            this.root=newItem;
            return true;
        }
        ListItem currentItem=this.root;
        while (currentItem!=null){
            int comparison=(currentItem.compareTo(newItem));
            if(comparison<0){
                if(currentItem.next()!=null){
                    currentItem=currentItem.next();
                }else{
                    currentItem.setNext(newItem).setPrev(currentItem);
                    return true;
                }
            } else if(comparison>0){
                if(currentItem.prev()!=null){
                    currentItem.prev().setNext(newItem);
                    newItem.setPrev(currentItem.prev());
                    newItem.setNext(currentItem);
                    currentItem.setPrev(newItem);
                }else {
                    newItem.setNext(this.root);
                    this.root.setPrev(newItem);
                    this.root=newItem;
                }
                return true;
            }else{
                System.out.println(newItem.getValue()+" is already on the list");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if(item!=null){
            System.out.println("Deleting item "+ item.getValue());
        }
        ListItem currentItem = this.root;
        while(currentItem!=null){
            int comparison=currentItem.compareTo(item);
            if(comparison==0){
                if(currentItem==this.root){
                    this.root=currentItem.next();
                }else{
                    currentItem.prev().setNext(currentItem.next());
                    if(currentItem.next()!=null){
                        currentItem.next().setPrev(currentItem.prev());
                    }
                }
                return true;
            } else if (comparison<0) {
                currentItem=currentItem.next();
            }else{
                return false;
            }

        }
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if(root==null){
            System.out.println("list is empty");
        }else {
            while(root!=null){
                System.out.println(root.getValue());
                root=root.next();
            }
        }
    }
}
