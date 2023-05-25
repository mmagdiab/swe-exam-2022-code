package core;

// 3. Chain of Responsibility
public class Chain {
    Processor chain;

    public Chain(){
        buildChain();
    }

    private void buildChain(){
        chain = new ProcessMonth(new ProcessDay(null));
    }

    public void process(DateTime dateTime) {
        chain.process(dateTime);
    }
}

abstract class Processor {
    private Processor nextProcessor;

    public Processor(Processor nextProcessor){
        this.nextProcessor = nextProcessor;
    };

    public void process(DateTime dateTime){
        if(nextProcessor != null)
            nextProcessor.process(dateTime);
    };
}

class ProcessMonth extends Processor {

    public ProcessMonth(Processor nextProcessor) {
        super(nextProcessor);
    }

    @Override
    public void process(DateTime dateTime) {
        if (dateTime.month <= 0 || dateTime.month > 12) {
            System.out.println("Error month.");
        } else {
            super.process(dateTime);
        }
    }
}

class ProcessDay extends Processor {

    public ProcessDay(Processor nextProcessor) {
        super(nextProcessor);
    }

    @Override
    public void process(DateTime dateTime) {
        if (dateTime.day <= 0 || dateTime.day > 31) {
            System.out.println("Error day."); // Throw new RunTimeError("Invalid Day");
            throw new RuntimeException("Invalid day");
        } else {
            super.process(dateTime);
        }
    }
}