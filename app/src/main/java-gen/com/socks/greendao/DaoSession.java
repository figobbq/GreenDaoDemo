package com.socks.greendao;

import android.database.sqlite.SQLiteDatabase;

import java.util.Map;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import de.greenrobot.dao.internal.DaoConfig;

import com.socks.greendao.StaffTable;

import com.socks.greendao.StaffTableDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see de.greenrobot.dao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig staffTableDaoConfig;

    private final StaffTableDao staffTableDao;

    public DaoSession(SQLiteDatabase db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        staffTableDaoConfig = daoConfigMap.get(StaffTableDao.class).clone();
        staffTableDaoConfig.initIdentityScope(type);

        staffTableDao = new StaffTableDao(staffTableDaoConfig, this);

        registerDao(StaffTable.class, staffTableDao);
    }
    
    public void clear() {
        staffTableDaoConfig.getIdentityScope().clear();
    }

    public StaffTableDao getStaffTableDao() {
        return staffTableDao;
    }

}
