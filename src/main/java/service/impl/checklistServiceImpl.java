package service.impl;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.WebDataBinder;

import common.ResultCode;
import common.ResultGenerator;
import common.resultCommon;
import common.resultVo;
import dao.ChecklistMapper;
import entity.Checklist;
import entity.ChecklistExample;
import entity.Checklist;

import java.util.List;

import service.checklistService;

@Service("checklistService")
public class checklistServiceImpl implements checklistService {

	@Autowired
	ChecklistMapper mapper;

	
	@Override
	public List<Checklist> display(String mId) {
		return mapper.selectByFKey(mId);
	}

	@Override
	public int create(Checklist checklist) {
		Date now = new Date();
//		SimpleDateFormat sdf = new SimpleDateFormat("yyMMddhhmmss");
//		String chId = "ch" + sdf.format(now);
		String id = checklist.getId();
		checklist.setId(id);
		return mapper.insert(checklist);
	}

	@Override
	public int delete(String cid) {
		return mapper.deleteByPrimaryKey(cid);
	}

	@Override
	public int update(Checklist checklist) {
		
		return mapper.updateByPrimaryKeySelective(checklist);
	}
	@Override
	public int check (@Param("record")Checklist record) {
		ChecklistExample ch = new ChecklistExample();
		ch.createCriteria().andIdEqualTo(record.getId());
		return mapper.updateByExampleSelective(record,ch);
	}



}
