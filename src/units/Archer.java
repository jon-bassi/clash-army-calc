package units;



public class Archer extends Unit
{
   
   // housing space for each archer unit
   private final static int SUPPLY = 1;
   
   /**
    * Archer(int l,int a) is a basic constructor for the archer unit
    * it sets the level of the archer as well as all other fields of the
    * archer through its super constructor
    * @param level the level of the archer
    * @param amount the number of archer to create
    */
   public Archer(int level, int amount)
   {
      super(level,amount*SUPPLY,amount);      
   }

   @Override
   protected void setDps(int level)
   {
      switch(level)
      {
      case 1 : dps = 7;
         break;
      case 2 : dps = 9;
         break;
      case 3 : dps = 12;
         break;
      case 4 : dps = 16;
         break;
      case 5 : dps = 20;
         break;
      case 6 : dps = 22;
         break;
      case 7 : dps = 25;
         break;
      }
   }

   @Override
   protected void setHp(int level)
   {
      switch(level)
      {
      case 1 : hp = 20;
         break;
      case 2 : hp = 23;
         break;
      case 3 : hp = 28;
         break;
      case 4 : hp = 33;
         break;
      case 5 : hp = 40;
         break;
      case 6 : hp = 44;
         break;
      case 7 : hp = 48;
         break;
      }
   }

   @Override
   protected void setCost(int level)
   {
      switch(level)
      {
      case 1 : cost = 50;
         break;
      case 2 : cost = 80;
         break;
      case 3 : cost = 120;
         break;
      case 4 : cost = 160;
         break;
      case 5 : cost = 200;
         break;
      case 6 : cost = 300;
         break;
      case 7 : cost = 400;
         break;
      }
   }
   
   @Override
   public String toString()
   {
      return "Archer:\nlevel: " + level + "\ndps: " + dps + "\nhp: " + hp +
             "\ncost: " + cost + "\nsupply: " + SUPPLY;
   }  
}
