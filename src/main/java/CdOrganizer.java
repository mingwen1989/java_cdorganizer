public class CdOrganizer{
  private String mCdName;
  private String mArtistName;

  public CdOrganizer(String cdName, String artistName) {
    mCdName = cdName;
    mArtistName = artistName;
  }

  public String getCdName() {
    return mCdName;
  }

  public String getArtist() {
    return mArtistName;
  }

}
