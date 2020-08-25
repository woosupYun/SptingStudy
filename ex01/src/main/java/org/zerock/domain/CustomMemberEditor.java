package org.zerock.domain;

import java.beans.PropertyEditorSupport;

public class CustomMemberEditor extends PropertyEditorSupport{
	
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		//text로 부터 member을 만들어서
		
		String[] strs = text.split("-");
		String name = strs[0];
		int age = Integer.valueOf(strs[1]);
		
		Member member = new Member();
		member.setName(name);
		member.setAge(age);
		
		// 에디터에 붙여주는 역활
		setValue(member);
	}

}
