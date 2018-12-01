package service;

import java.util.Map;

public interface loginService {
	public Map<String, String> loginvalidate(String memberId, String password);
}
