public abstract class Character{
  public boolean isGood;
  public double height;
  public int age;
  public int intellect;
  public int strength;
  public String name;
  public abstract void setStrength();
  public abstract void setIntellect();
  public abstract void birthday();
  public String toString(){
    return name + " is " + age + " years old and has an intellect of " +
    intellect + ", a strength of " + strength + ", and a height of "+ height
    + " feet.";
  }
}
