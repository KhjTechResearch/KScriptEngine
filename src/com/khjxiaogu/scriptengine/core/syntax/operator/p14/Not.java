package com.khjxiaogu.scriptengine.core.syntax.operator.p14;

import com.khjxiaogu.scriptengine.core.KVariant;
import com.khjxiaogu.scriptengine.core.exceptions.KSException;
import com.khjxiaogu.scriptengine.core.object.KEnvironment;
import com.khjxiaogu.scriptengine.core.syntax.operator.Associative;
import com.khjxiaogu.scriptengine.core.syntax.operator.SingleOperator;

/**
 * @author khjxiaogu
 * @time 2020年2月16日 file:OperatorNot.java !x
 */
public class Not extends SingleOperator {

	/**
	 *
	 */
	public Not() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public KVariant eval(KEnvironment env) throws KSException {
		// TODO Auto-generated method stub
		return new KVariant(super.Child.eval(env).getNumber() != 0 ? 0 : 1);
	}

	@Override
	public int getPriority() {
		// TODO Auto-generated method stub
		return 14;
	}

	@Override
	public Associative getAssociative() {
		// TODO Auto-generated method stub
		return Associative.LEFT;
	}

	@Override
	public String toString() {
		return "(!" + super.Child.toString() + ")";
	}
}
