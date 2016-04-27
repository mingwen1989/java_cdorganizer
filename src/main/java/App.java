import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      String cdName = request.queryParams("cdName");
      String artistName = request.queryParams("artistName");
      if (artistName != null) {
              Cd newCd = new Cd(cdName);
              boolean duplicateArtist = false;
              for (Artist singer : Artist.all()) {
                if (artistName.equals(singer.getArtist())){
                  singer.addTitle(newCd);
                  duplicateArtist = true;
                }
              }
              if (duplicateArtist == false) {
                Artist newArtist = new Artist(artistName);
                newArtist.addTitle(newCd);
              }
            }

            String chosenArtist = request.queryParams("chooseArtist");
            if (chosenArtist != null) {
              for (Artist singer : Artist.all()) {
                if (chosenArtist.equals(singer.getArtist())){
                  Artist thisArtist = singer;
                  model.put("thisArtist", thisArtist);
                }
              }
              model.put("testArtist", chosenArtist);
            }

            model.put("allArtists", Artist.all());
      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }
}
