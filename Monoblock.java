public class Monoblock extends TableComputer{
    private Display display;

    public Monoblock (String maker,String model,String CPU,String RAM,String HDD,Display display){
        super(maker, model, CPU, RAM, HDD);
        this.setDisplay(display);

    }
    @Override
    public String toString(){
        return (getMaker()+", "+getModel()+"; "+getCPU()+", "+getRAM()+", "+getHDD()+"; "+getDisplay().toString()+".");
    }




    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }
}
