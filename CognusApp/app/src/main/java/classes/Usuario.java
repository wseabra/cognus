package classes;

/**
 * Created by victoria on 19/06/17.
 */

public class Usuario {
    private int id;
    private String nome;
    private String email;
    private String senha;
    private int num_seguidores;

    public Usuario(String nome, String email, String senha, int num_seguidores) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.num_seguidores = num_seguidores;
        this.id = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getNum_seguidores() {
        return num_seguidores;
    }

    public void setNum_seguidores(int num_seguidores) {
        this.num_seguidores = num_seguidores;
    }
}