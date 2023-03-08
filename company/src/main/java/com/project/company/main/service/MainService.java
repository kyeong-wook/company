package com.project.company.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.company.main.dao.MainDao;

@Service
public class MainService {
	
	@Autowired
	MainDao mDao;
}
