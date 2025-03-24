public class MinhaClasse{
    public static void main (String [] args) {
        String primeiroNome = "Yvens ";

        String segundoNome = "Souza";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.print(nomeCompleto);

    
    }

    public static String nomeCompleto ( String primeiroNome, String segundoNome) {
        return "Este é o Metodo " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
