public class Livro implements Publicacao{
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setTotPaginas(totPaginas);
        this.pagAtual = 0;
        this.aberto = false;
        this.setLeitor(leitor);
    }

    public String detalhes() {
        return "Livro{" +
                "\ntitulo= '" + titulo + '\'' +
                ", \nautor= '" + autor + '\'' +
                ", \ntotPaginas= " + totPaginas +
                ", \npagAtual= " + pagAtual +
                ", \naberto= " + aberto +
                ", \nleitor= " + leitor.getNome() + ", " + leitor.getIdade() + " anos, " + "do sexo " + leitor.getSexo() +
                '}' +
                "\n------------------------------------------------------------------------------------------------";
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear(int numPag) {
        if (numPag > this.getTotPaginas()) {
            this.setPagAtual(0);
        } else {
            this.setPagAtual(numPag);
        }

    }

    @Override
    public void avancarPag() {
        this.setPagAtual(getPagAtual() + 1);
    }

    @Override
    public void voltarPag() {
        this.setPagAtual(this.getPagAtual() - 1);
    }
}
