package common;

import org.springframework.stereotype.Component;
/**
 * @author linxinfang
 * @DESCRIPTION 設定回傳前端資料內容
 */
@Component
public class ResultGenerator {
	private static final String SUCCESS = "success";
	
	//=================================success====================================
	public resultVo getSuccessResult() {
		return new resultVo()
				.setCode(ResultCode.SUCCESS)
				.setRetMSG(SUCCESS);
	}
	public resultVo getSuccessResult(String msg) {
		return new resultVo()
				.setCode(ResultCode.SUCCESS)
				.setRetMSG(msg);
	}
	public resultVo getSuccessResult(String msg, Object data) {
		return new resultVo()
			.setCode(ResultCode.SUCCESS)
			.setRetMSG(msg)
			.setData(data);
	}
	
	//=================================fail====================================
	
	public resultVo getFailResult() {
		return new resultVo()
				.setCode(ResultCode.SERVER_ERROR)
				.setRetMSG("server error");
	}
	
	public resultVo getFailResult(String msg) {
		return new resultVo()
				.setCode(ResultCode.FAIL)
				.setRetMSG(msg);
	}
	
	public resultVo getFailResult(String msg, Object data) {
		return new resultVo()
				.setCode(ResultCode.FAIL)
				.setRetMSG(msg)
				.setData(data);
	}
	
}
