package runTimeRetryfailedTc;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import retryfailedTc.RetryAnalyzer;

public class DemoTransformer implements IAnnotationTransformer{
	
	
	public void transform(ITestAnnotation annotation,Class testClass,Constructor testConstrutor,Method testMethod) {
		annotation.setRetryAnalyzer(RetryAnalyzer.class);
	}
}

