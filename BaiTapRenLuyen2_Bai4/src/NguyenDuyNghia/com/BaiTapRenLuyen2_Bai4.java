package NguyenDuyNghia.com;

import java.util.Scanner;

public class BaiTapRenLuyen2_Bai4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Moi ban nhap 1 chuoi:");
		String str=new Scanner(System.in).next();
		int soKTInHoa=demInHoa(str);
		int soKTInThuong=demInThuong(str);
		int soChuSo=demChuSo(str);
		int soKTDacBiet=demKTDacBiet(str);
		int soKhoangTrang=demKhoangTrang(str);
		System.out.println("Chuoi "+str+" vua nhap gom co:"
				+"\n\t+ "+soKTInHoa+" ki tu in hoa"
				+"\n\t+ "+soKTInThuong+" ki tu in thuong"
				+"\n\t+ "+soChuSo+" chu so"
				+"\n\t+ "+soKTDacBiet+" ki tu dac biet"
				+"\n\t+ "+soKhoangTrang+" khoang trang");
		demNguyenAmPhuAm(str);
	}
	
	
	
	/**
	 * Dem ki tu dac biet
	 * @param s
	 * @return
	 */
	static int demKTDacBiet	(String s)
	{
		int soKTDacBiet=0;
		for(int i=0;i<s.length();i++)
		{
			char kt=s.charAt(i);
			if(!Character.isUnicodeIdentifierPart(kt))
			{
				soKTDacBiet++;
			}

		}
		return soKTDacBiet;
	}
	
	/**
	 * Dem ki tu in hoa
	 * @param s
	 * @return
	 */
	static int demInHoa(String s)
	{
		int soKTInHoa=0;
		for(int i=0;i<s.length();i++)
		{
			char kt=s.charAt(i);
			if(Character.isUpperCase(kt))
			{
				soKTInHoa++;
			}

		}
		return soKTInHoa;
	}
	
	/**
	 * Dem ki tu in thuong
	 * @param s
	 * @return
	 */
	static int demInThuong(String s)
	{
		int soKTInThuong=0;
		for(int i=0;i<s.length();i++)
		{
			char kt=s.charAt(i);
			if(Character.isLowerCase(kt))
			{
				soKTInThuong++;
			}

		}
		return soKTInThuong;
	}
	
	
	
	/**
	 * Dem ki tu so
	 * @param s
	 * @return
	 */
	public static int demChuSo(String s)
	{
		int soChuSo=0;
		for(int i=0;i<s.length();i++)
		{
			char kt=s.charAt(i);
			if(Character.isDigit(kt))
			{
				soChuSo++;
			}

		}
		return soChuSo;
	}
	
	/**
	 * Dem khoang trang
	 * @param s
	 * @return
	 */
	public static int demKhoangTrang(String s)
	{
		int soKhoangTrang=0;
		for(int i=0;i<s.length();i++)
		{
			char kt=s.charAt(i);
			if(Character.isWhitespace(kt))
			{
				soKhoangTrang++;
			}

		}
		return soKhoangTrang;
	}
	
	
	/**
	 * Dem nguyen am va Phu am
	 * @param s
	 * @return
	 */
	static void demNguyenAmPhuAm(String s)
	{
		int soNguyenAm=0;
		int soPhuAm=0;
		for(int i=0;i<s.length();i++)
		{
			char kt=s.charAt(i);
			if(Character.isLetter(kt))
			{
				if(kt=='e'||kt=='u'||kt=='a'||kt=='o'||kt=='i'||kt=='A'||kt=='U'||kt=='E'||kt=='I'||kt=='O')
				{
					soNguyenAm++;
				}
				else
				{
					soPhuAm++;
				}
			}

		}
		System.out.println("\t"+soNguyenAm+" ki tu nguyen am"
				+"\n\t+ "+soPhuAm+" ki tu phu am");
		
	}

}
