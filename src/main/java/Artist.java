public class Artist {
  private CdOrganizer mArtistName;

  public Artist(CdOrganizer artistName) {
    mArtistName = artistName;
  }

  public String getArtist() {
    String name = mArtistName.getArtist();
    return name;
  }
}
