package units;


public class Pekka extends Unit
{
   
   // housing space for each pekka unit
   private final static int SUPPLY = 25;
   
   /**
    * Pekka(int l,int a) is a basic constructor for the pekka unit
    * it sets the level of the pekka as well as all other fields of the
    * pekka through its super constructor
    * @param level the level of the pekkas
    * @param amount the amount of pekkas to create
    */
   public Pekka(int level, int amount)
   {
      super(level,amount*SUPPLY,amount);      
   }

   @Override
   protected void setDps(int level)
   {
      switch(level)
      {
      case 1 : dps = 240;
         break;
      case 2 : dps = 270;
         break;
      case 3 : dps = 300;
         break;
      case 4 : dps = 340;
         break;
      case 5 : dps = 380;
         break;
      }
   }

   @Override
   protected void setHp(int level)
   {
      switch(level)
      {
      case 1 : hp = 2800;
         break;
      case 2 : hp = 3100;
         break;
      case 3 : hp = 3500;
         break;
      case 4 : hp = 4000;
         break;
      case 5 : hp = 4500;
         break;
      }
   }

   @Override
   protected void setCost(int level)
   {
      switch(level)
      {
      case 1 : cost = 30000;
         break;
      case 2 : cost = 35000;
         break;
      case 3 : cost = 40000;
         break;
      case 4 : cost = 45000;
         break;
      case 5 : cost = 50000;
         break;
      }
   }
   
   @Override
   public String toString()
   {
      return "Pekka:\nlevel: " + level + "\ndps: " + dps + "\nhp: " + hp +
             "\ncost: " + cost + "\nsupply: " + SUPPLY;
   }
}
