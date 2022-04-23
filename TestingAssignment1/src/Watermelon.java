public class Watermelon {
    public boolean isEven(int weight){
        if ( weight <= 0)
            throw new IllegalArgumentException("Weight must be greater than 0!");
        if (weight % 2==0 && weight != 2)
            return true;
        else
            return false;
    }
}
