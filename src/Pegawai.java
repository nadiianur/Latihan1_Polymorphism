//Class pegawai sebagai Parent class / Super Class
public class Pegawai{
    //Deklarasi variable class pegawai
    //Variable ini nantinya dapat digunakan pada Child Class / Sub Class
    private String name;    
    private String address; 
    private int number;     

    //Class Constructor 
    //Membuat obj dan mengkonfigurasikannya
    public Pegawai (String name, String address, int number){
        //Mengisi nilai variable
        this.name = name;
        this.address = address;
        this.number = number;
        //Keluaran "menyusun pegawai"
        System.out.println("Menyusun pegawai");
    }

    //Deklarasi Method Class Pegawai
    //Method ini nantinya dapat di akses pada Child Class / Sub Class
    public void mailCheck(){
        System.out.println("Memeriksa surat untuk " + this.name + " " + this.address);
    }

    //Mengembalikan nilai hasil sebagai String 
    public String toString(){
        return name + " " + address+ " "+ number;
    }

    //Method untuk mengembalikan nilai pada variable name
    public String getName(){
        return name;
    }

    //Method untuk mengembalikan nilai pada variable address (mengakses)
    public String getAddress(){
        return address;
    }

    //Method untuk mengisi nilai ke variable address
    public void setAddress(String newAddress){
        address= newAddress;
    }
    
    //Method untuk mengembalikan nilai pada variable number (mengakses)
    public int getNumber(){
    return number;
    }
} 
    
