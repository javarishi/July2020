package com.h2kinfosys.learn01.day09;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) {
		try {
			File file = new File("/RISHI/H2K/FileIO/teachers.csv");
			if(file.exists()) {
				System.out.println("Teachers File Exists");
				//file.deleteOnExit();
			}else {
				file.createNewFile();
			}
			System.out.println("file.getPath() : "  + file.getPath());
			System.out.println("file.getAbsolutePath() : "  + file.getAbsolutePath());
			System.out.println("file.getCanonicalPath() : "  + file.getCanonicalPath());
			System.out.println("file.getParent() : "  + file.getParent());
		
			System.out.println("file.canRead() : "  + file.canRead());
			System.out.println("file.canWrite() : "  + file.canWrite());
			System.out.println("file.canExecute() : "  + file.canExecute());
			
			File dirFile = new File("/RISHI/H2K/FileIO");
			File csvDir = new File("/RISHI/H2K/FileIO/CSVFiles");
			if(!csvDir.exists()) {
				csvDir.mkdir();
			}
			if(dirFile.isDirectory()) {
				System.out.println(dirFile.getName() + " is Directory");
				System.out.println("dirFile.getTotalSpace() : "  + dirFile.getTotalSpace());
				System.out.println("dirFile.getFreeSpace() : "  + dirFile.getFreeSpace());
				System.out.println("dirFile.getUsableSpace() : "  + dirFile.getUsableSpace());
				
				File moveFile = null;
				File[] listofFiles = dirFile.listFiles();
				for(File eachFile : listofFiles) {
					System.out.println(eachFile.getName());
					if(eachFile.getName().indexOf(".csv") != -1){
						eachFile.renameTo(new File(csvDir.getPath()));
					}
				}
				
			}else {
				System.out.println("Not a Directory");
			}
			File newDir = new File("/RISHI/H2K/FileIO/NewDir");
			if(newDir.exists()) {
				System.out.println("Directory Exists");
				newDir.delete();
			}else {
				newDir.mkdir();
				System.out.println("newDir.exists() " +newDir.exists());
			}
			
		}catch(IOException ioEx) {
			ioEx.printStackTrace();
		}
	}
}
