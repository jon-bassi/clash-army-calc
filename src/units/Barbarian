package units;



public class Barbarian extends Unit
{
   
   // housing space for each barbarian unit
   private final static int SUPPLY = 1;
   
   /**
    * Barbarian(int l,int a) is a basic constructor for the barbarian unit
    * it sets the level of the barbarian as well as all other fields of the
    * barbarian through its super constructor
    * @param level the level of the barbarians
    * @param amount the number of barbarians to create
    */
   public Barbarian(int level, int amount)
   {
      super(level,amount*SUPPLY,amount);      
   }

   @Override
   protected void setDps(int level)
   {
      switch(level)
      {
      case 1 : dps = 8;
         break;
      case 2 : dps = 11;
         break;
      case 3 : dps = 14;
         break;
      case 4 : dps = 18;
         break;
      case 5 : dps = 23;
         break;
      case 6 : dps = 26;
         break;
      case 7 : dps = 30;
         break;
      }
   }

   @Override
   protected void setHp(int level)
   {
      switch(level)
      {
      case 1 : hp = 45;
         break;
      case 2 : hp = 54;
         break;
      case 3 : hp = 65;
         break;
      case 4 : hp = 78;
         break;
      case 5 : hp = 95;
         break;
      case 6 : hp = 110;
         break;
      case 7 : hp = 125;
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
      case 7 : cost = 125;
         break;
      }
   }
   
   @Override
   public String toString()
   {
      return "Barbarian:\nlevel: " + level + "\ndps: " + dps + "\nhp: " + hp +
             "\ncost: " + cost + "\nsupply: " + SUPPLY;
   }
}
