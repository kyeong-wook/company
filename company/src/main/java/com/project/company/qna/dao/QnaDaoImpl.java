package com.project.company.qna.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class QnaDaoImpl implements QnaDao {
	@Autowired
	SqlSessionTemplate sql;
}
