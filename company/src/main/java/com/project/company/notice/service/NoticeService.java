package com.project.company.notice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.company.notice.dao.NoticeDao;

@Service
public class NoticeService {
	@Autowired
	NoticeDao nDao;
}
