package org.ssglobal.training.codes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StreamTokenizer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MixTransaction {
	
	private static Logger logger = LogManager.getLogger("traplogger");
	
	public static boolean fileExists(String filename) {
		logger.info("executing fileExists");
		File file = new File("./src/files/" + filename);
		logger.info("exiting fileExists without error");
		return file.exists();
	}
	
	public static boolean isInt(String strVal) {
		try {
			return parsing(strVal);
		} catch (NumberFormatException e) {
			return false;
		} catch (Exception e) {
			return false;
		}
	}
	
	private static boolean parsing(String num) throws NumberFormatException, 
		Exception {
		try {
			int number = Integer.parseInt(num);
			return true;
		} catch(NumberFormatException e) {
			return false;
		}
	}
	
	public static boolean isDouble(String strVal) {
		try {
			return parsingDouble(strVal);
		} catch (NumberFormatException e) {
			return false;
		} catch (Exception e) {
			return false;
		}
	}
	
	private static boolean parsingDouble(String num) throws NumberFormatException, 
		Exception {
		try {
			double number = Double.parseDouble(num);
			return true;
		} catch(NumberFormatException e) {
			return false;
		}
	}
	
	public static void convertMatrix(String filename) throws WrongMatrixValuesException, 
		WrongMatrixDimensionException{
		File file = new File("./src/files/" + filename);
		int[][] matrix = new int[3][3];
		int[] temp = new int[50];
		
		try(FileReader fr = new FileReader(file);) {
			StreamTokenizer tokenizer = new StreamTokenizer(fr);
			int token = tokenizer.nextToken();
			int i = 0;
			while(!(token == StreamTokenizer.TT_EOF)) {
				String value = tokenizer.toString();
				if (token == StreamTokenizer.TT_WORD) {
					throw new WrongMatrixValuesException();
				} else if(token == StreamTokenizer.TT_NUMBER) {
					temp[i] = (int) tokenizer.nval;
					i++;
				}
				token = tokenizer.nextToken();
			}
			int c = 0;
			if(!(i == 9)) {
				throw new WrongMatrixDimensionException();
			} else {
				for(int a = 0; a < matrix.length; a++) {
					for(int b = 0; b < matrix.length; b++) {
						matrix[a][b] = temp[c++];
						System.out.print(matrix[a][b] + " ");
					}
					System.out.println();
				}
			}
			
			
		} catch (FileNotFoundException e) {
			System.out.println("file does not exist");
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
	}

}
