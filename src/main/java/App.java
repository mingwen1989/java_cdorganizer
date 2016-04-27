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
      model.put("organizer", request.session().attribute("organizer"));
      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/organizer", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();

      ArrayList<CdOrganizer> organizer = request.session().attribute("organizer");
      if (organizer == null) {
        organizer = new ArrayList<CdOrganizer>();
        request.session().attribute("organizer", organizer);
      }

      String cdName = request.queryParams("cdName");
      String artistName = request.queryParams("artistName");
      
      CdOrganizer newCdOrganizer = new CdOrganizer(cdName, artistName);
      organizer.add(newCdOrganizer);

      model.put("template", "templates/success.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }
}
