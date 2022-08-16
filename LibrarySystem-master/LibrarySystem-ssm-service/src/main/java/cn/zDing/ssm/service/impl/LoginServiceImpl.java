package cn.zDing.ssm.service.impl;

import cn.zDing.ssm.dao.LoginDao;
import cn.zDing.ssm.domain.Admin;
import cn.zDing.ssm.domain.ReaderCard;
import cn.zDing.ssm.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("loginService")
@Transactional
public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginDao loginDao;


    @Override
    public boolean hasMatchReader(Integer id,String passwd) {
        ReaderCard rc = loginDao.hasMatchReader(id, passwd);
        if(rc != null){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean hasMatchAdmin(Integer id,String passwd) {
        Admin admin = loginDao.hasMatchAdmin(id, passwd);
        if(admin != null){
            return true;
        }else{
         return false;
        }
    }

    @Override
    public String getAdminUsername(Integer id) {
        return loginDao.getAdminUsername(id);
    }

    @Override
    public ReaderCard findReaderCardByReaderId(Integer id) {
        return loginDao.findReaderCardByReaderId(id);
    }
}
