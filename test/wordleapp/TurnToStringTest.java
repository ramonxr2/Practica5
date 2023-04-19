package wordleapp;

import org.junit.Test;
import static org.junit.Assert.*;


public class TurnToStringTest {
  
  @Test
  public void testObjString() {
    TurnToString turnToString = new TurnToString();
    
    char[] objCharArray1 = {'h', 'e', 'l', 'l', 'o'};
    assertEquals("hello", turnToString.objString(objCharArray1));
    
    char[] objCharArray4 = {'1', '2', '3', '4', '5'};
    assertEquals("12345", turnToString.objString(objCharArray4));
  }
}


