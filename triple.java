public class triple{
public int countTriple(String str) {
  int len = str.length();
  int count = 0;
  for (int i = 0; i < len-2; i++){
    char tmp = str.charAt(i);
    if (tmp == str.charAt(i+1) && tmp == str.charAt(i+2))
      count++;
  }
  System.out.println(count);
  return count;
}
public static void main(String args[]){
triple tr=new triple();
tr.countTriple("rrraabbbaiii");
}
}
