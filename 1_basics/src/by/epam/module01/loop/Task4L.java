package by.epam.module01.loop;

/*Составить программу нахождения произведения квадратов первых двухсот чисел.*/

public class Task4L {

    public static long getProductOfSquares(long inputValue) {
        long outProduct = 1L;
        long maxLong = 0x7fffffffffffffffL;
        
        for (long i = 1; i <= inputValue ; i++) {
        	long innerProduct;
        	long intermediateValue;
        	
        	innerProduct = i*i;
        	intermediateValue = outProduct * innerProduct;
        	if (intermediateValue<0 ) {
				System.out.println("Произведение квадратов первых N чисел с переменной типа long возможно если N<"+i);
				return outProduct;
			}
        	outProduct =intermediateValue;
        }
        return outProduct;
    }
    
    
    public static void main(String[] args) {
		System.out.println(getProductOfSquares(200));
	}

}
