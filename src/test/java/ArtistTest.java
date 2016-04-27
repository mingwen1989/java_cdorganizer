import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class ArtistTest {
  @Rule
  public ClearRule clearRule = new ClearRule();

  @Test
  public void Artist_InstantiatesCorrectly_true() {
    Artist testArtist = new Artist("Beach House");
    assertEquals(true, testArtist instanceof Artist);
  }
}
