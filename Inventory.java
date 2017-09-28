import java.util.*;

public class Inventory extends Player {
	// void Song()
	// {

	static String directorName;
	static String album;
	int price;
	int numberOfShares;

	public Inventory(String directorName, String album2, int Price, int numberShares) {
		// TODO Auto-generated constructor stub
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

	// super();
	public void Music1(String directorName, String album, int price, int numberOfShares) {
		// super();
		Inventory.directorName = directorName;
		String albumName = null;
		// this.setAlbum(albumName);
		this.price = price;
		this.numberOfShares = numberOfShares;
	}
	/*
	 * public String getAlbum() { return album; }
	 */

	// public void setAlbum(String album) {
	// this.album = album;
	// }
	public static class MusicAlbum {

		private static final int INVENTORY_SIZE = 1;
		// private static Music Music = null;
		// private static String console;
		// private static int price;
		private static Scanner s;

		public MusicAlbum() {

		}

		public static void main1() {
			// getalbum();
			for (int i = 0; i < INVENTORY_SIZE; i++) {
				// Scanner console = new Scanner(System.in);

				System.out.println("director name:");
				Scanner console = new Scanner(System.in);
				// console = "0";
				String directorName = console.next();
				System.out.println("album");
				String album = console.next();

				System.out.println(" price:");
				int price = console.nextInt();
				System.out.println("Numbers of shares: ");
				int numberShares = console.nextInt();

				// int numberShares = 0;
				Inventory Music = new Inventory(directorName, album, price, numberShares);
			}
		}

		public static void main(String[] args) {

			{
				// String s1 = "song";
				String s2 = "melodies";
				s = new Scanner(System.in);
				while (true) {
					System.out.println("music store");
					MusicAlbum m = new MusicAlbum();
					MusicAlbum.main1();
					System.out.println("Choose 1 for melodies:");
					System.out.println("Choose 2 for classic:");
					System.out.println("Choose 3 for fast:");
					System.out.println("Choose 4 for EXIT:");
					System.out.print("Choose the operation you want to perform:");
					int n = s.nextInt();
					switch (n) {
					case 1:
						// System.out.print("Enter melodies:-");
						System.out.println("Please view melodies");
						System.out.println(" melodie:1");
						System.out.println(" melodies:2");
						System.out.println(" melodie :3");

						/*
						 * if(s1 == s2) {
						 * 
						 * System.out.println("Please view melodies"); } else {
						 * System.out.println("Incorrect choice"); }
						 */
						System.out.println("");
						break;

					case 2:
						System.out.print("Enter 2 for classic :");
						s2 = s.toString();

						System.out.println("You selected classicmusic");
						System.out.println("");
						break;

					case 3:
						System.out.println("fastbeat:");
						System.out.println("");
						break;

					case 4:
						System.exit(0);
					}
				}
			}
				//Player p = new Player();
				addItemInv("lyric");
				PrintInv();
				removeItemFromInv("aa");
			
		}

		private static void Music() {
			// TODO Auto-generated method stub

		}

	}

}
