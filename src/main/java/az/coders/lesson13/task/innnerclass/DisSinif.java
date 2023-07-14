package az.coders.lesson13.task.innnerclass;

public class DisSinif {

     class IcSinif{
        public void icSinifMetodu(){
            System.out.println("Ic Sinif Metodu");
        }
    }

    public static void main(String[] args) {
        DisSinif disSinif = new DisSinif();
        disSinif.new IcSinif().icSinifMetodu();
    }
}
