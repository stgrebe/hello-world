package myJava;

import junit.framework.*;

public class MoneyTest extends TestCase {
  private Money f12EUR;
  private Money f14EUR;

  protected void setUp() {
    this.f12EUR = new Money(12, "EUR");
    this.f14EUR = new Money(14, "EUR");
  } 
    
  public void testSimpleAdd() {
    Money expected = new Money(26, "EUR");
    Money result = this.f12EUR.add(this.f14EUR);
      
    Assert.assertTrue(expected.equals(result));
  } 

  public void testEquals() {
    Assert.assertTrue(!this.f12EUR.equals(null));
    Assert.assertEquals(this.f12EUR, this.f12EUR);
    Assert.assertEquals(this.f12EUR, new Money(12, "EUR"));
    Assert.assertTrue(!this.f12EUR.equals(this.f14EUR));
  }
  
  public static void main(String[] args) {
	  junit.swingui.TestRunner.run(MoneyTest.class);
}
  
}