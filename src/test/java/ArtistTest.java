import org.junit.*;
import static org.junit.Assert.*;

public class ArtistTest {

  @Test
  public void artist_determinesTheArtist_String() {
    CdOrganizer newCd = new CdOrganizer("Thank Your Lucky Stars", "Beach House");
    Artist testArtist = new Artist(newCd);
    assertEquals("Beach House", testArtist.getArtist());
  }
}
