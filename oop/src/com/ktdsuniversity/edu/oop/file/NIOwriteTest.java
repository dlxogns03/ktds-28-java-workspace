package com.ktdsuniversity.edu.oop.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class NIOwriteTest {
	
	public static void main(String[] args) {
		
		File targetFile = new File("C:/java/outputs", "java_output.txt");
		
		//"C:/java/outputs"존재하는지 확인
		if(!targetFile.getParentFile().exists()) {
			//"C:/java/outputs"폴ㄷ가 없으면 생성한다.
			targetFile.getParentFile().mkdirs();
			
		}
		
		//java_output.txt파일이 존재하는지 확인해보고
		//존재하면 java_output(2).txt로 순번을 증가 시키면서 계속 확인한다.
//		int index = 2;
//		while(targetFile.exists()) {
//			targetFile = new File(targetFile.getParent(),
//								   "java_output (%d).txt".formatted(index++));
//		}
		
		//파일을 생성하고 내용을 작성한다.
		//1.파일에 작성할 내용을 만든다.
		
		List<String> data = new ArrayList<>();
		
		data.add("qewrtyuuqi");
		data.add("quqqrt");
		data.add("wrtuw");
		data.add("reqtqert1234115");
		//2.파일 생성한다.
		
		try {
			Files.write(targetFile.toPath(), data, StandardOpenOption.APPEND);
		}catch(IOException ioe	) {
			ioe.printStackTrace();
		}
		
	}

}
