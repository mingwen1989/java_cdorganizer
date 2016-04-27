import org.junit.*;
import static org.junit.Assert.*;

public class CdTest {
  @Rule
  public ClearRule clearRule = new ClearRule();
  
  @Test
  public void Cd_InstantiatesCorrectly_true() {
    Cd myCdOrganizer = new Cd("Thank Your Lucky Stars");
    assertEquals(true, myCdOrganizer instanceof Cd);
  }
  // @Test
  // public void CdOrganizer_returnsCdName_String() {
  //   CdOrganizer myCdOrganizer = new CdOrganizer("Thank Your Lucky Stars", "Beach House");
  //   assertEquals("Thank Your Lucky Stars", myCdOrganizer.getCdName());
  // }
  // @Test
  // public void artist_determinesTheArtist_String() {
  //   CdOrganizer newCd = new CdOrganizer("Thank Your Lucky Stars", "Beach House");
  //   Artist testArtist = new Artist(newCd);
  //   assertEquals("Beach House", testArtist.getArtist());
  // }

}
