package by.epam.module04.simple_class.task4;

import java.util.Arrays;
import java.util.Scanner;

/*Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время
отправления. Создайте данные в массив из пяти элементов типа Train, добавьте возможность
сортировки элементов массива по номерам поездов. Добавьте возможность вывода информации
о поезде, номер которого введен пользователем. Добавьте возможность сортировки массив
по пункту назначения, причем поезда с одинаковыми пунктами назначения должны быть
упорядочены по времени отправления*/

public class Main {
	
	public static void main(String[] args) {
		Train[] trains = new Train[5];
		
		trains[0] = new Train("Минск", 5, new DepartureTime(18,55));
		trains[1] = new Train("Анапа", 1, new DepartureTime(12,20));
		trains[2] = new Train("Минск", 4, new DepartureTime(2,27));
		trains[3] = new Train("Таллин", 3, new DepartureTime(1,15));
		trains[4] = new Train("Варшава", 2, new DepartureTime(14,40));
		
		sortByTrainNumber(trains);
		System.out.println(Arrays.toString(trains));
		
		showTrainInfoByTrainNumber(trains);
		
		sortByDestinationTime(trains);
		
		System.out.println(Arrays.toString(trains));
	}
	
	public static void sortByDestinationTime(Train[] trains) {
		boolean isChanged;
        
        for (int i = 0; i < trains.length - 1; i++) {
            isChanged = false;
            for (int j = 0; j < trains.length - i - 1; j++) {
                if (trains[j].getDestinationName()
                		.compareToIgnoreCase(trains[j + 1].getDestinationName()) > 0) {
                	Train buffer = trains[j];
                	trains[j] = trains[j + 1];
                	trains[j + 1] = buffer;                   
                    isChanged = true;
                }else if(trains[j].getDestinationName()
                		.compareToIgnoreCase(trains[j + 1].getDestinationName()) == 0) {
                	if(isAfter(trains[j].getDepartureTime(),trains[j + 1].getDepartureTime())) {
                		Train buffer = trains[j];
                    	trains[j] = trains[j + 1];
                    	trains[j + 1] = buffer;                   
                        isChanged = true;
                	}
                	
                }
            }
            if (!isChanged) {
                break;
            }
        }        
	}
	
	public static void sortByTrainNumber(Train[] trains) {
		boolean isChanged;
        
        for (int i = 0; i < trains.length - 1; i++) {
            isChanged = false;
            for (int j = 0; j < trains.length - i - 1; j++) {
                if (trains[j].getTrainNumber() > trains[j + 1].getTrainNumber()) {
                	Train buffer = trains[j];
                	trains[j] = trains[j + 1];
                	trains[j + 1] = buffer;                   
                    isChanged = true;
                }
            }
            if (!isChanged) {
                break;
            }
        }        
	}
	
	public static void showTrainInfoByTrainNumber(Train[] trains) {
		System.out.println("Введите номер поезда>>");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int numberOfTrain;
		int indexOfTrain;
		
		numberOfTrain = sc.nextInt();
		indexOfTrain = getFoundTrainIndex(trains,numberOfTrain);
		

		if (indexOfTrain>=0) {
			System.out.println("Номер поезда: "
						+ trains[indexOfTrain].getTrainNumber() + "\n" + "Пункт назначения: "
						+ trains[indexOfTrain].getDestinationName() + "\n" + "Время отправления: "
						+ trains[indexOfTrain].getDepartureTime());			
		} else {
			System.out.println("Нет такого поезда");
		}
	}
	
	
	
	
	private static int getFoundTrainIndex(Train[] trains, int trainNumber) {
		for(int i = 0; i< trains.length;i++) {
			if(trains[i].getTrainNumber() == trainNumber) {
				return i;
			}
		}
		return -1;
	}
	
	private static boolean isAfter(DepartureTime firstValue, DepartureTime secondValue) {
		if(firstValue.getHours()>secondValue.getHours()) {
			return true;
		}else if(firstValue.getHours()==secondValue.getHours()) {
			if(firstValue.getMinutes()>secondValue.getMinutes()) {
				return true;
			}
		}
		return false;
	}
	
	
	
}
