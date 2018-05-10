
package chapter5.exercises.exercise15;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.logging.XMLFormatter;


public class Exercise15 {
     private static final Logger logger = Logger.getLogger(Exercise15.class.getName());
 
   public static void main(String[] args) throws IOException {
      // Construct a default FileHandler.
      Handler fh = new FileHandler("test.html", true);  // append is true
      fh.setFormatter(new SimpleFormatter());  // Set the log format
      // Add the FileHander to the logger.
      logger.addHandler(fh);
      // Set the logger level to produce logs at this level and above.
      logger.setLevel(Level.FINE);
 
      // Redirecting System.out and System.err
      PrintStream outPS =
      new PrintStream(
         new BufferedOutputStream(
            new FileOutputStream("test.log", true)));  // append is true
      System.setErr(outPS);    // redirect System.err
      System.setOut(outPS);
 
      try {
         // Simulating Exceptions
         throw new Exception("Simulating an exception");
      } catch (Exception ex){
         logger.log(Level.SEVERE, ex.getMessage(), ex);
      }
      logger.info("This is a info-level message");
      logger.config("This is a config-level message");
      logger.fine("This is a fine-level message");
      logger.finer("This is a finer-level message");
      logger.finest("This is a finest-level message");

   }
}
