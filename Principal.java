import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        ArrayAluno alunos = new ArrayAluno();
        int opcao;
        
        do {
            
            String selecionaOpcao = JOptionPane.showInputDialog(null, montaMenu());            
            
            opcao = Integer.parseInt(selecionaOpcao);
            
            switch (opcao) {
                case 1 -> { 
                    // cadastrar aluno
                    String rgm = JOptionPane.showInputDialog("Digite o RGM do aluno:");
                    String nome = JOptionPane.showInputDialog("Digite o nome do aluno:");
                    float notaParcial = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota parcial do aluno:"));
                    float notaReg = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota regimental do aluno:"));

                    Aluno aluno = new Aluno(rgm, nome, notaParcial, notaReg);
                    alunos.inserir(aluno);
                    JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso!");
                }
                case 2 -> {
                    // pesquisar aluno
                    String rgm = JOptionPane.showInputDialog("Digite o RGM do aluno para pesquisar:");
                    Aluno aluno = alunos.seleciona(rgm);
                    aluno.print();
                }
                case 3 -> { 
                    // listar alunos
                    for (Aluno aluno : alunos.selecionaTodos()) {
                        aluno.print();
                    }
                }
                case 4 -> { 
                   // dados do projeto
                   JOptionPane.showMessageDialog(null,"Dados do Projeto:\nv0.0.1\nAlunos: Fulano, RGM: 123456789");
                }
                case 5 -> {
                    return; // sair
                }
                default -> JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
            
        } while (opcao != 5);
    }

    private static String montaMenu(){
        return "Menu"
               +"\n1 - Cadastrar aluno"
               +"\n2 - Pesquisar aluno"
               +"\n3 - Listar todos os alunos"
               +"\n4 - Dados do projeto"
               +"\n5 - Sair"
               +"\n\nDigite a opção desejada:";
    }
}
