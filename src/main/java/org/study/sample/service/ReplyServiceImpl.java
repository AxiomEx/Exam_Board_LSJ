package org.study.sample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.study.sample.mapper.ReplyMapper;
import org.study.sample.model.ReplyDTO;

public class ReplyServiceImpl implements ReplyService{

	@Autowired
	private ReplyMapper reMapper;
	
	@Override
	public List<ReplyDTO> replyList() {
		return reMapper.replyList();
	}

	
	
	
}
