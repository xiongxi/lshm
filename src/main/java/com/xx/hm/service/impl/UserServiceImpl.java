package com.xx.hm.service.impl;

import com.xx.hm.dao.UserDao;
import com.xx.hm.model.User;
import com.xx.hm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

/**
 * User: xx
 * Date: 2014/12/29
 * Time: 16:38
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public int insertUser(User user) {
        // TODO Auto-generated method stub
        return userDao.insertUser(user);
    }

    public void writeTestHtml() throws Exception{
        //向域名为domain写入一个test.txt文件，文件内容为“测试内容”
        FileOutputStream outputStream = new FileOutputStream("saestor://domain/test.html");
        Writer writer = new OutputStreamWriter(outputStream);
        writer.write("测试内容");
        writer.close();
    }

}
