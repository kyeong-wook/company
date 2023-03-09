package com.project.company.qna.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.company.qna.dao.QnaDao;

@Service
public class QnaServiceImpl implements QnaService {
	@Autowired
	QnaDao qDao;
}
