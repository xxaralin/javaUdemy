import java.util.*;

public class Friend {
    private Collection<Friend> friends;
    private String email;

    public Friend(String email) {
        this.email = email;
        this.friends = new ArrayList<Friend>();
    }

    public String getEmail() {
        return email;
    }

    public Collection<Friend> getFriends() {
        return friends;
    }

    public void addFriendship(Friend friend) {
        friends.add(friend);
        friend.getFriends().add(this);
    }

    public boolean canBeConnected(Friend friend) {
        Queue<Friend> queue = new LinkedList<>();
        Set<Friend> visited = new HashSet<>();
        queue.add(this);
        visited.add(this);

        while (!queue.isEmpty()) {
            Friend current = queue.poll();
            if (current.equals(friend)) {
                return true;
            }

            for (Friend f : current.getFriends()) {
                if (!visited.contains(f)) {
                    queue.add(f);
                    visited.add(f);
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Friend a = new Friend("A");
        Friend b = new Friend("B");
        Friend c = new Friend("C");

        a.addFriendship(b);
        b.addFriendship(c);

        System.out.println(a.canBeConnected(c));
    }
}