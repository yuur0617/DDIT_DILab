package kr.or.ddit.case2.conf;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import kr.or.ddit.case2.material.Bibitan;
import kr.or.ddit.case2.material.Gun;
import kr.or.ddit.case2.material.Hunter;
import kr.or.ddit.case2.material.ShotGun;

//@Configuration
@ComponentScan("kr.or.ddit.case2")
//@Lazy
public class Case2JavaConfiguration {
	
//	@Bean
//	@Scope("prototype")
//	public Bibitan bibitan() {
//		return new Bibitan();
//	}
//	
//	@Bean
//	@Scope("prototype")
//	public ShotGun shotGun() {
//		return new ShotGun();
//	}
//	
//	@Bean
//	public Hunter hunter() {
//		return new Hunter();
//	}
//	
	@Bean
	@Scope("prototype")
	public LocalDateTime now() {
		return LocalDateTime.now();
	}
}
