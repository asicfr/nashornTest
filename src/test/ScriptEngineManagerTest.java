package test;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import javax.script.Compilable;
import javax.script.CompiledScript;
import javax.script.Invocable;
import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * http://techasite.blogspot.fr/
 * @author asic
 */
public class ScriptEngineManagerTest {


	public static void main(String[] args) throws FileNotFoundException, ScriptException, NoSuchMethodException {

		System.out.println("Start Java");
		InputStream is = ScriptEngineManagerTest.class.getResourceAsStream("/test/test.js");
		Reader reader = new InputStreamReader(is);
		
		ScriptEngineManager sem = new ScriptEngineManager();
		// ScriptEngine engine = factory.getEngineByName("JavaScript"); // OLD RhinoScriptEngine
		ScriptEngine engine = sem.getEngineByName("nashorn");

		
		System.out.println("add var in engine context");
		engine.getBindings(ScriptContext.ENGINE_SCOPE).put("java_var_in", "in");
		
		
		System.out.println("compile js script");
		CompiledScript scr = ((Compilable) engine).compile(reader);
		System.out.println("execute js script");
        scr.eval();
		System.out.println("return to Java");
		
		
		String js_var_out = (String) engine.getBindings(ScriptContext.ENGINE_SCOPE).get("js_var_out");
		System.out.println("show in java the var add in engine context from javascript : " + js_var_out);
		
		
		Invocable invocable = (Invocable) engine;
        System.out.println("result of javascript function : " + invocable.invokeFunction("myfct", "Scala"));
        
	}

}
