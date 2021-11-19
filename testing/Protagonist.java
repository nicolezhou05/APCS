public class Protagonist{
  public int health = 10;
  private int atkpwr;

  public boolean isAlive(){
    if (health > 0){
      return true;
    }
    return false;
  }

  public void specialize(){
    atkpwr = 4;
  }
`
  public void normalize(){
    atkpwr = 2;
  }

  public int attack(being){
    being.health -= atkpwr;
    return atkpwr;
  }
}
