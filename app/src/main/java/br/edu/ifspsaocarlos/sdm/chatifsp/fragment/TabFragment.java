package br.edu.ifspsaocarlos.sdm.chatifsp.fragment;

import br.edu.ifspsaocarlos.sdm.chatifsp.model.AppStatus;
import br.edu.ifspsaocarlos.sdm.chatifsp.model.Contato;

/**
 * Created by PedroGuilherme on 04/07/2017.
 */

public interface TabFragment {

    public void addContato(Contato contato);

    public void updateView(AppStatus appStatus);

}
