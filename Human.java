public class Human extends Character{

  private boolean excercising;
  private boolean studying;

  public Human(){this(0,0.0,0,0,"<NoName>");} //default Constructor calls non-default constructor <below>

  public Human(int i, double j, int k, int l, String m ){ //non-default constructor, didn't feel like making over 2
    intellect = i;                                        //constructors
    height = j;
    age = k;
    strength = l;
    name = m;
  }

  public void Excercising(int time){ //In retrospect, this and Studying could have been done in the set methods but
    excercising = true;              // whatever, it's a good way to demonstrate class calls.
    for(int t = 0; t < time; t++){
      setStrength();                 // Class call with no parameters
    }
    excercising = false;
  }

  public void setStrength(){
    if(excercising){
      strength = strength + 1; // long increment (can change increment factor to 2, 3, etc.)
    }
  }

  public void Studying(int time){
    studying = true;
    for(int t = 0; t < time; t++){ // standard for-loop
      setIntellect();
    }
    studying = false;
  }

  public void setIntellect(){
    if(studying){
      intellect++;            // super-simple increment only by 1
    }
  }

  public void birthday(){
    age+=1;               //simple increment (can change increment factor to 2, 3, etc.)
    System.out.println("Happy Birthday to " + name + " who is now "+ age +" years old.");
  }

  public String toString(){
    return "Human " + super.toString();
  }
}
