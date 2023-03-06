/**
 * java_task_6
 */
public class java_task_6 {
public static void main(String[] args) {
   my_hash_set test=new my_hash_set();
   test.add(20);
   test.add(-500);
   test.add(40);
   test.add(-600);
   test.add(50);
   test.add(-800);
   test.add(70);
   test.add(-5000);
   
   System.out.println(test.toString());
   System.out.println(test.read_for_index(5));
   test.print_hash_set();

}
    
}
