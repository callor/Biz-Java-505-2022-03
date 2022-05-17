package com.callor.app.service.impl;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.callor.app.model.ScoreVO;

public class ScoreServiceImplV3 extends ScoreServiceImplV2{

	protected String saveFileName;
	public ScoreServiceImplV3() {
		super();
		saveFileName = "src/com/callor/app/controller/score.txt";
	}

	@Override
	public void saveScore() {

		// 파일에 데이터를 기록하는 데 사용하는 도구
		FileOutputStream fileOut = null;
		BufferedOutputStream buffer = null;
		/*
		 * BufferedOutput 를 사용하는 이유
		 * 실제 데이터를 파일에 기록하기 위해서는 FileOutputStream 만
		 * 있어도 된다.
		 * 하지만, 파일에 기록하고 저장하는 일은 상당히 많은 시간을 소모한다
		 * 컴퓨터 메모리, CPU 입장에서는 파일을 기록하는 동안
		 * 아무것도 하지 못하고 기다려여 하는 상황이 발생한다
		 *
		 * 이때 중간에 BuffereOutput 라는 파이프를 연결해 두고
		 * 애플리케이션에서는 BuffereOutput 에게 데이터를 모두 보내고
		 * 다른 일을 수행한다
		 *
		 * 그러면 BufferedOutput 와 FileOutput 가 협력하여 데이터를
		 * 파일에 기록하는 일을 대신 수행해준다
		 */
		try {
			fileOut = new FileOutputStream(saveFileName);
			buffer = new BufferedOutputStream(fileOut);
			for(ScoreVO scVO : scList) {
				String writeStr = "";
				writeStr += String.format("%s:", scVO.getStName());
				writeStr += String.format("%d:",scVO.getIntKor());
				writeStr += String.format("%d:",scVO.getIntEng());
				writeStr += String.format("%d\n",scVO.getIntMath());
				buffer.write(writeStr.getBytes());
			} // end for
			buffer.flush();
			buffer.close();
			fileOut.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}




	}



}
