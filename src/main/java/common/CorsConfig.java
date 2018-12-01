package common;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
@Deprecated
@Configuration
public class CorsConfig {
	
	/**
	 * 設置後端接收前端限制
	 */
	private CorsConfiguration buildConfig() {
		CorsConfiguration config = new CorsConfiguration();
		config.addAllowedOrigin("http://localhost:8000");//前端開發網址
		config.addAllowedHeader("*");
		config.addAllowedMethod("*");
		config.setAllowCredentials(true);
		
		return config;
	}
	@Bean
	public CorsFilter corsFilter() {
		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		source.registerCorsConfiguration("/**", buildConfig());
		return new CorsFilter(source);
	}
}
