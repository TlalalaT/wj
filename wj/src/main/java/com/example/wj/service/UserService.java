package com.example.wj.service;

import com.example.wj.pojo.User;
import com.example.wj.dao.UserDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

//对userDAO的二次封装，定义具体操作实现更加复杂的功能
@Service
public class UserService {
    @Autowired
    UserDAO userDAO;

    public boolean isExist(String username) {     //判断用户是否存在
        User user = getByName(username);
        return null!=user;
    }

    public User getByName(String username) {     //取得用户姓名
        return userDAO.findByUsername(username);
    }

    public User get(String username, String password){   //返回用户姓名、密码
        return userDAO.getByUsernameAndPassword(username, password);
    }

    public void add(User user) {                  //增加用户
        userDAO.save(user);
    }

    public User findByUsername(String username) {
        return userDAO.findByUsername(username);
    }
}
