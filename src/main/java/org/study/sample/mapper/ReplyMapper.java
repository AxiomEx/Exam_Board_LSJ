package org.study.sample.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.study.sample.model.ReplyDTO;

@Mapper
public interface ReplyMapper {

	public List<ReplyDTO> replyList();
	
}
