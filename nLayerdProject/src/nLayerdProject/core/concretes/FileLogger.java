package nLayerdProject.core.concretes;

import nLayerdProject.core.abstracts.Logger;

public class FileLogger implements Logger {

	@Override
	public void log(String data) {
		System.out.println("Logged into the file: " + data);	
	}
}
