// "Exercise_1_Food_Basket, Ready for Marking"

public class Main
{
    public static void main(String[] args)
    {
        Food[] picnicBasket = new Food[4];
        picnicBasket[0] = new Food("Banana", "fruit");
        picnicBasket[1] = new Food("Steak", "meat");
        picnicBasket[2] = new Food("Spinach", "vegetable");
        picnicBasket[3] = new Food("Apple", "fruit");

        for (int i = 0; i < picnicBasket.length; i++)
        {
            Food food = picnicBasket[i];
            if (food.getType().equals("vegetable"))
            {
                System.out.println(food.denyIt());
            }
            else
            {
                System.out.println(food.eatIt());
            }
        }
    }
}
