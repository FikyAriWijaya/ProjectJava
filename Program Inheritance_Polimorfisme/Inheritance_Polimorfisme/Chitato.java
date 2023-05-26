
class Chitato{

        protected String nama;
        protected String merek;

        public Chitato (String nama, String merek){
                
                this.nama = nama;
                this.merek = merek;
        }

        public void kategori(){
                System.out.println("--- Masukan Kategori ---");
        }

        public void display(){
                System.out.println("-------       -------");
                System.out.println("");
                System.out.println("Jenis = "+this.nama);
                System.out.println("Merek = "+this.merek);
                System.out.println("");
                System.out.println("-------       -------");
                System.out.println("");
        }

}
