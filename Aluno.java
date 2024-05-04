/**
 *
 * @author flavio
 */
public class Aluno {
    
    private String rgm;
    private String nome;
    private float notaParcial;
    private float notaReg;
    
    public Aluno() {}
    
     public Aluno(String rgm, String nome, float notaParcial, float notaReg) {
        this.rgm = rgm;
        this.nome = nome;
        this.notaParcial = notaParcial;
        this.notaReg = notaReg;
    }
    
    public String getRgm() {
        return rgm;
    }
    
    public void setRgm(String rgm) {
        this.rgm = rgm;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public float getNotaParcial() {
        return notaParcial; 
    }
    
    public void setNotaParcial(float notaParcial) {
        this.notaParcial = notaParcial;
    }
    
    public float getNotaReg() {
        return notaReg; 
    }
    
    public void setNotaRegl(float notaReg) {
        this.notaReg = notaReg;
    }
    
    public void print() {
        System.out.println("RGM: " + rgm);
        System.out.println("Nome: " + nome);
        System.out.println("Nota Parcial: " + notaParcial);
        System.out.println("Nota Regimental: " + notaReg);
        
        float media = (notaParcial + notaReg) / 2;
        System.out.println("Média: "+ media);
   
        if (media >= 6) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Avaliação Final");
        }
    }
}
