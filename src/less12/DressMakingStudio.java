package less12;

public class DressMakingStudio {

    public void dressMale(Clothes[] clothes){
        System.out.println("Чоловіча одежа: " );
        for (Clothes c : clothes){
            if(c instanceof MaleClothes){
                System.out.println(c);
            }
        }
    }
    public void dressFemale(Clothes[] clothes){
        System.out.println("Жіноча одежда: ");
        for (Clothes c : clothes){
            if (c instanceof  FemaleClothes){
                System.out.println(c);
            }
        }
    }
}
