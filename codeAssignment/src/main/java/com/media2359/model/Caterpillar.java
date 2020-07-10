package com.media2359.model;

import com.media2359.props.NotFlyable;
import com.media2359.props.Walkable;
import com.media2359.utils.Constant;

public class Caterpillar extends Animal implements NotFlyable, Walkable {

	public Butterfly transformToButterfly() {
		return new Butterfly();
	}

	public void canFly() {
		System.out.print(Constant.CAN_NOT_FLY);
	}

	public void canWalk() {
		System.out.print(Constant.CAN_WALK);
	}

}
