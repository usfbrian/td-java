public class TDCharacter {
  public String dna;

  public double armor;
  public double health;
  public double patience;
  public double speed;
  public double strength;
  public double willpower;

  public TDCharacter() {
    this.dna = "ABCDEFG";
    System.out.println(this.dna);

    int armor = 0; // Method of randomization which has a long tail, 99% contained between 0 and 20
    int health = 0; // Same, 0 to 20
    int patience = 0; // Linear random, 0 to 1000, number of milliseconds to wait to damage
    int speed = 0; // Assign randomly until next 3 traits sum to 30
    int strength = 0;
    int willpower = 0;
    boolean rockThrower = false; // false gives bonus to melee damage, true gives initial and final ranged contact bonus

    double damage = 0.5 * strength * Math.pow(speed, 2);

    double whenToFlee = (30 - willpower) / 30;

    this.armor = Math.pow(0.6, (double)armor / 5);
    this.health = (double)health;
    this.patience = (double)patience;
    this.speed = (double)speed;
    this.strength = (double)strength + (rockThrower ? 1.0 : 0.0);
    this.willpower = (double)willpower;
  }

  public int getX()
  {
    return 0;
//    return (int)(this.x + 0.5);
  }

  public int getY()
  {
    return 0;
//    return (int)(this.y + 0.5);
  }

  public void fight()
  {

  }
}
