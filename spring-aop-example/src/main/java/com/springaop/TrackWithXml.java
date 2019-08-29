package com.springaop;

import org.aspectj.lang.JoinPoint;

public class TrackWithXml {
	public void adviceBefore(JoinPoint point) {
		System.out.println("TrackWithXml before method:"+point.getSignature().getName());
	}
	
	public void adviceAfterReturning(JoinPoint point,Object result) {
		System.out.println("TrackWithXml advice After Returning method:"+point.getSignature().getName());
		System.out.println("TrackWithXml result: "+result);
	}
	
	public void adviceAfter(JoinPoint point) {
		System.out.println("TrackWithXml after method:"+point.getSignature().getName());
	}
}
