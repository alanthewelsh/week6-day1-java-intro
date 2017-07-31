import static org.junit.Assert.assertEquals;
import org.junit.*;

public class BearTest {

  Bear bear;

  @Before
  public void before(){
    bear = new Bear("Baloo", 25, 95.62);
  }

  @Test
  public void hasName(){
    assertEquals("Baloo", bear.getName());
  }

  @Test
  public void hasAge(){
    assertEquals(25, bear.getAge());
  }

  @Test
  public void hasWeight(){
    assertEquals(95.62, bear.getWeight(), 0.01);
  }
  @Test
  public void readyToHibernateIfGreaterThan80 (){
    assertEquals(true, bear.readyToHibernate());
  }
  @Test
  public void notReadyToHibernateIfLessThan80 (){
    Bear thinBear = new Bear ("Shiela", 30, 20.05);
    assertEquals(false, thinBear.readyToHibernate());
  }
  @Test
  public void bellyStartsEmpty(){
    assertEquals(0, bear.foodCount());
  }
  @Test
  public void canEatSalmon(){
    bear.eat(salmon);
    assertEquals(1, bear.foodCount());
  }
  @Test
  public void cannotEatSalmonWhenBellyFull(){
    for (int i = 0; i < 10; i++ ) {
      bear.eat(salmon);
    }
    assertEquals(5, bear.foodCount());
  }
  @Test
  public void shouldEmptyBellyAferSleeping(){
    bear.eat(salmon);
    bear.sleep();
    assertEquals(0, bear.foodCount());
  }
}
