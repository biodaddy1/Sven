public class Main {

    public static void main(String[] args) {

        /* Liste<String> liste = new DobbeltLenketListe<>();
        System.out.println(liste.antall() + " "+ liste.tom());

        String[] s = {"Ole", null, "Per", "Kari", null};
        Liste<String> liste = new DobbeltLenketListe<>(s);
        System.out.println(liste.antall() + " "+ liste.tom());*/

        String[] s1 = {}, s2 = {"A"}, s3 = {null,"A",null,"B",null};
        DobbeltLenketListe<String> l1 = new DobbeltLenketListe<>(s1);
        DobbeltLenketListe<String> l2 = new DobbeltLenketListe<>(s2);
        DobbeltLenketListe<String> l3 = new DobbeltLenketListe<>(s3);

        System.out.println(l1.toString() + ""+ l2.toString()
                + ""+ l3.toString() + ""+ l1.omvendtString()
                + ""+ l2.omvendtString() + ""
                + l3.omvendtString());
    }
}
