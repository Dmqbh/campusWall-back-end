package com.nf.campuswall.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nf.campuswall.dao.UserDao;
import com.nf.campuswall.dao.impl.UserDaoImpl;
import com.nf.campuswall.entity.UserEntity;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Map;

@WebServlet("/emailEnroll")
public class AddUserByEmailPassword extends HttpServlet {
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

        final int i = new UserDaoImpl().userEmailRegistrationByEmailPassword(userEntity);


    }
}
