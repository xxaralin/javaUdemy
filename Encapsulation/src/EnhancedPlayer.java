public class EnhancedPlayer {
    private String name;
    private int health;
    private String weapon;

    public EnhancedPlayer(String name) {
        this(name, 100,"Sword");
    }

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        this.health = (health<=0 ? 1 :(health>=100 ? 100: health));
        this.weapon = weapon;
    }

    public void loseHealth(int damage){
        health=health-damage;
        if(health<=0){
            System.out.println("player out");
        }
    }
    public int healthRemaining(){
        return health;
    }
    public void restoreHealth(int extraHealth){
        health=health+extraHealth;
        if(health>=100){
            System.out.println("player restored 100%");
            health=100;
        }

    }

}
