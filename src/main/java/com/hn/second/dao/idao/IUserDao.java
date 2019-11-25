package com.hn.second.dao.idao;

import com.hn.second.ResResult;
import com.hn.second.dao.pojo.User;

public interface IUserDao {
    ResResult<User> login(String username, String password)throws Exception;
}
