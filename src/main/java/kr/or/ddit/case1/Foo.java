package kr.or.ddit.case1;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Repository;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Repository
@Data
public class Foo {
	
	private Bar bar; // 필수 전략
//	@Autowired
	private Baz baz; // 옵셔널
	
	public Foo(Bar bar) {
		super();
		this.bar = bar;
	}
	
//	@Resource(name = "baz")
	@Inject
	@Named("baz")
	@Required
	public void setBaz(Baz baz) {
		this.baz = baz;
	}
	
	@PostConstruct
	public void init1234() {
		log.info("주입된 결과 -------------------->{}, {}", bar, baz);
	}
	
}
