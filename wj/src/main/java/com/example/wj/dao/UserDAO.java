package com.example.wj.dao;
import com.example.wj.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//实现数据库增删改查操作，利用JPA实现数据永久实体化
//定义基础的增删改查
public interface UserDAO extends JpaRepository<User,Integer>{
    List<User> findAllByUsername(String username);
    List<User> getAllByUsernameAndAndPassword(String username,String password);
    User findByUsername(String username);

    User getByUsernameAndPassword(String username,String password);
}
