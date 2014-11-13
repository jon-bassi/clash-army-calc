package units;



public class Dragon extends Unit
{
   
   // housing space for each dragon unit
   private final static int SUPPLY = 20;
   
   /**
    * Dragon(int l,int a) is a basic constructor for the dragon unit
    * it sets the level of the dragon as well as all other fields of the
    * dragon through its super constructor
    * @param level the level of the dragons
    * @param amount the number of dragons to create
    */
   public Dragon(int level, int amount)
   {
      super(level,amount*SUPPLY,amount);      
   }

   @Override
   protected void setDps(int level)
   {
      switch(level)
      {
      case 1 : dps = 140;
         break;
      case 2 : dps = 160;
         break;
      case 3 : dps = 180;
         break;
      case 4 : dps = 200;
         break;
      }
   }

   @Override
   protected void setHp(int level)
   {
      switch(level)
      {
      case 1 : hp = 1900;
         break;
      case 2 : hp = 2100;
         break;
      case 3 : hp = 2300;
         break;
      case 4 : hp = 2500;
         break;
      }
   }

   @Override
   protected void setCost(int level)
   {
      switch(level)
      {
      case 1 : cost = 25000;
         break;
      case 2 : cost = 30000;
         break;
      case 3 : cost = 36000;
         break;
      case 4 : cost = 42000;
         break;
      }
   }
   
   @Override
   public String toString()
   {
      return "Dragon:\nlevel: " + level + "\ndps: " + dps + "\nhp: " + hp +
             "\ncost: " + cost + "\nsupply: " + SUPPLY;
   }
}
