public class Lutador implements UFC {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(String no, int id, String na,float pe, int vi, int de, int emp){
        this.setNome(no);
        this.setIdade(id);
        this.setNacionalidade(na);
        this.setPeso(pe);
        this.setVitorias(vi);
        this.setDerrotas(de);
        this.setEmpates(emp);
    }

    private void setNome(String name){
        this.nome = name;
    }

    public String getNome(){
        return this.nome;
    }

    private void setNacionalidade(String nacio){
        this.nacionalidade = nacio;
    }

    private String getNacionalidade(){
        return this.nacionalidade;
    }

    private void setIdade(int i){
        this.idade = i;
    }

    private int getIdade(){
        return this.idade;
    }

    private void setPeso(float pe){
        this.peso = pe;
        this.setCategoria(); //categoria muda qnd o peso muda (automaticamente)

    }

    private float getPeso(){
        return this.peso;
    }

    private void setCategoria(){
        if(this.getPeso() <= 52)
            this.categoria = "Inválido";
        else if(this.getPeso() <= 70)
            this.categoria = "Leve";
        else if(this.getPeso() <= 80)
            this.categoria = "Médio";
        else if(this.getPeso() <= 100)
            this.categoria = "Pesado";
        else
            this.categoria = "Inválido";

    }

    public String getCategoria(){
        return this.categoria;
    }

    private void setVitorias(int v){
        this.vitorias = v;
    }

    private int getVitorias(){
        return this.vitorias;
    }

    private void setDerrotas(int d){
        this.derrotas = d;
    }

    private int getDerrotas(){
        return this.derrotas;
    }

    private void setEmpates(int e){
        this.empates = e;
    }

    private int getEmpates(){
        return this.empates;
    }

    @Override
    public void apresentar() {
        System.out.println("----------------------------");
        System.out.println("NOME: " + this.getNome());
        System.out.println("ORIGEM: " + this.getNacionalidade());
        System.out.println("IDADE: " + this.getIdade());
        System.out.println("PESO: " + this.getPeso());
        System.out.println("CATEGORIA: " + this.getCategoria());
        System.out.println("VITORIAS: " + this.getVitorias());
        System.out.println("DERROTAS: " + this.getDerrotas());
        System.out.println("EMPATES: " + this.getEmpates());
        System.out.println("----------------------------");
    }

    @Override
    public void status() {
        System.out.printf(getNome());
        System.out.printf(" é um peso " + getCategoria() + ",");
        System.out.printf(" com " + getVitorias() + " vitorias");
        System.out.printf(", " + getDerrotas() + " derrotas");
        System.out.printf(" e " + getEmpates() + " empates");
    }

    @Override
    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }

    @Override
    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }

    @Override
    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }
}
