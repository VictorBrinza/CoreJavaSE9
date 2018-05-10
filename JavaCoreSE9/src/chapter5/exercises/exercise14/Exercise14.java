
package chapter5.exercises.exercise14;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Exercise14 {
    private static final Logger logger = Logger.getLogger(Exercise14.class.getName());
 
   public static void main(String[] args) {
      String records[]={"java","impatient","c++"};
      logger.info("Logging begins...");   // log INFO-level message
      try {
          for(String s:records){
         if(s.equals("sex")||s.equals("drogs")||s.equals("c++")){
         throw new Exception("Bad word "+s);
         }
          }
      } catch (Exception ex){
         logger.log(Level.SEVERE, ex.getMessage(), ex);
      }
      logger.info("Done...");
   }
}
