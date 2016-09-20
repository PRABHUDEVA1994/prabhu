public class Block {
public int maxBlock(String str) {
  int len = str.length();
  int count = 0;
  int tmpcount = 1;
  if (len == 0)
    return 0;
  for (int i = 0; i < len; i++) {
    if (i < len-1 && str.charAt(i) == str.charAt(i+1))
      tmpcount++;
    else
      tmpcount = 1;
    if (tmpcount > count)
      count = tmpcount;
  }
  System.out.println(count);
  return count;
}
public static void main(String args[]){
Block b1=new Block();
b1.maxBlock("aajsdhhhhsd");
}
}
