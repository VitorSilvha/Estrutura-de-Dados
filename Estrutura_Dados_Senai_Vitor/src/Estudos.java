
public class Estudos extends Aluno {
	
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.nome = "JOÃO";
		aluno.setIdade(34);
		aluno.matricula = "09283421";
		
		System.out.println("Nome: " + aluno.nome + "\n" + 
		"Idade: " + aluno.getIdade() + "\n" + 
		"Matricula: " + aluno.matricula);
		
	}

}
