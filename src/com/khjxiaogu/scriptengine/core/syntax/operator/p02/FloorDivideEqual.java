package com.khjxiaogu.scriptengine.core.syntax.operator.p02;

import com.khjxiaogu.scriptengine.core.Exception.KSException;
import com.khjxiaogu.scriptengine.core.Object.KEnvironment;
import com.khjxiaogu.scriptengine.core.Object.KVariant;
import com.khjxiaogu.scriptengine.core.syntax.operator.DoubleOperator;

/**
 * @author khjxiaogu
 * @time 2020年2月19日
 * file:IntegerDivideEqual.java
 */
public class FloorDivideEqual extends DoubleOperator {

	/**
	 * 
	 */
	public FloorDivideEqual() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public KVariant eval(KEnvironment env) throws KSException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getPriority() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public String getToken() {
		// TODO Auto-generated method stub
		return "\\=";
	}
}