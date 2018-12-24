import java.util.ArrayList;

public class Keyword {
	public String name;
	public int count;
	public String type;
	
	public Keyword(String name, int count, String type) {
		this.name = name;
		this.count = count;
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "Keyword [name = " + name + ", count = " + count +", type = " + type + "]";
	}
	
	public ArrayList<Keyword> KeywordList;
	public void add(Keyword keyword) {
		this.KeywordList.add(keyword);
	}
}
