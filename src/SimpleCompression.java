
public class SimpleCompression {

    public SimpleCompression(){

    }
    public String Compress(String a){
        String compressed= "";
        int length = a.length();
        int num= 0;
        char target = a.charAt(0);
        System.out.println(length);
        for (int i = 0; i <= length - 1; i++) {
            if (i == (length - 1)){
                if (Character.toString(a.charAt(i)).compareTo(Character.toString(target))!=0){
                    num = 0;
                    target = a.charAt(i);
                }
                num++;
                compressed += (Character.toString(target) + (Integer.toString(num)));
            }
           if (Character.toString(a.charAt(i)).compareTo(Character.toString(target))==0){
               num++;
           }else{
               compressed += (Character.toString(target) + (Integer.toString(num)));
               num = 1;
               target = a.charAt(i);
           }
        }
        return compressed;
    }

    public static void main(String[] args) {
        SimpleCompression a = new SimpleCompression();
        System.out.println(a.Compress("bbbuuuuppx"));
    }
}
