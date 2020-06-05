package by.epam.module04.agregation_komposition.task5;

public enum FoodForm {

    AI("All inclusive"), FB("Full board"), HB("Half board"), BB("Bed & breakfast"), WF("Without Food");

    String foodForm;

    FoodForm(String foodForm) {
        this.foodForm = foodForm;
    }
}
