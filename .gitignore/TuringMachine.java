public class TuringMachine {

public char[] tape;

public TuringMachine(int pos) {
    this.tape = new char[pos];
}

    public void set(int pos, char node) {
        this.tape[pos] = node;
    }

    public double get(int pos) {
        return this.tape[pos];
    }

    public int getSize() {
        return this.tape.length;
    }
    public int moveleft(int pos){
    	pos --;
    	return pos;
    	
    }
    public int moveright(int pos){
    	pos ++;
    	return pos;
    }
}
