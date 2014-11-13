import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;

import units.*;

import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class Main extends JFrame
{
   
   private final int WINDOW_HEIGHT = 400;
   private final int WINDOW_WIDTH = 600;
   
   private final int NUMBER_OF_ROWS = 12;
   private final int NUMBER_OF_COLUMNS = 5;
   
   //private JLabel messageLabel;
   

   static ArrayList<Component> rows=
         new ArrayList<Component>();
   
   
   
   public Main()
   {
      setTitle("Cuthor's Army Cost Calculator");
      
      setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
      
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      // panel implementation
      
      setLayout(new GridLayout(NUMBER_OF_ROWS,NUMBER_OF_COLUMNS));
      
      // build panels for each row and store in Array list for adding to frame
      buildRow0Panels();
      buildRow1Panels();
      buildRow2Panels();
      buildRow3Panels();
      buildRow4Panels();
      buildRow5Panels();
      buildRow6Panels();
      buildRow7Panels(0);
      buildRow8Panels(0);
      buildRow9Panels();
      buildRow10Panels();
      buildRow11Panels();
      
      // add panels for each row
      for (Component c : rows)
         add(c);
      setResizable(false);
      pack();
      setVisible(true);
   }
   
   private void buildRow0Panels()
   {
      JLabel label0 = new JLabel("Unit");
      JPanel panel0 = new JPanel();
      panel0.add(label0);
      rows.add(panel0);
      
      JLabel label1 = new JLabel("Level");
      JPanel panel1 = new JPanel();
      panel1.add(label1);
      rows.add(panel1);
      
      JLabel label2 = new JLabel("Amount");
      JPanel panel2 = new JPanel();
      panel2.add(label2);
      rows.add(panel2);
      
      JLabel label3 = new JLabel("");
      JPanel panel3 = new JPanel();
      panel3.add(label3);
      rows.add(panel3);
      
      JLabel label4 = new JLabel("");
      JPanel panel4 = new JPanel();
      panel4.add(label4);
      rows.add(panel4);
      
   }
   private void buildRow1Panels()
   {
      JLabel label0 = new JLabel("Barbarian");
      JPanel panel0 = new JPanel();
      panel0.add(label0);
      rows.add(panel0);
      
      Integer[] levels = {1,2,3,4,5,6,7};
      JComboBox<Integer> unitLvl = new JComboBox<Integer>(levels);
      rows.add(unitLvl);
      
      JTextField amount = new JTextField(3);
      JPanel panel2 = new JPanel();
      panel2.add(amount);
      rows.add(panel2);
      
      JLabel label3 = new JLabel("");
      JPanel panel3 = new JPanel();
      panel3.add(label3);
      rows.add(panel3);
      
      JLabel label4 = new JLabel("");
      JPanel panel4 = new JPanel();
      panel4.add(label4);
      rows.add(panel4);
      
   }
   
   private void buildRow2Panels()
   {
      JLabel label0 = new JLabel("Archer");
      JPanel panel0 = new JPanel();
      panel0.add(label0);
      rows.add(panel0);
      
      Integer[] levels = {1,2,3,4,5,6,7};
      JComboBox<Integer> unitLvl = new JComboBox<Integer>(levels);
      rows.add(unitLvl);
      
      JTextField amount = new JTextField(3);
      JPanel panel2 = new JPanel();
      panel2.add(amount);
      rows.add(panel2);
      
      JLabel label3 = new JLabel("");
      JPanel panel3 = new JPanel();
      panel3.add(label3);
      rows.add(panel3);
      
      //JLabel label3 = new JLabel("Housing Space");
      //JPanel panel3 = new JPanel();
      //panel3.add(label3);
      //rows.add(panel3);
      
      JLabel label4 = new JLabel("");
      JPanel panel4 = new JPanel();
      panel4.add(label4);
      rows.add(panel4);
      
      //Integer[] supply = {200,205,210,215,220,225,230,235,240};    // amount of housing available at all levels
      //JComboBox<Integer> totSupply = new JComboBox<Integer>(supply);
      //rows.add(totSupply);
      
   }
   
   private void buildRow3Panels()
   {
      JLabel label0 = new JLabel("Goblin");
      JPanel panel0 = new JPanel();
      panel0.add(label0);
      rows.add(panel0);
      
      Integer[] levels = {1,2,3,4,5,6};
      JComboBox<Integer> unitLvl = new JComboBox<Integer>(levels);
      rows.add(unitLvl);
      
      JTextField amount = new JTextField(3);
      JPanel panel2 = new JPanel();
      panel2.add(amount);
      rows.add(panel2);
      
      JLabel label3 = new JLabel("");
      JPanel panel3 = new JPanel();
      panel3.add(label3);
      rows.add(panel3);
      
      JLabel label4 = new JLabel("");
      JPanel panel4 = new JPanel();
      panel4.add(label4);
      rows.add(panel4);
      
   }
   
   private void buildRow4Panels()
   {
      JLabel label0 = new JLabel("Giant");
      JPanel panel0 = new JPanel();
      panel0.add(label0);
      rows.add(panel0);
      
      Integer[] levels = {1,2,3,4,5,6};
      JComboBox<Integer> unitLvl = new JComboBox<Integer>(levels);
      rows.add(unitLvl);
      
      JTextField amount = new JTextField(3);
      JPanel panel2 = new JPanel();
      panel2.add(amount);
      rows.add(panel2);
      
      JLabel label3 = new JLabel("");
      JPanel panel3 = new JPanel();
      panel3.add(label3);
      rows.add(panel3);
      
      JLabel label4 = new JLabel("");
      JPanel panel4 = new JPanel();
      panel4.add(label4);
      rows.add(panel4);
      
   }
   
   private void buildRow5Panels()
   {
      JLabel label0 = new JLabel("Wall Breaker");
      JPanel panel0 = new JPanel();
      panel0.add(label0);
      rows.add(panel0);
      
      Integer[] levels = {1,2,3,4,5,6};
      JComboBox<Integer> unitLvl = new JComboBox<Integer>(levels);
      rows.add(unitLvl);
      
      JTextField amount = new JTextField(3);
      JPanel panel2 = new JPanel();
      panel2.add(amount);
      rows.add(panel2);
      
      JLabel label3 = new JLabel("");
      JPanel panel3 = new JPanel();
      panel3.add(label3);
      rows.add(panel3);
      
      JLabel label4 = new JLabel("");
      JPanel panel4 = new JPanel();
      panel4.add(label4);
      rows.add(panel4);
      
   }
   
   private void buildRow6Panels()
   {
      JLabel label0 = new JLabel("Balloon");
      JPanel panel0 = new JPanel();
      panel0.add(label0);
      rows.add(panel0);
      
      Integer[] levels = {1,2,3,4,5,6};
      JComboBox<Integer> unitLvl = new JComboBox<Integer>(levels);
      rows.add(unitLvl);
      
      JTextField amount = new JTextField(3);
      JPanel panel2 = new JPanel();
      panel2.add(amount);
      rows.add(panel2);
      
      JLabel label3 = new JLabel("");
      JPanel panel3 = new JPanel();
      panel3.add(label3);
      rows.add(panel3);
      
      JLabel label4 = new JLabel("");
      JPanel panel4 = new JPanel();
      panel4.add(label4);
      rows.add(panel4);
      
   }
   
   private void buildRow7Panels(int supplyUsed)
   {
      JLabel label0 = new JLabel("Wizard");
      JPanel panel0 = new JPanel();
      panel0.add(label0);
      rows.add(panel0);
      
      Integer[] levels = {1,2,3,4,5,6};
      JComboBox<Integer> unitLvl = new JComboBox<Integer>(levels);
      rows.add(unitLvl);
      
      JTextField amount = new JTextField(3);
      JPanel panel2 = new JPanel();
      panel2.add(amount);
      rows.add(panel2);
      
      JLabel label3 = new JLabel("Supply Used:");
      JPanel panel3 = new JPanel();
      panel3.add(label3);
      rows.add(panel3);
      
      JLabel label4 = new JLabel(Integer.toString(supplyUsed));
      JPanel panel4 = new JPanel();
      panel4.add(label4);
      rows.add(panel4);
      
   }
   
   private void buildRow8Panels(int cost)
   {
      JLabel label0 = new JLabel("Healer");
      JPanel panel0 = new JPanel();
      panel0.add(label0);
      rows.add(panel0);
      
      Integer[] levels = {1,2,3,4};
      JComboBox<Integer> unitLvl = new JComboBox<Integer>(levels);
      rows.add(unitLvl);
      
      JTextField amount = new JTextField(3);
      JPanel panel2 = new JPanel();
      panel2.add(amount);
      rows.add(panel2);
      
      JLabel label3 = new JLabel("Total Cost:");
      JPanel panel3 = new JPanel();
      panel3.add(label3);
      rows.add(panel3);
      
      JLabel label4 = new JLabel(Integer.toString(cost));
      JPanel panel4 = new JPanel();
      panel4.add(label4);
      rows.add(panel4);
      
   }
   
   private void buildRow9Panels()
   {
      JLabel label0 = new JLabel("Dragon");
      JPanel panel0 = new JPanel();
      panel0.add(label0);
      rows.add(panel0);
      
      Integer[] levels = {1,2,3,4};
      JComboBox<Integer> unitLvl = new JComboBox<Integer>(levels);
      rows.add(unitLvl);
      
      JTextField amount = new JTextField(3);
      JPanel panel2 = new JPanel();
      panel2.add(amount);
      rows.add(panel2);
      
      JLabel label3 = new JLabel("");
      JPanel panel3 = new JPanel();
      panel3.add(label3);
      rows.add(panel3);
      
      JLabel label4 = new JLabel("");
      JPanel panel4 = new JPanel();
      panel4.add(label4);
      rows.add(panel4);
      
   }
   
   private void buildRow10Panels()
   {
      JLabel label0 = new JLabel("Pekka");
      JPanel panel0 = new JPanel();
      panel0.add(label0);
      rows.add(panel0);
      
      Integer[] levels = {1,2,3,4,5};
      JComboBox<Integer> unitLvl = new JComboBox<Integer>(levels);
      rows.add(unitLvl);
      
      JTextField amount = new JTextField(3);
      JPanel panel2 = new JPanel();
      panel2.add(amount);
      rows.add(panel2);
      
      JButton button3 = new JButton("Calculate");
      button3.addActionListener(new CalcButtonListener());
      JPanel panel3 = new JPanel();
      panel3.add(button3);
      rows.add(panel3);
      
      
      JLabel label4 = new JLabel("");
      JPanel panel4 = new JPanel();
      panel4.add(label4);
      rows.add(panel4);
      
   }
   
   private void buildRow11Panels()
   {
      JLabel label0 = new JLabel("");
      JPanel panel0 = new JPanel();
      panel0.add(label0);
      rows.add(panel0);
      
      JLabel label1 = new JLabel("");
      JPanel panel1 = new JPanel();
      panel1.add(label1);
      rows.add(panel1);
      
      JLabel label2 = new JLabel("");
      JPanel panel2 = new JPanel();
      panel2.add(label2);
      rows.add(panel2);
      
      JLabel label3 = new JLabel("");
      JPanel panel3 = new JPanel();
      panel3.add(label3);
      rows.add(panel3);
      
      JLabel label4 = new JLabel("");
      JPanel panel4 = new JPanel();
      panel4.add(label4);
      rows.add(panel4);
      
   }
   
   public static void main(String[] args)
   {
      new Main();
   }
}
class CalcButtonListener implements ActionListener
{

   @SuppressWarnings("unchecked")
   @Override
   public void actionPerformed(ActionEvent e)
   {
      // number of units
      int[] uAmount = {0,0,0,0,0,0,0,0,0,0};
      int[] uLevel = {0,0,0,0,0,0,0,0,0,0};
      int unit = 0;
      ArrayList<Unit> uList = new ArrayList<Unit>();
      // retrieves the amount of units from the respective JPanel component
      while (unit < 10)
      {
         try {
            for (int i = unit; i < 10; i ++)
            {
               uAmount[i] = (int)Integer.parseInt(
                     ((JTextField)((JPanel)(Main.rows.get(7+(i*5)))).getComponent(0)).getText());
               unit++;
            }
         }
         catch (NumberFormatException e1)
         {
            uAmount[unit] = 0;
            unit++;
         }
      }
      
      /**
       * returning 1 for some reason instead of the value that is actually there
       * may need to use action listeners for these combo boxes
       */
      
      // debug
      //int test = 0;
      //test = (int) ((JComboBox<String>) (MainPanel.rows.get(0).get(1))).getSelectedItem();
      //System.out.println("Test:" + test);
      
      // retrieves the levels of the units from the respective JComboBox components
       for (int i = 0; i < 10; i ++)
      {
         uLevel[i] = (int) ((JComboBox<Integer>)(Main.rows.get(6+i*5))).getSelectedItem();
      }
      // create list of unit objects
      uList.add(new Barbarian(uLevel[0],uAmount[0]));
      uList.add(new Archer(uLevel[1],uAmount[1]));
      uList.add(new Goblin(uLevel[2],uAmount[2]));
      uList.add(new Giant(uLevel[3],uAmount[3]));
      uList.add(new WallBreaker(uLevel[4],uAmount[4]));
      uList.add(new Balloon(uLevel[5],uAmount[5]));
      uList.add(new Wizard(uLevel[6],uAmount[6]));
      uList.add(new Healer(uLevel[7],uAmount[7]));
      uList.add(new Dragon(uLevel[8],uAmount[8]));
      uList.add(new Pekka(uLevel[9],uAmount[9]));
      
      // find total cost
      int totCost = 0;
      for (Unit u : uList)
      {
         //System.out.println("Unit Cost:" + u.getTotCost());
         totCost += u.getTotCost();
      }
      
      // debugging
      //System.out.println(uLevel[0]);
      //System.out.println(uLevel[2]);
      //System.out.println(uLevel[9]);
      //System.out.println(uAmount[0]);
      //System.out.println(uAmount[2]);
      //System.out.println(uAmount[9]);
      
      // update gui
      ((JLabel)((JPanel)Main.rows.get(8*5+4)).getComponent(0)).setText(Integer.toString(totCost));
      ((JLabel)((JPanel)Main.rows.get(7*5+4)).getComponent(0)).setText(Integer.toString(Unit.totalSupply()));
      Unit.resetTotalSupply();
   }
}
