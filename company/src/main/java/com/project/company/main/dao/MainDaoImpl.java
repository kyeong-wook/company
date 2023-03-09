package com.project.company.main.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.company.main.service.MainService;

@Repository
public class MainDaoImpl implements MainService {

	@Autowired
	SqlSessionTemplate sql;
}
