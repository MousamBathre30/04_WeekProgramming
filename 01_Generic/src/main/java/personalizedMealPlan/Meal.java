package personalizedMealPlan;

import java.util.ArrayList;
import java.util.List;

class Meal<T extends MealPlan> {
    private List<T> meals = new ArrayList<>();

    public void addMeal(T meal) {
        meals.add(meal);
    }

    public void showMeals() {
        for (T meal : meals) {
            System.out.println(meal.getMealType());
        }
    }
}