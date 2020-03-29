package com.khjxiaogu.scriptengine.core.typeconvert;

import com.khjxiaogu.scriptengine.core.exceptions.ScriptException;

public class ConversionException extends ScriptException {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public ConversionException(TypeInfo fromType, TypeInfo ToType) {
		super("无法从" + fromType.getName() + "转换为" + ToType.getName());
		// TODO Auto-generated constructor stub
	}

	public ConversionException(TypeInfo ToType) {
		super("无法转换为" + ToType.getName());
		// TODO Auto-generated constructor stub
	}

	public ConversionException(String fromType, String ToType) {
		super("无法从" + fromType + "转换为" + ToType);
		// TODO Auto-generated constructor stub
	}

	public void setType(String fromType, String ToType) {
		detail = "无法从" + fromType + "转换为" + ToType;
	}
}