package com.imu.library.service;

import com.imu.library.pojo.User;
import com.imu.library.pojo.UserExample;
import java.util.List;

public interface UserService {
    public User selectByPrimaryKey(int userid);
    /*public User selectByPrimaryKeyAndPassword(int userId,String password);*/
    public List<User> selectByExample(UserExample userExample);

    public void insertSelective(User user);

    public void deleteUserById(Integer userid);

    public void updateByPrimaryKeySelective(User user);

}
