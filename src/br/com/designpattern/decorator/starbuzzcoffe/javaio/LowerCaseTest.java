package br.com.designpattern.decorator.starbuzzcoffe.javaio;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseTest {
	public static void main(String[] args) throws IOException {
		int c;

		try {
			InputStream pathToFile = LowerCaseTest.class.getResourceAsStream("test.txt");
			InputStream in = new LowerCaseInputStream(new BufferedInputStream(pathToFile));

			while ((c = in.read()) >= 0) {
				System.out.print((char) c);
			}

			in.close();
		} catch (IOException ioException) {
			ioException.printStackTrace();
		}
	}
}
