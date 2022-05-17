package com.callor.app.exec;

import com.callor.app.model.AddressVO;
import com.callor.app.service.AddrServiceV1;

public class AddrEx02 {
	public static void main(String[] args) {

		AddressVO hong = AddressVO.builder()
							.name("홍길동")
							.tel("010-111-1111")
							.addr("서울특별시")
							.build();
		AddrServiceV1 addService = new AddrServiceV1();
		/*
		 * printAddr() method 는 AddressVO type 의 매개변수를 갖고있다
		 * 특별히 return type 이 없다
		 */
		addService.printAddr(hong);

	}

}
