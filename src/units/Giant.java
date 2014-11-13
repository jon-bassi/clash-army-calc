package units;



public class Giant extends Unit
{
   
   // housing space for each giant unit
   private final static int SUPPLY = 5;
   
   /**
    * Giant(int l,int a) is a basic constructor for the giant unit
    * it sets the level of the giant as well as all other fields of the
    * giant through its super constructor
    * @param level the level of the giants
    * @param amount the number of giants to create
    */
   public Giant(int level, int amount)
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
      case 5 : dps = 31;
         break;
      case 6 : dps = 43;
         break;
      }
   }

   @Override
   protected void setHp(int level)
   {
      switch(level)
      {
      case 1 : hp = 300;
         break;
      case 2 : hp = 360;
         break;
      case 3 : hp = 430;
         break;
      case 4 : hp = 520;
         break;
      case 5 : hp = 670;
         break;
      case 6 : hp = 940;
         break;
      }
   }

   @Override
   protected void setCost(int level)
   {
      switch(level)
      {
      case 1 : cost = 500;
         break;
      case 2 : cost = 1000;
         break;
      case 3 : cost = 1500;
         break;
      case 4 : cost = 2000;
         break;
      case 5 : cost = 2500;
         break;
      case 6 : cost = 3000;
         break;
      }
   }
   
   @Override
   public String toString()
   {
      return "Giant:\nlevel: " + level + "\ndps: " + dps + "\nhp: " + hp +
             "\ncost: " + cost + "\nsupply: " + SUPPLY;
   }
}
