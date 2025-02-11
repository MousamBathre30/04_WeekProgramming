package personalizedMealPlan;

public class MealPlanApp {
    public static void main(String[] args) {
        // Generate different meal plans
        Meal<VegetarianMeal> vegetarianPlan = MealPlanGenerator.generateMealPlan(new VegetarianMeal());
        Meal<VeganMeal> veganPlan = MealPlanGenerator.generateMealPlan(new VeganMeal());
        Meal<KetoMeal> ketoPlan = MealPlanGenerator.generateMealPlan(new KetoMeal());
        Meal<HighProteinMeal> highProteinPlan = MealPlanGenerator.generateMealPlan(new HighProteinMeal());

        // Display meal plans
        System.out.println("Your Personalized Meal Plans:");
        vegetarianPlan.showMeals();
        veganPlan.showMeals();
        ketoPlan.showMeals();
        highProteinPlan.showMeals();
    }
}
