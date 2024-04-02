package kr.or.ddit.resource;

import java.time.LocalDateTime;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class OtherVariousVO {
	@Value("#{srcVO.number * 5}")
	private int number;
	@Value("#{srcVO['boolData']}")
	private boolean boolData;
	@Value("#{srcVO.text * 3}")
	private String text;
	
	@Value("#{srcVO.now}")
	private LocalDateTime now;
	
	@Value("#{srcVO.fsRes}")
	private Resource fsRes;
	@Value("#{srcVO.cpRes}")
	private Resource cpRes;
	@Value("#{srcVO.webRes}")
	private Resource webRes;
}
