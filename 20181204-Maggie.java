//Past Paper 2015
//main idea: String, class
public class HiddenWord{
  private puzzle;
  public HiddenWord(String s){
    puzzle = s;
  }
  public String getHint(String guess){
  String tmp = "";
    for(int i = 0; i < guess.length(); i++){
      if(guess.substring(i, i+1).equals(puzzle.substring(i, i+1))
      {
        tmp += guess.substring(i, i+1);
      }
      else if(puzzle.indexOf(s.substring(i, i+1)) == -1)
      {
        tmp += "*";
      }
      else
      {
        tmp += "+";
      }
    }
    return tmp;
}
         }
