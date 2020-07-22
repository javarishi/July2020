package com.h2kinfosys.learn01.day10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ThrowingException {

	public static void main(String[] args) {
		ThrowingException test = new ThrowingException();
		try {
			test.readFileContent("/RISHI/H2K/FileIO/xasdemofile.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	public void readFileContent(String path) throws IOException {
		FileReader reader = new FileReader(path);
		BufferedReader bufferReader = new BufferedReader(reader);
		String line;
		while((line = bufferReader.readLine()) != null) {
			System.out.println(line);
		}
		bufferReader.close();
		reader.close();
	}
	
	
	

}
