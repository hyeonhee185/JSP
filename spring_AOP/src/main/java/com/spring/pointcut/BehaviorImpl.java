package com.spring.pointcut;

public class BehaviorImpl implements Behavior {

	@Override
	public void 잠자기() {
		System.out.println("맨날 자고 싶다..........");
	}

	@Override
	public void 공부하기() {
		System.out.println("그만하고싶다");
	}

	@Override
	public void 밥먹기() {
		System.out.println("삼겹살 먹고 싶다으앜ㅋㅋㅋㅋㅋ");
	}

	@Override
	public void 데이트() {
		System.out.println("할 사람이 없다.");
	}

	@Override
	public void 운동() {
		System.out.println("운동은 역시 축구지~~~~~~~~~~~~!");
	}

	@Override
	public void 놀기() {
		System.out.println("놀땐 역시 넷플릭스와~~~~~~~!");
	}

	@Override
	public void 정신수양() {
		System.out.println("뭐야 이거 필요없어!!!!!!!!!!");
	}

}
