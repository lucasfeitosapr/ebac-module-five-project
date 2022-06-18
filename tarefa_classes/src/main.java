public class main {

    public static void main(String[] args) {
        Celula celula = new Celula();
        String dna = "ATCGAGTCAGTCAGTCGATG";

        System.out.println(celula.traducaoDnaParaMRna(dna));
        System.out.println(celula.conteudoDoNucleo());
        System.out.println(celula.funcaoMitocondria());
    }
}
