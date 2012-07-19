package javalees.testes;

import java.util.List;

import javalees.hibernate.HibernateUtil;
import javalees.model.Pessoa;
import javalees.model.dao.PessoaDAO;

/**
 * @author Paulo Luan
 * 
 *         http://javafxbr.com/blog
 * 
 *         Classe Main para instanciar e testar a inserção, exclusão e todas as
 *         demais funcionalidades de nosso pequeno sistema
 */
public class Main {

	public static void main(String[] args) {
		new HibernateUtil().criaTabelaNoBD(); // cria as tabelas no BD!

		/* instancia um novo objeto pessoa que será inserido no Banco de dados */
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("Paulo Luan");
		pessoa1.setIdade(21);

		/*
		 * cria um novo DAO para fazermos as operações de persistência de
		 * maneira simples e transparente
		 */
		PessoaDAO dao = new PessoaDAO();
		dao.SalvarPessoa(pessoa1);

		// dao.DeletarPessoa(1);

		/* pega a lista de usuários no BD */
		List<Pessoa> pessoas = (List<Pessoa>) dao.getPessoas();

		/* imprime no console a lista de pessoas cadastradas */
		System.out.println("Pessoas Cadastradas no BD: ");
		for (Pessoa pessoa : pessoas) {
			System.out.println(" Id:" + pessoa.getId() + " Nome: "
					+ pessoa.getNome() + " Idade: " + pessoa.getIdade());
		}

	}

}