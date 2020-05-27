package by.epam.module04.agregation_komposition.task3;

/*Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
столицу, количество областей, площадь, областные центры*/

public class Main {

    public static void main(String[] args) {
        City city = new City("Минск", 1);
        City city1 = new City("Гродно", 2);
        City city2 = new City("Могилев", 3);
        City city3 = new City("Шклов", 4);
        City city4 = new City("Жодино", 5);
        City city5 = new City("Нем", 6);
        City city6 = new City("Лова", 7);
        City city7 = new City("Карт", 8);
        City city8 = new City("Про", 9);
        City city9 = new City("Это", 10);
        City city10 = new City("Валар", 11);
        City city11 = new City("Сева", 12);
        City city12 = new City("Хозеп", 13);
        City city13 = new City("Локх", 14);
        City city14 = new City("Пум", 15);

        District district = new District(city3, new City[]{city8, city9});
        District district1 = new District(city4, new City[]{city7, city10});
        District district2 = new District(city5, new City[]{city11, city12});
        District district3 = new District(city6, new City[]{city13, city14});

        Region region = new Region(city1, new District[]{district, district1});
        Region region1 = new Region(city2, new District[]{district2, district3});

        State state = new State(city, new Region[]{region, region1});

        StateService stateService = new StateService(state);

        stateService.showArea();
        stateService.showCapital();
        stateService.showNumberOfRegions();
        stateService.showRegionalCityNames();
    }



}
