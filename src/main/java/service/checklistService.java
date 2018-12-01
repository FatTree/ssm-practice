package service;

import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;

import common.resultVo;
import entity.Checklist;
import entity.ChecklistExample;

import java.util.List;

public interface checklistService {
	public List<Checklist> display (String mId);
	public int create (Checklist checklist);
	public int delete (String mId);
	public int update (Checklist checklist);
	public int check(@Param("record")Checklist record);
}
