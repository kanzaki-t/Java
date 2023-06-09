package obj8_polymorphism.lv2;

/**
 * ClassName: PetTest
 * Package: obj8_polymorphism.lv2
 * Description:
 * <p>
 * Author: Kanzaki
 * Create: 2023/05/05-13:37
 */
public class PetTest {
    public static void main(String[] args) {
        PetTest test = new PetTest();

        test.showPet(new Dog(),new Cat(),new Dog());
    }

    public void showPet(Pet...pet){
        for (int i = 0; i < pet.length; i++) {
            pet[i].view();
            pet[i].act();

            if(pet[i] instanceof Dog d){
                d.eat();
            }else if(pet[i] instanceof  Cat c){
                c.eat();
            }
            System.out.println();
        }
    }
}
