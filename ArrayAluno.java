import java.util.List;
import java.util.ArrayList;

public class ArrayAluno implements Interface {
    
    private List<Aluno> alunos;
    
    public ArrayAluno() {
        this.alunos = new ArrayList<>();
    }
    
    @Override
    public boolean inserir(Aluno p) {
        return this.alunos.add(p);
    }
    
    @Override
     public Aluno seleciona(String rgm) {
        for (Aluno aluno : this.alunos) {
            if (aluno.getRgm().equals(rgm)) {
                return aluno;
            }
        }
        return new Aluno();
    }
     
    @Override
    public List<Aluno> selecionaTodos() {
        return this.alunos;
    }
}
