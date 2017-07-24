import java.util.Scanner;

public class Controller {

    int i = 0;
    int state;
    TuringMachine band;
    
    private final Scanner scanner = new Scanner(System.in);
    TuringMachine tape = new TuringMachine(i);
    int pos = 0;
    
    
    public void run() {
    	
    	band.tape = fillTape();
    	System.arraycopy(band, 0, tape, 0, band.getSize());
    	printTape();
    	
    }


    public void setSize() {

    	i = scanner.nextInt();
        System.out.println("set band size: " + i);
        
    }
    
    private TuringMachine fillTape(){
    	System.out.print("Input the Tape: ");
    	String input = scanner.toString();
    	TuringMachine band = new TuringMachine(input.toCharArray().length);
    	return band;
    }
    
    public void printTape(){
    	for(i=0; i < this.tape.getSize(); i++){
    		System.out.print(tape.get(i));
    	}
    	System.out.println("");
    	
    }
    	
    	

    
    public int process_state(int state)
    {

    	int next_state = state;
        switch(next_state)
        {
            case 1:
            	if(tape.get(pos) == 0){
            		tape.set(pos, (char) 0);	
            	}
            	else if(tape.get(pos) == 1){
            		tape.set(pos,(char) 0);	
            	}
            	next_state = 2;
            break;

            case 2:
            	if(tape.get(pos) == 0){
            		tape.set(pos, (char) 0);
            	}
            	else if(tape.get(pos) == 1){
            		tape.set(pos,(char) 1);	
            	}
            	next_state = 3;
            break;

            case 3:
            	if(tape.get(pos) == 0){
            		tape.set(pos, (char) 1);
            	}
            	else if(tape.get(pos) == 1){
            		tape.set(pos,(char) 1);	
            	}
            	next_state = 4;
            break;

            case 4:
            	if(tape.get(pos) == 0){
            		tape.set(pos, (char) 0);	
            	}
            	else if(tape.get(pos) == 1){
            		tape.set(pos,(char) 1);	
            	}
            	next_state = 5;
            break;

            case 5:
            	tape.set(pos, (char) 0);	
            	next_state = 6;
            break;
            
            case 6:
        		tape.set(pos, (char) 1);
        		System.out.println("ENDE POLENTE");
            break;
            
            default:
            System.out.println("Undefined state");
            break;
        }
        return next_state;
    }
}


    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

