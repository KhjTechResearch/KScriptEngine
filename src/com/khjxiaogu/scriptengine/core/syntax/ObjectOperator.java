package com.khjxiaogu.scriptengine.core.syntax;

import java.util.List;

import com.khjxiaogu.scriptengine.core.KVariant;
import com.khjxiaogu.scriptengine.core.exceptions.KSException;
import com.khjxiaogu.scriptengine.core.object.KEnvironment;

public interface ObjectOperator extends Visitable {
	public KVariant getPointing(KEnvironment env) throws KSException;

	public void VisitAsChild(List<String> parentMap) throws KSException;

	public KEnvironment getObject(KEnvironment env) throws KSException;

}
