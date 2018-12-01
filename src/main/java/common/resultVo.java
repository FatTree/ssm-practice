package common;

import java.io.Serializable;
import lombok.Data;
/**
 * @author linxinfang
 * @DESCRIPTION 丟回前端的資料物件
 */
@Data
public class resultVo implements Serializable {
	private static final long serialVersionUID = 1L;
	private int retCode;
	private String retMSG;
	private Object result;
	
    public resultVo setCode(ResultCode resultCode) {
        this.retCode = resultCode.code();
        return this;
    }
    
    public resultVo setRetMSG(String message) {
        this.retMSG = message;
        return this;
    }
    
    public resultVo setData(Object data) {
        this.result = data;
        return this;
    }
}
