import java.util.Scanner;
import java.io.*;
import java.io.FileReader;
class countfile
{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
		System.out.println("Enter the file name(text1.txt or text2.txt):");
		String fname=sc.nextLine();
	try{
		File f=new File(fname);
		FileInputStream fileStream=new FileInputStream(f);
		InputStreamReader input=new InputStreamReader(fileStream);
		BufferedReader reader=new BufferedReader(input);
		 String line;
		int character=0;
		int word=0;
		int sentence=0;
		while((line=reader.readLine())!=null)
		 { 
			for(int i=0;i<line.length();i++){
			if(line.charAt(i)!=' ')
			{character++;}
			}
		}
		String[] wordlist=line.split(" ");
		word+=wordlist.length;
		String[] sentencelist=line.split("/n");
		sentence+=sentencelist.length;
		System.out.println("the file as character :"+character);
		System.out.println("the file as words :"+word);
		System.out.println("the file as sentence :"+sentence);
	}
	catch(Exception e){
		System.out.println("File not found");
	}

	}
}


