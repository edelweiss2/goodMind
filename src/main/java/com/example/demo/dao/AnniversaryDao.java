package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.demo.entity.Anniversary;

@Mapper
public interface AnniversaryDao {

	@Select("SELECT * FROM anniversary"
			+ "  where adate >= #{start} AND adate <= #{end}"
			+ "  ORDER BY adate")
	List<Anniversary> getAnnivList(String start, String end);
	
}
