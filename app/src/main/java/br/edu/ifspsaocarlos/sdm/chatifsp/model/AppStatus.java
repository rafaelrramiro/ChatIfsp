package br.edu.ifspsaocarlos.sdm.chatifsp.model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by PedroGuilherme on 03/07/2017.
 */

public class AppStatus implements Serializable{

    private Contato contatoAtual;

    private List<Contato> contatoList;

    public AppStatus(Contato contatoAtual, List<Contato> contatoList) {
        this.contatoAtual = contatoAtual;
        this.contatoList = contatoList;
    }

    public Contato getContatoAtual() {
        return contatoAtual;
    }

    public void setContatoAtual(Contato contatoAtual) {
        this.contatoAtual = contatoAtual;
    }

    public List<Contato> getContatoList() {
        return contatoList;
    }

    public void setContatoList(List<Contato> contatoList) {
        this.contatoList = contatoList;
    }
}
