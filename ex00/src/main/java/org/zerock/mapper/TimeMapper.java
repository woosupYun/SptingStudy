package org.zerock.mapper;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

public interface TimeMapper {
	@Select("SELECT sysdate FROM dual")
	public String getTime();
}
