/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BANGLA;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.util.Scanner;

/**
 *
 * @author 18101424
 */
public class stream {
    public static void main(String[] args)throws Exception{
//        FileInputStream inputStream;
//        inputStream = new FileInputStream("C:\\Users\\18101424\\Documents\\NetBeansProjects\\LAB6\\src\\lab6\\input.txt");
//Reader reader = new InputStreamReader(inputStream, Charset.forName("UTF-8"));
Scanner scan = new Scanner (new File("C:\\Users\\18101424\\Documents\\NetBeansProjects\\LAB6\\src\\lab6\\input.txt"));
while(scan.hasNext()){
    System.out.println(scan.nextLine());
}
    }
}
