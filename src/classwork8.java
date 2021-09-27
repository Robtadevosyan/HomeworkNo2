public class classwork8 {
    public static void main(String[] args) {
        char[] charArr = {'H', 'e', 'l', 'l', 'o'};
        String str = new String(charArr, 1, 3);
        byte[] byteArr = {97, 98, 99};
        String byteString = new String(byteArr, 1, 2);

        StringBuilder strBuilder = new StringBuilder("abc");
        strBuilder.append(34);
        strBuilder.append("bc");

        String result = strBuilder.toString();
        StringBuilder stringBuilder = new StringBuilder("bcd");
        System.out.println("StringBuilder value: " + strBuilder);
        System.out.println("char At 2 : " + strBuilder.charAt(2));
        System.out.println("char of c: " + strBuilder.indexOf("bc"));
        System.out.println("last index of bc: " + strBuilder.lastIndexOf("bc"));
        System.out.println("start with : " + result.startsWith("ab"));
        String subStr = result.substring(1, 6);
        System.out.println("Substring : " + subStr);
        StringBuilder reverseString = new StringBuilder(subStr);
        reverseString = reverseString.reverse();
        System.out.println("SubString : " );
    }
}
