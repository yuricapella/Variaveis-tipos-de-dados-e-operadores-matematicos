package tiposdedados;

public class exemplostiposdedados {

    public static void main(String[] args){

        byte b1 = 10;
        byte b2 = 20;

        short s1 = 20000;
        //short s2 = 40000; está passando muito do limite.

        //int i1 = -10000000000; está passando muito do limite.
        int i2 = 28500;

        long l1 = 1000000000000000000L;
        long l2 = 2004005000500055000L;

        //float f1 = 4.5; pensa que é o double.
        float f2 = 10.68F;

        double d1 = 85.69;
        double d2 = 99.84D;

        char c1 = 'w';
      //  char c2 = 'Tw'; só pode colocar 1 caractere
        char c3 = '\u0057'; //valor unicode, equivale a letra W, logo pode usar...


        String st1 = "Fulano";
        String st2 = "Cicrano";
        String st3 = "ag dgb se  se et t KNBJBJBB &* CARACTERE ESPECIAL";

        //String dt1 = "09/02/1981"; //nao é recomendado já que existe
        // um tipo de dado especifico para datas e
        // esta string seria dificil para fazer algum tipo de operação visto
        // que é um texto


        boolean bo1 = true;
        boolean bo2 = false;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(s1);
        System.out.println(i2);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(f2);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(c1);
        System.out.println(c3);
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
        System.out.println(bo1);
        System.out.println(bo2);
    }
}
