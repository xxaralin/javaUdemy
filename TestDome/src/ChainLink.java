enum Side { NONE, LEFT, RIGHT }

public class ChainLink {
    private ChainLink left, right;

    public void append(ChainLink rightPart) {
        if (this.right != null)
            throw new IllegalStateException("Link is already connected.");

        this.right = rightPart;
        rightPart.left = this;
    }

    public Side longerSide() {
        if (left == null && right == null)
            return Side.NONE;
        if (left == null)
            return Side.RIGHT;
        if (right == null)
            return Side.LEFT;

        int leftLength = 0;
        int rightLength = 0;

        ChainLink current = left;
        while(current != null) {
            leftLength++;
            current = current.left;
        }

        current = right;
        while(current != null) {
            rightLength++;
            current = current.right;
        }
        return leftLength > rightLength ? Side.LEFT : Side.RIGHT;
    }

    public static void main(String[] args) {
        ChainLink left = new ChainLink();
        ChainLink middle = new ChainLink();
        ChainLink right = new ChainLink();
        left.append(middle);
        middle.append(right);
        System.out.println(left.longerSide());
    }
}