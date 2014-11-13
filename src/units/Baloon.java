package units;



public class Balloon extends Unit
{
   
   // housing space for each balloon unit
   private final static int SUPPLY = 5;
   
   /**
    * Balloon(int l,int a) is a basic constructor for the balloon unit
    * it sets the level of the ballon as well as all other fields of the
    * balloon through its super constructor
    * @param level the level of the balloons
    * @param amount the number of baloons to create
    */
   public Balloon(int level, int amount)
   {
      super(level,amount*SUPPLY,amount);      
   }

   @Override
   protected void setDps(int level)
   {
      switch(level)
      {
      case 1 : dps = 25;
         break;
      case 2 : dps = 32;
         break;
      case 3 : dps = 46;
         break;
      case 4 : dps = 72;
         break;
      case 5 : dps = 106;
         break;
      case 6 : dps = 162;
         break;
      }
   }

   @Override
   protected void setHp(int level)
   {
      switch(level)
      {
      case 1 : hp = 150;
         break;
      case 2 : hp = 180;
         break;
      case 3 : hp = 216;
         break;
      case 4 : hp = 280;
         break;
      case 5 : hp = 390;
         break;
      case 6 : hp = 545;
         break;
      }
   }

   @Override
   protected void setCost(int level)
   {
      switch(level)
      {
      case 1 : cost = 2000;
         break;
      case 2 : cost = 2500;
         break;
      case 3 : cost = 3000;
         break;
      case 4 : cost = 3500;
         break;
      case 5 : cost = 4000;
         break;
      case 6 : cost = 4500;
         break;
      }
   }
   
   @Override
   public String toString()
   {
      return "Balloon:\nlevel: " + level + "\ndps: " + dps + "\nhp: " + hp +
             "\ncost: " + cost + "\nsupply: " + SUPPLY;
   }
}
