package com.callor.app.exec;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.model.AddressVO;
import com.callor.app.service.AddrServiceV1;

public class AddrEx04A {

	public static void main(String[] args) {
		/*
		 * List : interface, 데이터 그룹을 저장하기 위한 type
		 * 		Collections type
		 * 다수의 데이터를 저장하고 연산에 사용하기 위한 데이터 type
		 * List 를 선언할때는 Generic type 을 지정한다
		 * 		1. List 에 add 하는 데이터를 제한하여
		 * 		잘못된 데이터가 add 되는 것을 방지하기 위함
		 * 		2. 메모리 낭비를 막고 성능상 잇점이 있기 때문에
		 * 아래 선언된 List 는 Generic type 이 AddressVO 이다
		 * 여기 List 에 데이터를 추가하려면 먼저 AddressVO type 의
		 * 		vo 객체를 만들고, 데이터를 저장한 다음 add 한다
		 */
		List<AddressVO> addrs = new ArrayList<>();

		AddressVO adVO = new AddressVO();

		adVO.setName("홍길동");
		adVO.setTel("010-111-1111");
		addrs.add(adVO);

		/*
		 * VO 데이터를 List 에 add 하기 위해서는
		 * 항상 새로운 VO를 생성하고 데이터를 setting 하고 add 해야 한다.
		 */
		adVO = new AddressVO();
		adVO.setName("이몽룡");
		adVO.setTel("010-222-2222");
		addrs.add(adVO);

		adVO = new AddressVO();
		adVO.setName("성춘향");
		adVO.setTel("010-333-3333");
		addrs.add(adVO);

		AddrServiceV1 adService = new AddrServiceV1();
		adService.printAddrList(addrs);

	}

}
