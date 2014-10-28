package net.team31;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import org.apache.commons.io.FileUtils;

public class SwfCleanV2 {
	

	public static void main(String[] args)  {
		//reorg();
		
		cleanupIndi();
		//cleanupBatch();

	}

	private static void reorg() {
		for (int i = 1; i < 1897; i++) {
			String filename = "C:\\Users\\zli011\\git\\swf\\swf\\output\\" + i
					+ ".swf\\shapes";
			File source = new File(filename);
			String filename2 = "C:\\Users\\zli011\\git\\swf\\swf\\swfreorg\\"
					+ i + ".swf";
			File target = new File(filename2);
			//target.mkdir();
			try {

				// Use moveDirectory method to move directory with all its
				// contents

				FileUtils.moveDirectory(source, target);

			} catch (IOException e) {

				e.printStackTrace();

			}
		}
	}

	private static void cleanupIndi() {
		//String filename = "C:\\Users\\zli011\\git\\swf\\swf\\output\\1.swf\\shapes\\59.svg";
		//String filename = "C:\\Users\\zli011\\git\\swf\\swf\\output\\76.swf\\shapes\\61.svg";
		//String filename = "C:\\Users\\zli011\\git\\swf\\swf\\output\\76.swf\\shapes\\75.svg";
		//String filename = "C:\\Users\\zli011\\git\\swf\\swf\\output\\2.swf\\shapes\\72.svg";
		//String filename = "C:\\Users\\zli011\\git\\swf\\swf\\output\\24.swf\\shapes\\77.svg";

		//String filename = "C:\\Users\\zli011\\git\\swf\\swf\\output\\24.swf\\shapes\\151.svg";
		//String filename = "C:\\Users\\zli011\\git\\swf\\swf\\output\\24.swf\\shapes\\155.svg";
		//	String filename = "C:\\Users\\zli011\\git\\swf\\swf\\output\\24.swf\\shapes\\162.svg";
		//String filename = "C:\\Users\\zli011\\git\\swf\\swf\\output\\24.swf\\shapes\\169.svg";
		//String filename = "C:\\Users\\zli011\\git\\swf\\swf\\output\\24.swf\\shapes\\165.svg";
		//String filename = "C:\\Users\\zli011\\git\\swf\\swf\\output\\24.swf\\shapes\\170.svg";
		//String filename = "C:\\Users\\zli011\\git\\swf\\swf\\output\\24.swf\\shapes\\172.svg";
		//String filename = "C:\\Users\\zli011\\git\\swf\\swf\\output\\24.swf\\shapes\\174.svg";
		//String filename = "C:\\Users\\zli011\\git\\swf\\swf\\output\\24.swf\\shapes\\176.svg";
		//String filename = "C:\\Users\\zli011\\git\\swf\\swf\\output\\1.swf\\shapes\\85.svg";
		//String filename = "C:\\Users\\zli011\\git\\swf\\swf\\output\\1.swf\\shapes\\173.svg";
		//String filename = "C:\\Users\\zli011\\git\\swf\\swf\\output\\1.swf\\shapes\\191.svg";

		//String filename = "C:\\Users\\zli011\\git\\swf\\swf\\output\\1.swf\\shapes\\180.svg";
		//String filename = "C:\\Users\\zli011\\git\\swf\\swf\\swfreorg\\62.swf\\110.svg";
		String filename = "C:\\Users\\zli011\\git\\swf\\swf\\swfreorg\\922.swf\\109.svg";


		String md5 = "";
		try {
			md5 = MD5Checksum.getMD5Checksum(filename);
			System.out.println(md5);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 1; i < 999; i++) {
			filename = "C:\\Users\\zli011\\git\\swf\\swf\\swfreorg\\" + i
					+ ".swf";

			File[] files = listFiles(filename);
			//Arrays.sort(files, FruitNameComparator);
			for (int m = 0; m < files.length; m++) {
				try {
					String filemd5 = MD5Checksum.getMD5Checksum(files[m]
							.getCanonicalPath());
					if (filemd5.equalsIgnoreCase(md5)) {
						files[m].delete();
						System.out.println(i+":"+files[m].getName());
						break;
					}
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	private static void cleanupBatch() {
		String filename = "C:\\Users\\zli011\\git\\swf\\swf\\output\\1.swf\\shapes\\54.svg";
		//String filename2 = "C:\\Users\\zli011\\git\\swf\\swf\\output\\1173.swf\\shapes\\165.svg";
		String filename2 = "C:\\Users\\zli011\\git\\swf\\swf\\output\\651.swf\\shapes\\163.svg";
	String md5 = "";
		String md52 = "";
		try {
			md5 = MD5Checksum.getMD5Checksum(filename);
			System.out.println(md5);
			md52 = MD5Checksum.getMD5Checksum(filename2);
			System.out.println(md52);
			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 1; i < 1897; i++) {
			filename = "C:\\Users\\zli011\\git\\swf\\swf\\output\\" + i
					+ ".swf\\shapes";

			File[] files = listFiles(filename);
			Arrays.sort(files, FruitNameComparator);
			for (int m = 0; m < files.length; m++) {
				try {
					String filemd5 = MD5Checksum.getMD5Checksum(files[m]
							.getCanonicalPath());
					if (filemd5.equalsIgnoreCase(md5)) {
						//System.out.println(i + "=="+ files[m].getCanonicalPath());
						break;
					} else {
						files[m].delete();
						if(m== files.length){
						System.out.println(i + " not found");
						}
					}
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		ArrayList<Integer> al=new ArrayList<Integer>();
		for (int i = 1; i < 1897; i++) {
			filename = "C:\\Users\\zli011\\git\\swf\\swf\\output\\" + i
					+ ".swf\\shapes";
			int found=0;
			File[] files = listFiles(filename);
			Arrays.sort(files, FruitNameComparator);
			for (int m = 0; m < files.length; m++) {
				try {
					String filemd5 = MD5Checksum.getMD5Checksum(files[m]
							.getCanonicalPath());
					if (filemd5.equalsIgnoreCase(md52)) {
						//System.out.println(i + "=="+ files[m].getCanonicalPath());
						found=m;
						al.add(i);
					} else {
						
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(found>0){
				for(int n=found;n<files.length;n++){
					files[n].delete();
					System.out.println(i+files[n].getName());
				}
				
			}
			else{
				//System.out.println(i);
			}
		}
	}

	private static File[] listFiles(String pathname) {
		File folder = new File(pathname);
		File[] listOfFiles = folder.listFiles();

		
		    return listOfFiles;
	}

	public static Comparator<File> FruitNameComparator = new Comparator<File>() {

		public int compare(File fruit1, File fruit2) {

			String fruitName1 = fruit1.getName();
			String fruitName2 = fruit2.getName();

			
			return getFilenumber(fruitName1) - getFilenumber(fruitName2);

		}

	};
	public static int getFilenumber(String filename){
		return Integer.parseInt(filename.split("\\.")[0]);
	}
}
