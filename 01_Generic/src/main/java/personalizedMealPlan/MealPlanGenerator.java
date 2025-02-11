package personalizedMealPlan;

class MealPlanGenerator {
    public static <T extends MealPlan> Meal<T> generateMealPlan(T meal) {
        Meal<T> mealPlan = new Meal<>();
        mealPlan.addMeal(meal);
        return mealPlan;
    }
}
