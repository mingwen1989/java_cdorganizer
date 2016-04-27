import org.junit.*;
import static org.junit.Assert.*;

public class CdOrganizerTest {

  @Test
  public void CdOrganizer_instantiatesCorrectly_true() {
    CdOrganizer myCdOrganizer = new CdOrganizer("Thank Your Lucky Stars", "Beach House");
    assertEquals(true, myCdOrganizer instanceof CdOrganizer);
  }
  @Test
  public void CdOrganizer_returnsCdName_String() {
    CdOrganizer myCdOrganizer = new CdOrganizer("Thank Your Lucky Stars", "Beach House");
    assertEquals("Thank Your Lucky Stars", myCdOrganizer.getCdName());
  }
  @Test
  public void artist_determinesTheArtist_String() {
    CdOrganizer newCd = new CdOrganizer("Thank Your Lucky Stars", "Beach House");
    Artist testArtist = new Artist(newCd);
    assertEquals("Beach House", testArtist.getArtist());
  }

}
