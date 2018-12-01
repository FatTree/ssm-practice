package common;
/**
 * @author linxinfang
 * @DESCRIPTION 列舉後端結果回傳值
 */
public enum ResultCode {
	SUCCESS(200),
	FAIL(400),
	UNATHORIZED(401),
	NOT_FOUND(404),
	SERVER_ERROR(500);
	
	private final int code;
	
	ResultCode(int code) {
		this.code = code;
	}
	
	public int code() {
		return code;
	}
}
