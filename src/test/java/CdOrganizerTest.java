import org.junit.*;
import static org.junit.Assert.*;

public class CdOrganizerTest {

  @Test
  public void CdOrganizer_instantiatesCorrectly_true() {
    CdOrganizer myCdOrganizer = new CdOrganizer("Thank Your Lucky Stars");
    assertEquals(true, myCdOrganizer instanceof CdOrganizer);
  }
  // @Test
  // public void Place_instantiatesWithDescription_String() {
  //   Place myPlace = new Place("Paris");
  //   assertEquals("Paris", myPlace.getLocation());
  // }

}
