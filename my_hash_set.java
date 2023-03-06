
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class my_hash_set {

   HashMap<Integer,Integer> value=new HashMap<>();
   
  void add (int element){
    value.put(element, value.size());
  }
  @Override
  public String toString() {
      StringBuilder string_key=new StringBuilder();
      for(HashMap.Entry<Integer, Integer> entry: value.entrySet()) {
        string_key.append(Integer.toString(entry.getKey()));
        string_key.append(", ");
               
     }
      String str=string_key.toString();
      str=str.substring(0, str.length()-2);
      return str;
  }
  public Integer read_for_index(Integer Index){
    Integer element=null;
    Integer Find_index_element;
    if(Index>=0){
        Find_index_element=Index;
    }
    else{
        Find_index_element=value.size()+Index;
    }
    if(Find_index_element<value.size()&&Find_index_element>=0){
        for(HashMap.Entry<Integer, Integer> entry: value.entrySet()) {
            if(entry.getValue()==Find_index_element){
                element=entry.getKey();
            }
        }
  }
  else{
    System.out.println("Неверный индекс. такого элемента нет");
  }
  return element;
}
 void print_hash_set(){
    List<HashMap.Entry<Integer, Integer>> entryList = new ArrayList<>(value.entrySet());
    System.out.println(entryList);
 }
}