package com.khjxiaogu.scriptengine.core.Object;

public class NativeClosure extends ExtendableClosure {
	protected Object cls;

	public Object getObjthis() {
		return cls;
	}

	public NativeClosure(KEnvironment env, String inheritance, Object cls) {
		super(inheritance);
		this.cls = cls;
	}

}
