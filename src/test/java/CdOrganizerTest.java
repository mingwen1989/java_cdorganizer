import org.junit.*;
import static org.junit.Assert.*;

public class CdOrganizerTest {

  @Test
  public void CdOrganizer_instantiatesCorrectly_true() {
    CdOrganizer myCdOrganizer = new CdOrganizer("Thank Your Lucky Stars");
    assertEquals(true, myCdOrganizer instanceof CdOrganizer);
  }
  @Test
  public void CdOrganizer_returnsCdName_String() {
    CdOrganizer myCdOrganizer = new CdOrganizer("Thank Your Lucky Stars");
    assertEquals("Thank Your Lucky Stars", myCdOrganizer.getCdName());
  }

}
