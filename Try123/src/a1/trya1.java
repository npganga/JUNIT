package a1;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class trya1 {
   @Test
   public void testSetup() {
      String str= "I am done with Junit setup";
      assertEquals("I am done with Junit setup",str);
   }
}