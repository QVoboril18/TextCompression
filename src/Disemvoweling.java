public class Disemvoweling {

    public Disemvoweling(){

    }
    public String devowel(String a){
        char car = 'z';
        int length = a.length();
        for (int i = 0; i < length -1 ; i++) {
            car = a.charAt(i);
            switch (car) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u': a = a.substring(0, i).concat(a.substring(i+1, a.length())); length--;

            }

        }
        return a;
    }

    public static void main(String[] args) {
        Disemvoweling a = new Disemvoweling();
        String water = "Vape Nacho Yall";
       String wtr= a.devowel(water);
        System.out.println(wtr);
    }
}
