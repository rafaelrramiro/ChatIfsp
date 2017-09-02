package br.edu.ifspsaocarlos.sdm.chatifsp.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;

import java.io.Serializable;

import br.edu.ifspsaocarlos.sdm.chatifsp.Utils;

/**
 * Created by PedroGuilherme on 02/07/2017.
 */

@Entity
public class Contato implements Serializable {

    static final long serialVersionUID = 1L;

    @Id
    private Long id;

    private String nome_completo;

    private String apelido;

    @Generated(hash = 1448271076)
    public Contato() {
    }

    @Generated(hash = 1634916936)
    public Contato(Long id, String nome_completo, String apelido) {
        this.id = id;
        this.nome_completo = nome_completo;
        this.apelido = apelido;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome_completo() {
        return nome_completo;
    }

    public void setNome_completo(String nome_completo) {
        this.nome_completo = nome_completo;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }
}
