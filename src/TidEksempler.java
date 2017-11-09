public class TidEksempler {
    public static void main(String[] args) {
        //Printer sekunder der er gået siden 1.jan. 1970.
        long timeSek = System.currentTimeMillis()/1000;
        System.out.println(timeSek);
    }
}
