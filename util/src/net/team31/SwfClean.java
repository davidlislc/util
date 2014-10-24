package net.team31;

import java.io.File;
import java.io.FileNotFoundException;

public class SwfClean {
	public static Integer[] svgrepeatnumgers = { 1, 4, 5, 7, 36, 37, 38 };
	public static String[] svgmd5s = { "1a9abc938c7f2ecf6e9aa8281a2b9eb8",
			"3252464616e307e7718d080b2908b48d",
			"9e82c8c0c02454d679f8a3b00288b076",
			"f2751f3d1f5e2c748c7812fe20459e7f",
			"9d72aeabac1e139cd95ea1f6381e5900",
			"25b16c85245ea0baa3383edea39677a9",
			"8a3c24f2fdab4d8fd0c8ad8f1d12e35e" };
	public static Integer[] pngrepeatnumgers = { 1, 4, 5, 7, 36, 37, 38 };
	public static String[] pngmd5s = { "3b7047a8164daafc9de9afc1de2d9f64",
			"9624a7c64157e5a6f97821af67eccb7e",
			"5cc813f8477d80604724796ca39fea94",
			"36dcc8fd2e83a4690d260c2936253da7",
			"403f5cd1b775c874417fe13ce864f40f",
			"0a1b6846f2f6466bb79da713191b9cb5",
			"f91298550bcdee5b0200372aea467118" };

	public static void main(String[] args)  {
		
		String filename = null;
		String md5=null;
/*		for (int i = 1; i < 1897; i++) {
			for (int m =0;m< svgrepeatnumgers.length;m++) {
				filename = "c:\\swf\\output\\" + i + ".swf\\shapes\\" + svgrepeatnumgers[m]
						+ ".svg";
				 try {
					md5 = MD5Checksum.getMD5Checksum(filename);
					//System.out.println(filename+"--"+md5);
					if(md5.equalsIgnoreCase(svgmd5s[m])){
						System.out.println("delete");
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
		}*/
		for (int i = 1; i < 1897; i++) {
			for (int m =0;m< svgrepeatnumgers.length;m++) {
				filename = "c:\\swf\\pngoutput\\" + i + ".swf\\shapes\\" + pngrepeatnumgers[m]
						+ ".png";
				 try {
					md5 = MD5Checksum.getMD5Checksum(filename);
					//System.out.println(filename+"--"+md5);
					if(md5.equalsIgnoreCase(pngmd5s[m])){
						//System.out.println("delete");
					}
				} catch (Exception e) {
					System.out.println(filename);
					// TODO Auto-generated catch block
					//e.printStackTrace();
				}
				
				
			}
		}
	}

}
