package units;



public class Healer extends Unit
{
   
   // housing space for each healer unit
   private final static int SUPPLY = 14;
   
   /**
    * Healer(int l,int a) is a basic constructor for the healer unit
    * it sets the level of the healer as well as all other fields of the
    * healer through its super constructor
    * @param level the level of the healers
    * @param amount the number of healers to create
    */
   public Healer(int level, int amount)
   {
      super(level,amount*SUPPLY,amount);      
   }

   @Override
   protected void setDps(int level)
   {
      dps = 0;
   }

   @Override
   protected void setHp(int level)
   {
      switch(level)
      {
      case 1 : hp = 500;
         break;
      case 2 : hp = 600;
         break;
      case 3 : hp = 840;
         break;
      case 4 : hp = 1176;
         break;
      }
   }

   @Override
   protected void setCost(int level)
   {
      switch(level)
      {
      case 1 : cost = 5000;
         break;
      case 2 : cost = 6000;
         break;
      case 3 : cost = 8000;
         break;
      case 4 : cost = 10000;
         break;
      }
   }
   
   @Override
   public String toString()
   {
      return "Healer:\nlevel: " + level + "\ndps: " + dps + "\nhp: " + hp +
             "\ncost: " + cost + "\nsupply: " + SUPPLY;
   }
}
