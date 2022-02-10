package hello.jython;

import java.util.Properties;

import org.python.util.PythonInterpreter;

public class HelloJython001 {

	public static void main(String[] args) throws Exception {

		Properties prop = new Properties();
		prop.put("python.console.encoding", "UTF-8");
		PythonInterpreter.initialize(System.getProperties(), prop, new String[] {});

		try (PythonInterpreter py = new PythonInterpreter()) {
			py.execfile("src/main/resources/hello.py");
		}
	}

}
