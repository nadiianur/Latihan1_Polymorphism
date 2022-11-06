public class VirtualDemo {
    public static void main(String [] args){

        /*s merupakan obj yang akan dibuat pada Class Gaji, dengan menggunakan 
        constructor "new Gaji ()" yang dimana akan dimasukkan nilai dari variable yang ada
        pada Class Gaji menggunakan obj s tadi. Varial yang dimuat yaitu 
        variable nama, address, number, dan salary.
        Nilai variable ini akan di masukkan pada nilai variable yang ada di Super Class
        */
        Gaji s = new Gaji("Wahyu", "KUBAR", 3, 5000.00);

        /*Upcasting
        Melakukan proses pengubahan referensi Child Class ke Super Class
        Menggunakan obj e untuk menyimpan nilai dari class gaji
        Membuat obj Pegawai. e merupakan obj yang akan dibuat pada Class Pegawai, 
        */
        Pegawai e = new Gaji("ini nama", "Samarinda", 2 , 2500.00);
        
        //Keluaran "Memanggil mailCheck berdasarkan referensi gaji ---"
        //Dan memanggil method mailCheck pada obj s yang merupakan obj yang ada pada Class gaji
        System.out.println("Memanggil mailCheck berdasarkan referensi gaji ---");
        s.mailCheck();
       
        //Keluaran "Memanggil mailCheck berdasarkan referensi pegawai ---"
        //Dan memanggil method mailCheck pada obj e yang merupakan obj yang ada pada Class pegawai
        System.out.println("\nMemanggil mailCheck berdasarkan referensi pegawai---");
        e.mailCheck();
    }
    
}
