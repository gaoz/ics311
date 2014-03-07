package ics311;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RedBlackDynamicSet rbtree  = new RedBlackDynamicSet("RedBlackTree");
                
                if (0 < args.length) {
                    File inFile; inFile= new File(args[0]);
                    //File file = new File("/sorted-100.txt");
                    try(BufferedReader br = new BufferedReader(new FileReader(inFile))) {
                        int i =0;
                        for(String line; (line = br.readLine()) != null; ) {
                            //System.out.println(line);

                            rbtree.insert(i, line);
                            i++;


                        }
                        for(int j = 0; j< i; j++){
                            System.out.println(rbtree.retrieve(j));
                        }
                        // line is not visible here.
                    }catch(IOException e){
                            System.out.print(e);
                    }
                }
	}

}
