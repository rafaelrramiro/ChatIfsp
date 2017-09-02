package br.edu.ifspsaocarlos.sdm.chatifsp;

import android.app.Application;

import org.greenrobot.greendao.database.Database;

import br.edu.ifspsaocarlos.sdm.chatifsp.model.DaoMaster;
import br.edu.ifspsaocarlos.sdm.chatifsp.model.DaoSession;

/**
 * Created by PedroGuilherme on 02/07/2017.
 */

public class App  extends Application {

    private DaoSession daoSession;

    @Override
    public void onCreate() {
        super.onCreate();

        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(this, "chatifsp-db");
        Database db =  helper.getWritableDb();
        daoSession = new DaoMaster(db).newSession();
    }

    public DaoSession getDaoSession() {
        return daoSession;
    }
}
