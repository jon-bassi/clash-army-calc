package units;


public class WallBreaker extends Unit
{
   
   // housing space for each wall breaker unit
   private final static int SUPPLY = 2;
   
   /**
    * WallBreaker(int l,int a) is a basic constructor for the wall breaker unit
    * it sets the level of the wall breaker as well as all other fields of the
    * wall breaker through its super constructor
    * @param level the level of the wall breakers
    * @param amount the number of wall breakers to create
    */
   public WallBreaker(int level, int amount)
   {
      super(level,amount*SUPPLY,amount);      
   }

   @Override
   protected void setDps(int level)
   {
      switch(level)
      {
      case 1 : dps = 12;
         break;
      case 2 : dps = 16;
         break;
      case 3 : dps = 24;
         break;
      case 4 : dps = 32;
         break;
      case 5 : dps = 46;
         break;
      case 6 : dps = 60;
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
      case 2 : hp = 24;
         break;
      case 3 : hp = 29;
         break;
      case 4 : hp = 35;
         break;
      case 5 : hp = 42;
         break;
      case 6 : hp = 54;
         break;
      }
   }

   @Override
   protected void setCost(int level)
   {
      switch(level)
      {
      case 1 : cost = 1000;
         break;
      case 2 : cost = 1500;
         break;
      case 3 : cost = 2000;
         break;
      case 4 : cost = 2500;
         break;
      case 5 : cost = 3000;
         break;
      case 6 : cost = 3500;
         break;
      }
   }
   
   @Override
   public String toString()
   {
      return "Wall Breaker:\nlevel: " + level + "\ndps: " + dps + "\nhp: " +
             hp + "\ncost: " + cost + "\nsupply: " + SUPPLY;
   }
}
