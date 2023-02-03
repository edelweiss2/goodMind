package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.MapDao;
import com.example.demo.entity.Map;

@Service
public class MapServiceImpl implements MapService {
	
	@Autowired
	private MapDao mapDao;
	
	@Override
	public List<Map> getMapList() {
		List<Map> list = mapDao.getMapList();
		return list;
	}
	
}
