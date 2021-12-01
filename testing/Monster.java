public class Monster{
  public int health;
  private int attack;

  public Monster(){
    health = 150;
    attack = 2;
  }

  public boolean isAlive(){
    return health > 0;
  }

  public int attack(Protagonist enemy){
    enemy.health -= attack;
    return attack;
  }
}
