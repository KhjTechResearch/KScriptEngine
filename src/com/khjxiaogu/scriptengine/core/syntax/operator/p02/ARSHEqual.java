package com.khjxiaogu.scriptengine.core.syntax.operator.p02;

import com.khjxiaogu.scriptengine.core.KVariant;
import com.khjxiaogu.scriptengine.core.exceptions.KSException;
import com.khjxiaogu.scriptengine.core.object.KEnvironment;
import com.khjxiaogu.scriptengine.core.syntax.AssignOperation;
import com.khjxiaogu.scriptengine.core.syntax.Assignable;

public class ARSHEqual extends Equal {

	public ARSHEqual() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public KVariant eval(KEnvironment env) throws KSException {
		// TODO Auto-generated method stub
		return ((Assignable) super.left).assignOperation(env, super.right.eval(env), AssignOperation.ARSH);
	}

	@Override
	public String getToken() {
		// TODO Auto-generated method stub
		return ">>>=";
	}
}
