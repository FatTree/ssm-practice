package service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import service.loginService;
@Service("loginService")
public class loginServiceImpl implements loginService {

	@Override
	public Map<String, String> loginvalidate(String memberId, String password) {
		Map<String, String> result = new HashMap<>();
		return result;
	}

}
