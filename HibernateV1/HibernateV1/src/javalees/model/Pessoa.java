package javalees.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
 
/**
 * @author Paulo Luan
 *
 *         http://javafxbr.com/blog
 *
 *         Esta classe contém as "Annotations" do JPA que permite que o
 *         hibernate saiba quais tabelas serão criadas no Banco de dados, bem
 *         como o que representa cada um destes parâmetros,
 *
 *         Olhe que interessante! na diretiva columnDefinition podemos definir o
 *         tamanho do atributo no Banco de Dados! pode conferir, após a execução
 *         do nosso aplicativo será criado uma tabela com as definições que
 *         colocamos aqui <img src="http://javafxbr.com/blog/wp-includes/images/smilies/icon_wink.gif" alt=";)" class="wp-smiley"> 
 *
 */
 
@Entity
@Table(name = "Pessoa")
public class Pessoa {
 
    private int id;
    private String nome;
    private int idade;
 
    @Id
    @GeneratedValue
    @Column(name = "id", columnDefinition = "INTEGER(20)")
    public int getId() {
        return id;
    }
 
    public void setId(int id) {
        this.id = id;
    }
 
    @Column(name = "nome", nullable = false, columnDefinition = "VARCHAR(200)")
    public String getNome() {
        return nome;
    }
 
    public void setNome(String nome) {
        this.nome = nome;
    }
 
    @Column(name = "idade", columnDefinition = "INTEGER(10)")
    public int getIdade() {
        return idade;
    }
 
    public void setIdade(int idade) {
        this.idade = idade;
    }
 
}