package com.h2kinfosys.learn01.day09;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TestFileOperations {

	public static void main(String[] args) throws IOException {

		FileReader reader = null;
		BufferedReader bufferReader = null;
		
		FileWriter writer1 = null;
		FileWriter writer2 = null;
		BufferedWriter bufferWriter = null;
		PrintWriter out = null;
		
		try {
			reader = new FileReader("/RISHI/H2K/FileIO/demofile.txt");
			bufferReader = new BufferedReader(reader);
			
			writer1 = new FileWriter("/RISHI/H2K/FileIO/demofile_write.txt");
			bufferWriter = new BufferedWriter(writer1);
			
			writer2 = new FileWriter("/RISHI/H2K/FileIO/demofile_print.txt");
			out = new PrintWriter(writer2);
			
			String line;
			while((line = bufferReader.readLine()) != null) {
				bufferWriter.write(line);
				bufferWriter.newLine();
				
				out.println(line);
				
				System.out.println(line);
			}
			out.flush();
			bufferWriter.flush();
		}catch(IOException ioEx) {
			ioEx.printStackTrace();
		}finally {
			reader.close();
			bufferReader.close();
			bufferWriter.close();
			out.close();
		}

	}

}
