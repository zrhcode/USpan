package ca.pfv.spmf.algorithms.sequentialpatterns.uspan;

import ca.pfv.spmf.algorithms.sequentialpatterns.uspan.AlgoUSpan;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URL;

/**
 * This file is for testing the USpan algorithm
 * @author Philippe Fournier-Viger, 2015
 */
public class MainTestUSpan {
	
	public static void main(String [] arg) throws IOException{
		 // the input database
		String input = fileToPath("uspantest.txt");
		// the path for saving the patterns found
		String output = ".//output.txt";

		// the minimum utility threshold
		int minutil = 9;	//0.2

		AlgoUSpan algo = new AlgoUSpan();
		
		// set the maximum pattern length (optional)
		algo.setMaxPatternLength(10000);
		
		// run the algorithm
		algo.runAlgorithm(input, output, minutil);

		
		// print statistics
		algo.printStatistics();
	}
	
	public static String fileToPath(String filename) throws UnsupportedEncodingException{
		URL url = MainTestUSpan.class.getResource(filename);
		 return java.net.URLDecoder.decode(url.getPath(),"UTF-8");
	}
}
