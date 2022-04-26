package org.study.sample.test;

import java.util.List;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.study.sample.mapper.ReplyMapper;
import org.study.sample.model.ReplyDTO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j

public class ReplyMapperTest {

	@Autowired
	private ReplyMapper reMapper;
	
	
	
	
	
	
//	@Test
	public void replyListTest() {
		List<ReplyDTO> list = reMapper.replyList();
		for(ReplyDTO dto : list) {
			log.info(dto);
		}
	}
	
	
}
