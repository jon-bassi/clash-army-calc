package units;


public class Wizard extends Unit
{
   
   // housing space for each wizard unit
   private final static int SUPPLY = 4;
   
   /**
    * Wizard(int l,int a) is a basic constructor for the wizard unit
    * it sets the level of the wizard as well as all other fields of the
    * wizard through its super constructor
    * @param level the level of the wizards
    * @param amount the number of wizards to create
    */
   public Wizard(int level, int amount)
   {
      super(level,amount*SUPPLY,amount);      
   }

   @Override
   protected void setDps(int level)
   {
      switch(level)
      {
      case 1 : dps = 50;
         break;
      case 2 : dps = 70;
         break;
      case 3 : dps = 90;
         break;
      case 4 : dps = 125;
         break;
      case 5 : dps = 170;
         break;
      case 6 : dps = 180;
         break;
      }
   }

   @Override
   protected void setHp(int level)
   {
      switch(level)
      {
      case 1 : hp = 75;
         break;
      case 2 : hp = 90;
         break;
      case 3 : hp = 108;
         break;
      case 4 : hp = 130;
         break;
      case 5 : hp = 156;
         break;
      case 6 : hp = 164;
         break;
      }
   }

   @Override
   protected void setCost(int level)
   {
      switch(level)
      {
      case 1 : cost = 1500;
         break;
      case 2 : cost = 2000;
         break;
      case 3 : cost = 2500;
         break;
      case 4 : cost = 3000;
         break;
      case 5 : cost = 3500;
         break;
      case 6 : cost = 4000;
         break;
      }
   }
   
   @Override
   public String toString()
   {
      return "Wizard:\nlevel: " + level + "\ndps: " + dps + "\nhp: " + hp +
             "\ncost: " + cost + "\nsupply: " + SUPPLY;
   }
}
