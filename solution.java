public class solution{
public int sumDigits(String str) {

    StringBuilder strAppend = new StringBuilder();

    for (int i = 0; i < str.length(); i++) {
        if (Character.isDigit(str.charAt(i))) {
            strAppend.append(str.charAt(i));
        }
    }

    int total = 0;
    String strDigits = strAppend.toString();

    for (int i = 0; i < strDigits.length(); i++) {
        total += Integer.parseInt(strDigits.substring(i, i+1));
    }
    System.out.println(total);

    return total;

}
public static void main(String args[0]){
solution sd=new solution();
sd.sumDigits("aa11nn33");
}
}
