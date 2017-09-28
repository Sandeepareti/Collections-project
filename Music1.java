

	import java.util.*;

	public class Music1 {

		static String directorName;
		static String album;
		int price;
		int numberOfShares;

		public Music1(String directorName, String album2, int Price, int numberShares) {

		}

		public String getCompanyName() {
			return directorName;
		}

		public static String getalbum() {
			String album = "0";
			return album;
		}

		public int getPrice() {
			return price;
		}

		public int getNumberOfShares() {
			return numberOfShares;
		}

		

		public static class MusicAlbum {
					
			public static void main(String[] args) {

				{
					
					String dr = "";
					String al = "";
					String hr = "";
					Scanner in = new Scanner(System.in);
					System.out.println("music store");
					
					while (true) {
						 
						
						System.out.println("Choose 1 for View:");
						System.out.println("Choose 2 for Add:");
						System.out.println("Choose 3 for remove:");
						System.out.print("Choose the operation you want to perform:");
						int n = in.nextInt();

						switch (n) {
						case 1:
							System.out.println("list of views in store:-");
							
							System.out.println("1: melodies");
							System.out.println("2: Classic");
							System.out.println("3: Fastbeat");

							
							System.out.println("");
							

							break;

						case 2:

							System.out.println("Enter Directorname :");
							dr = in.next();
							System.out.println("enter album");
							al = in.next();
							System.out.println("enter Hero name");
							hr = in.next();
							System.out.println("u have entered:");
							System.out.println("{" + dr + "," + al + "," + hr + "}");
							break;

						case 3:

							System.out.println("Enter String what u want to delete");
							String str1 = in.next();
							if (dr.equals(str1)) {
								dr = "";
							} else if (al.equals(str1)) {
								al = "";
							} else if (hr.equals(str1)){
								hr = "";
							}else 
								System.out.println("entered string is invalid");
							
							System.out.println("After removing the string");
							System.out.println(dr + "  " + al + "  " + hr);
							break;
						
						}

					}
				}
				
				

			}
		}

	}


