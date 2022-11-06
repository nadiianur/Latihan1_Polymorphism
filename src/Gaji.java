//Class gaji sebagai Child class / Sub Class
//Turunan dari Class Pegawai, jadi penggunakan perintah extends 

public class Gaji extends Pegawai {
    //Variable gaji tahunan
    //Variable yang hanya dimiliki oleh Child Class Gaji

    private double salary;

    //Class Constructor 
    //Membuat obj dan mengkonfigurasikannya
    public Gaji(String name, String address, int number, double salary) {
       //Menggunakan method super untuk meng-construct variable pada super Class
       super (name, address, number); //Mengambil variable yang ada pada Parent Class / Supeer Class
       setSalary (salary); //Untuk mengisi nilai ke variable salary
   }

   //Method yang diturunkan dari Parent Class / Super Class
   //Output dari method mailCheck yang ada di Class Gaji akan ditampilkan ketika dia dipanggil pada file VirtualDemo
   public void mailCheck(){
       System.out.println("Memeriksa kelas gaji dalam surat"); //Keluaran "Memeriksa kelas gaji dalam surat"
       System.out.println("Surat tertuju untuk " + getName () + " dengan gaji " + salary); // Keluaran "Surat tertuju untuk " + getName () + " dengan gaji "
   }

   //Method untuk mengembalikan(mengambil) nilai pada variable salary
   public double getSalary (){
     return salary;
   }

   //Method yang digunakan untuk mengisi nilai ke variable salary
   //Jika nilai dari variable newSalary besar sama 0.0
   //Maka nilai dari variable salary sama dengan variable newSalary
   public void setSalary (double newSalary){
       if (newSalary >= 0.0) {
           salary = newSalary;
       }
   }

   //Method yang digunakan untuk menghitung pembayaran gaji karyawan
   //Pembayaran gaji disini akan mengembalikan nilai dalam variable salary yang nantinya dibagi 52
   public double computePay(){
       System.out.println("Menghitung pembayaran gaji untuk " + getName());
       return salary/52;
   }

}
