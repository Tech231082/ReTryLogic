package main;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class TransFormerClass implements IAnnotationTransformer {
	
	public void transform(ITestAnnotation anno,Class testclass,Constructor testConst,Method testMeth) {
		
		anno.setRetryAnalyzer(Analyzer.class);
		
	}

}
