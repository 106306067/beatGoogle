import java.io.IOException;
import java.util.ArrayList;

public class WebPage {
 public String url;
 public String name;
 public TypeCounter Tcounter;
 public WordCounter Wcounter;
 public double score;
 
 public WebPage(String url, String name) {
  this.url = url;
  this.name = name;
  this.Tcounter = new TypeCounter(url);
  this.Wcounter = new WordCounter(url);
 }
 
 public void setScore(ArrayList<Keyword> keywords) throws IOException {
  this.score = 0;
  
  for (Keyword k : keywords) {
   //權重要在這裡還是r的class的class
   this.score += Tcounter.countKeyword(k.name) + Wcounter.countKeyword(k.name);
  }
 }

}