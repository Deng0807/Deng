package cn.zDing.ssm.service;

import cn.zDing.ssm.domain.Admin;
import cn.zDing.ssm.domain.ReaderCard;

public interface LoginService {
    boolean hasMatchReader(Integer id,String passwd);

    boolean hasMatchAdmin(Integer id,String passwd);

    String getAdminUsername(Integer id);

    ReaderCard findReaderCardByReaderId(Integer id);
}
