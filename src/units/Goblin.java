package units;



public class Goblin extends Unit
{
   
   // housing space for each goblin unit
   private final static int SUPPLY = 1;
   
   /**
    * Goblin(int l,int a) is a basic constructor for the goblin unit
    * it sets the level of the goblin as well as all other fields of the
    * goblin through its super constructor
    * @param level the level of the goblins
    * @param amount the number of goblins to create
    */
   public Goblin(int level, int amount)
   {
      super(level,amount*SUPPLY,amount);      
   }

   @Override
   protected void setDps(int level)
   {
      switch(level)
      {
      case 1 : dps = 11;
         break;
      case 2 : dps = 14;
         break;
      case 3 : dps = 19;
         break;
      case 4 : dps = 24;
         break;
      case 5 : dps = 32;
         break;
      case 6 : dps = 42;
         break;
      }
   }

   @Override
   protected void setHp(int level)
   {
      switch(level)
      {
      case 1 : hp = 25;
         break;
      case 2 : hp = 30;
         break;
      case 3 : hp = 36;
         break;
      case 4 : hp = 43;
         break;
      case 5 : hp = 52;
         break;
      case 6 : hp = 68;
         break;
      }
   }

   @Override
   protected void setCost(int level)
   {
      switch(level)
      {
      case 1 : cost = 25;
         break;
      case 2 : cost = 40;
         break;
      case 3 : cost = 60;
         break;
      case 4 : cost = 80;
         break;
      case 5 : cost = 100;
         break;
      case 6 : cost = 150;
         break;
      }
   }
   
   @Override
   public String toString()
   {
      return "Goblin:\nlevel: " + level + "\ndps: " + dps + "\nhp: " + hp +
             "\ncost: " + cost + "\nsupply: " + SUPPLY;
   }
}
