package com.callor.todo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TodoVO {
	
	private String tKey; 		// ID 에 해당하는 칼럼
	private String tContent;	// 할일내용
	private String sdate;		// 추가한(시작한)날짜
	private String stime;		// 추가한(시작한)시각
	
	private String edate;		// 완료한 날짜
	private String etime;		// 완료한 시각
	
	private boolean bComp;		// 완료여부(true, false)
	
	@Override
	public String toString() {
		
		String result = String.format("%s\t", tKey);
		result += String.format("%s\t", sdate);
		result += String.format("%s\t", stime);
		
		// 3항연산
		// edate == null 가 true 이면 "진행중" 문자열을 compStr 에 저장
		// 그렇지 않으면 "완료됨"을 compStr 에 저장
		// edate 의 값이 null 이거나 "" 이면
		String compStr = edate == null || edate.isEmpty() ? "진행중" : "완료됨";
		
		// 아래의 if()문 명령문을 간소화한  명령문
		if(edate == null || edate.isEmpty()) {
			compStr = "진행중";
		} else {
			compStr = "완료됨";
		}
		
		result += String.format("%s\t", tContent);
		result += String.format("%s",compStr);
		return result;
	}
}
