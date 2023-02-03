package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.DiaryBoardDao;
import com.example.demo.entity.DiaryBoard;

@Service 
public class DiaryBoardServiceImpl implements DiaryBoardService {
	
	@Autowired private DiaryBoardDao diaryBoardDao;
	
	@Override
	public List<DiaryBoard> getDiaryBoardList() {
		List<DiaryBoard> list = diaryBoardDao.getDiaryBoardList();
		return list;
	}

	@Override
	public DiaryBoard getDiaryBoard(int did) {
		DiaryBoard diaryBoard = diaryBoardDao.getDiaryBoard(did);
		return diaryBoard;
	}

	@Override
	public void insertDiaryBoard(DiaryBoard diaryBoard) {
		diaryBoardDao.insertDiaryBoard(diaryBoard);
	}
	
//===2/3a add method (class에서 add됨)
	@Override
	public void updateDiaryBoard(DiaryBoard diaryBoard) {  //-2/3a-1  젤끝에 d-> diaryBoard 로 수정
		diaryBoardDao.updateDiaryBoard(diaryBoard); //- //<-2/3a-1  젤끝에 d-> diaryBoard 로 수정
	}

	@Override
	public void deleteDiaryBoard(int did) {
		diaryBoardDao.deleteDiaryBoard(did);
	}

//	@Override
//	public int getDiaryBoardCount(String field, String query) {
//		query = "%"+query+"%";
//		int count = diaryBoardDao.getDiaryBoardCount(field, query)
//		return 0;
//	}
}
