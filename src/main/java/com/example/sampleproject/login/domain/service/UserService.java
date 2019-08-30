package com.example.sampleproject.login.domain.service;

import com.example.sampleproject.login.domain.repository.UserDao;

import org.springframework.stereotype.Service;

/**
 * UserService
 */
@Service
public class UserService {

    /**
     * リポジトリ操作db
     */
    UserDao dao;
}