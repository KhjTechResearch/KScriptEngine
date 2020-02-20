package com.khjxiaogu.scriptengine.core.syntax.operator.p14;

import com.khjxiaogu.scriptengine.core.Exception.KSException;
import com.khjxiaogu.scriptengine.core.Object.KEnvironment;
import com.khjxiaogu.scriptengine.core.Object.KVariant;
import com.khjxiaogu.scriptengine.core.TypeConvert.TypeInfo;
import com.khjxiaogu.scriptengine.core.syntax.operator.Associative;
import com.khjxiaogu.scriptengine.core.syntax.operator.DoubleOperator;

/**
 * @author khjxiaogu
 * @time 2020年2月16日
 * file:OperatorInstanceOf.java
 * x instanceof x
 */
public class InstanceOf extends DoubleOperator {

	public InstanceOf() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public KVariant eval(KEnvironment env) throws KSException {
		// TODO Auto-generated method stub
		return new KVariant(TypeInfo.forName(super.right.eval(env).toType(String.class)).getType().isInstance(super.left.eval(env).getValue()));
	}

	@Override
	public int getPriority() {
		// TODO Auto-generated method stub
		return 14;
	}
	@Override
	public String getToken() {
		// TODO Auto-generated method stub
		return " instanceof ";
	}
}