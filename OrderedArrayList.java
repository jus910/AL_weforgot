import java.util.ArrayList;

public class OrderedArrayList{
    private ArrayList<Integer> _data;
    private int _size;

    public OrderedArrayList() {
        _data = new ArrayList<Integer>();
        _size = 0;
    }

    public boolean compare(int index, int input) {
        if (index == 0) {
            return (input <= _data.get(index));
        } 
        else {
            return 
            _data.get(index - 1) <= input && 
            input <= _data.get(index);
        }
    }

    public boolean add(int input){
        for(int index = 0; index < _size; index++) {
            if (compare(index, input)) {
                _data.add(index, input);
                _size++;
                return true;
            }
        }
        _data.add(input);
        _size++;
        return true;
    }

    //output OrderedArrayList in [a,b,c] format
    public String toString() {
        String output = "[";

        for (int index = 0; index <_size; index++) {
            output += _data.get(index);
            output += ",";
        }
        //shave off trailing comma
        if (output.length() > 1) {
            output = output.substring(0, output.length() - 1);
        }
        output += "]";
        return output;
    }

    public int size() {
        return _size;
    }

    public int get(int index) {
        return _data.get(index);
    }

    public int set(int index, int input){
        int output = _data.get(index);

        if (compare(index, input)) {
            _data.set(index, index);
        } 
        else {
            System.out.println("Could not set number: change would ruin ascending order");
        }

        return output;
    }

    public int remove(int index) {
        int output = _data.get(index);
        _data.remove(index);
        _size--;

        return output;
    }

    public static void main(String[] args) {
        OrderedArrayList bob = new OrderedArrayList();

        bob.add(1);
        System.out.println(bob);

        bob.add(5);
        System.out.println(bob);

        bob.add(3);
        System.out.println(bob);

        bob.add(0);
        System.out.println(bob);

        bob.add(4);
        System.out.println(bob);

        bob.set(1, 6);
        System.out.println(bob);

        bob.remove(4);
        System.out.println(bob);
    }
}
