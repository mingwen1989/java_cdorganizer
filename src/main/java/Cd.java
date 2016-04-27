import java.util.ArrayList;

public class Cd{
  private String mCdName;
  private static ArrayList<Cd> mAllCds = new ArrayList<Cd>();

  public Cd(String cdName) {
    mCdName = cdName;
    mAllCds.add(this);
  }

  public String getTitle() {
    return mCdName;
  }

  public static ArrayList<Cd> all(){
    return mAllCds;
  }

  public static void clear() {
    mAllCds.clear();
  }
}
