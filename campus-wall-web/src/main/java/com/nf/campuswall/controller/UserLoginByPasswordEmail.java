package com.nf.campuswall.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nf.campuswall.dao.impl.UserDaoImpl;
import com.nf.campuswall.entity.UserEntity;
import vo.ResultVo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Map;

@WebServlet("/loginUser")
public class UserLoginByPasswordEmail extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        BufferedReader br = req.getReader();
        String str, wholeStr = "";
        while ((str = br.readLine()) != null) {
            wholeStr += str;
        }

        final ObjectMapper objectMapper = new ObjectMapper();
        final Map map = objectMapper.readValue(wholeStr, Map.class);


        String json = objectMapper.writerWithDefaultPrettyPrinter()
                .writeValueAsString(map);
        final UserEntity userEntity = objectMapper.readValue(json, UserEntity.class);

        final UserEntity user = new UserDaoImpl().loginByEmailOrPhoneAndPassword(userEntity);

        if (user.getUserEmail() != null && user.getUserPassword() != null || user.getUserPassword() != null) {
            HttpSession session = req.getSession();
            session.setAttribute("user", user);
        }

        resp.getWriter().write(new ObjectMapper().writeValueAsString(ResultVo.fail("账号或密码错误", user.getUserName())));


    }
}
