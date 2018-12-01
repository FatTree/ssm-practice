package controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import common.PageAction;
import common.ResultGenerator;
import common.resultVo;
import entity.Checklist;
import entity.ChecklistExample;
import service.checklistService;

@RequestMapping("/checklist")
@Controller
public class checklistController {
	
	@Autowired
	checklistService service;
	@Autowired
	ResultGenerator resultGenerator;
	
	@GetMapping("/list")
	public ModelAndView checklistPage() {
		ModelAndView modelandview = new ModelAndView();
		
		return modelandview;
	}
	
	@CrossOrigin
	@ResponseBody
	@PostMapping(path="/{action}", produces="application/json;charset-UTF-8")
	public resultVo create(@PathVariable PageAction action, @RequestBody Checklist checklist, HttpServletRequest request, HttpServletResponse response) {	
		response.setCharacterEncoding("utf-8");
//		ResultGenerator resultGenerator = new ResultGenerator();
		int result = 0;
		switch(action) {
			case list:
				List<Checklist> data = service.display(checklist.getMemberid());
				return resultGenerator.getSuccessResult("", data);
			case create:
				result = service.create(checklist);
				countResult(result);
				return resultGenerator.getSuccessResult();
			case delete:
				result = service.delete(checklist.getId());
				countResult(result);
				return resultGenerator.getSuccessResult();
//			case update:
//				result = service.update(checklist);
//				countResult(result);
//				return resultGenerator.getSuccessResult();
			case check:
				result = service.check(checklist);
				countResult(result);
				return resultGenerator.getSuccessResult();
		}
		
		return resultGenerator.getFailResult();
	}
	
	public resultVo countResult(int result) {
//		ResultGenerator resultGenerator = new ResultGenerator();
		if(result>0) {
			return resultGenerator.getSuccessResult("操作成功！");
		} else if (result == 0) {
			return resultGenerator.getFailResult("無此筆資料");			
		} 
		return resultGenerator.getFailResult();
	}
	
//	@PostMapping("/list")
//	public resultVo select(@RequestBody Checklist checklist) {
//		
//		resultVo resultMap = service.display(checklist.getMemberid());
//		return resultMap;
//	}
//	@PostMapping("/create")
//	public resultVo create(String memberId, String checkName,HttpServletRequest request, HttpServletResponse response) {
//		resultVo resultMap = new resultVo();
//		System.out.println("check!!");
//		return resultMap;
//	}
	
//	@PostMapping("/delete")
//	public resultVo delete(String memberId, String checkName) {
//		System.out.println("check!!");
//		resultVo resultMap = new resultVo();
//		return resultMap;
//	}
//	
//	@PostMapping("/update")
//	public resultVo update(String memberId, String checkName) {
//		resultVo resultMap = new resultVo();
//		return resultMap;
//	}

}
