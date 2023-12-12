package Datestring;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

	class main {
	    private static List<Item> cart = new ArrayList<>();

	    public static void main(String[] args) {
	    	Scanner scanner = new Scanner(System.in);
	        System.out.println("SELAMAT DATANG DI ...Supermarket Muayyadillah");
	        System.out.println("_____________________________________________");
	        System.out.println("Login dulu Breh");
	        System.out.print("Masukan nama   : ");
	        String username = scanner.nextLine();
	        System.out.print("Isikan Pasword   : ");
	        String password = scanner.nextLine();
	        
	        System.out.println("A2Wer");
	        String captcha = scanner.nextLine();

	        if (!captcha.equals(captcha)) {
	            System.out.println("Kode Captcha yang dimasukkan salah");
	            System.exit(1);
	        }

	        if (!password.equals("Ab21")) {
	            System.out.println("Pasword yang dimasukkan salah");
	            System.exit(1);
	        }

	        System.out.println("Selamat datang " + username);
	        LocalDateTime now = LocalDateTime.now();
		        System.out.println("__________________________");
      
            String n = "true";
            Integer hargaBarang = 0;
            Integer jumlahBarang = 0;
            while (n.equals("true")) {
                boolean input = false;
                Scanner  saya  = new Scanner(System.in);
                Scanner integer = new Scanner(System.in);
                System.out.print("Nama Barang      : ");
                String namaBarang = saya.next();

                do {
                    try {
                        System.out.print("Harga Barang     : ");
                        hargaBarang = integer.nextInt();
                        input = true;
                    } catch (InputMismatchException e) {
                        System.out.println("Input yang dimasukkan bukan bilangan bulat.");
                        integer.next();
                    }
                } while (!input);
                input = false;
                do {
                    try {
                        System.out.print("Jumlah Barang    : ");
                        jumlahBarang = integer.nextInt();
                        input = true;
                    } catch (InputMismatchException e) {
                        System.out.println("Input yang dimasukkan bukan bilangan bulat.");
                        integer.next();
                    }
                } while (!input);

                Penjualan penjualan = new Penjualan(namaBarang, hargaBarang, jumlahBarang);

            }

    
    }
}

