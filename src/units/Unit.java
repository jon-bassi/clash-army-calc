package units;


/*
 * Parent class of all units in the game
 */
public abstract class Unit
{
   
   // level of the unit
   protected int level;
   
   // damage per second of the unit
   protected int dps;
   
   // health points of the unit
   protected int hp;
   
   // cost of the unit in elixir
   protected int cost;
   
   // total cost of all units of one type
   protected int totCost;
   
   // housing space of the unit
   protected final static int SUPPLY = 0;
   
   // total housing space used
   private static int totalSupply;
   
   /**
    * Unit(int l,int a) is a basic constructor for all units, sets the level of the
    * unit as well as all fields relating to the unit, also keeps track of the
    * total housing space that has been used up as units are created
    * @param level the level of the unit
    * @param amount the supply of the unit * the amount of units being created
    */
   public Unit(int level, int totSupply, int amount)
   {
      this.level = level;
      setDps(level);
      setHp(level);
      setCost(level);
      addSupply(totSupply);
      totCost = calcTotCost(amount,cost);
   }
   /**
    * setDps(int l) sets the damage per second of the unit based on the level
    * @param level the level of the unit
    */
   protected abstract void setDps(int level);
   
   /**
    * setHp(int l) sets the health points of the unit based on the level
    * @param level the level of the unit
    */
   protected abstract void setHp(int level);
   
   /**
    * setCost(int l) sets the cost of the unit based on the level
    * @param level the level of the unit
    */
   protected abstract void setCost(int level);
   
   public int calcTotCost(int amount, int cost)
   {
      return amount * cost;
   }
   
   /**
    * 
    * @return
    */
   public int getTotCost()
   {
      return totCost;
   }
   
   /**
    * addSupply(int a) adds the specified amount to the total housing cost
    * of an army
    * @param amount the amount of supply to add
    */
   private static void addSupply(int amount)
   {
      totalSupply += amount;
   }
   
   /**
    * totalSupply returns the total housing cost of an army as an integer
    * @return the total housing cost of an army as an integer
    */
   public static int totalSupply()
   {
      return totalSupply;
   }
   
   /**
    * 
    */
   public static void resetTotalSupply()
   {
      totalSupply = 0;
   }
}
