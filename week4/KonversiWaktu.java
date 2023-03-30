import java.util.Scanner;
public class KonversiWaktu {
     public static void main(String[] args) {
        String jwb="Y";
        Scanner input = new Scanner(System.in);

        int hari,jam,menit,detik,konversi;
     do{  
        System.out.print("Detik           : ");
        konversi=input.nextInt();

        hari=konversi/86400;
		jam=(konversi % 86400)/3600;
		menit=((konversi % 86400)%3600)/60;
		detik=((konversi % 86400)%3600)%60;

    
        
        System.out.println("Hari		: "+hari);
		System.out.println("Jam		: "+ jam);
		System.out.println("Menit		: "+menit);
		System.out.println("Detik		: "+detik);
        System.out.print("Jawab [Y/T] : ");
		jwb=input.next();
        } while(jwb.equalsIgnoreCase("Y"));

    }
}
