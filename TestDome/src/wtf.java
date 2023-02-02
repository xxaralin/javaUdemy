import java.util.LinkedList;

public class wtf {

    LinkedList<Integer> train = new LinkedList<>();

    public void attachWagonFromLeft(int wagonId) {

        train.addLast(wagonId);
    }

    public void attachWagonFromRight(int wagonId) {

        train.addFirst(wagonId);
    }

    public int detachWagonFromLeft() {
        int removedWagonId = train.getLast();

        if (!train.isEmpty()){

            train.removeLast();
        } return removedWagonId;


    }
    public int detachWagonFromRight() {
        int removedWagonId = train.getFirst();
        if (!train.isEmpty()){
            train.removeFirst();
        }
        return removedWagonId;


    }

    public static void main(String[] args) {
        wtf train = new wtf();
        train.attachWagonFromLeft(7);
        train.attachWagonFromLeft(13);
        System.out.println(train.detachWagonFromRight()); // 7
        System.out.println(train.detachWagonFromLeft()); // 13
    }
}