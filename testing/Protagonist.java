public class Protagonist{
  private String name = "doubleN";
  public int health;
  private int attack;

  public Protagonist(){
    health = 125;
    attack = 1;
  }

  public Protagonist(String _name){
    name = _name;
  }

  public String getName(){
    return name;
  }

  public boolean isAlive(){
    return health > 0;
  }

  public void specialize(){
    attack = 2;
  }

  public void normalize(){
    attack = 1;
  }

  public int attack(Monster enemy){
    enemy.health -= attack;
    return attack;
  }
}

