public class Celula {

    private String dna;
    private String mRna;
    private String tRna;
    private String rRna;
    private String complexoDeGolgi;
    private String nucleo;
    private String membranaCelular;
    private String mitocondria;


    /**
     * Responsável por traduzir uma sequência de DNA para RNA.
     * @param dna a sequência de dna a ser traduzida
     * @return sequência de RNA.
     */
    public String traducaoDnaParaMRna(String dna) {
        String mRna = "";
        for(char nucleotideo: dna.toUpperCase().toCharArray()) {
            if(nucleotideo == 'A') {
                mRna += 'U';
            } else if (nucleotideo == 'T') {
                mRna += 'A';
            } else if (nucleotideo == 'G') {
                mRna += 'C';
            } else {
                mRna += 'G';
            }
        }

        return mRna;
    }

    /**
     * Função simples que indica o conteúdo do núcleo celular.
     * @return o que encontramos no núcleo celular.
     */
    public String conteudoDoNucleo() {
        return "DNA";
    }

    /**
     * Função simples que descreve a função da mitocôndria.
     * @return função da mitocôndria.
     */
    public String funcaoMitocondria() {
        return "Produção de energia para a célula";
    }
}
