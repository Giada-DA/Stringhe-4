
public class Start {
    public static void main(String[] args) {
        String a = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
        System.out.println(a.replace("um","HUM"));
        System.out.println("----------------------------------------------------------------------------------");
        int prima = a.indexOf("aliquip");   //199
        String sub1 = a.substring(0,206);
        System.out.println(sub1);   //stampa fino a aliquip
        int dopo = a.length();   //445
        String sub2 = a.substring(207, dopo);
        System.out.println(sub2);   //riprende la frase e va fino in fondo
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println(sub1.replaceAll("\\s",""));   //spazi attaccati
        System.out.println(sub2.replaceAll("\\s",""));   //spazi attaccati
        System.out.println("----------------------------------------------------------------------------------");
        /*System.out.println(sub1.indexOf("est"));   //risultato -1, non è presente est in questo pezzo di frase
        System.out.println(sub2.indexOf("est"));   //risultato 226, posizione in cui si trova*/
        System.out.println(sub1.contains("est")^sub2.contains("est"));   //true

    }
}
