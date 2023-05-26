class Salmon extends Chitato{

int hargaper;

private String size,kategor,kandungan;
private String type = "Dengan Khas Rempah Salmon Asli Menggoda";
String manfaat = "Dengan Manfaat Meningkatkatkan Moot dan Optimisme karna rasanya yang lezat dan gurih";

   public Salmon(String merek, String nama, String kategor, String size, int hargaper, String kandungan){
       super(nama, merek);
       this.hargaper = hargaper;
       this.kategor = kategor;
       this.size = size;
       this.kandungan = kandungan;      
   }

   @Override
   public void kategori(){
       super.display();
       System.out.println(this.nama+" Chitato kategori , ( "+this.kategor+" ) size "+"( "+this.size+" )"+" seharga "+this.hargaper);
       System.out.println("-------------------------------------------------------------------------------");
       System.out.println("");
       System.out.print("Kategori Barang  >> ");
       System.out.println(this.kategor);
       System.out.print("Harga per unit   >> ");
       System.out.println(this.hargaper);
       System.out.println("");
       System.out.println("100% "+this.kandungan+this.type);

   }
}
    