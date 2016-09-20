public class evenly{
public boolean evenlySpaced(int a, int b, int c) {
int diff1 = 0;
int diff2 = 0;
int diff3 = 0;
if(a==b && a ==c)
return true;
if(a == b || b == c || a == c)
return false;
diff1 = Math.abs(a - b);
diff2 = Math.abs(a - c);
diff3 = Math.abs(b - c);
if(diff1 == diff2)
return true;
if(diff1 == diff3)
return true;
if(diff2 == diff3)
return true;
return false;
}
public static void main(String args[]){
evenly ev=new evenly();
if(ev.evenlySpaced(2,4,6))
System.out.println("true");
else
System.out.println("false");
if(ev.evenlySpaced(4,6,2))
System.out.println("true");
else
System.out.println("false");
}
}
