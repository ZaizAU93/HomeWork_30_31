package Facade;

public class Dish {

    public void cookDish(){
        Ingredient_1.addIngredient();
        Ingredient_2.addIngredient();
        Ingredient_3.addIngredient();
        System.out.println("Блюдо готово!");
    }

}
