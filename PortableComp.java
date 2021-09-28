public class PortableComp extends ComputerImpl {
    private Display display;
    private Keyboard keyboard;

    @Override
    public String toString(){
        return (getMaker()+" "+getModel()+"  "+getCPU()+" "+getRAM()+" "+getHDD()+"; "+getDisplay().toString()+", "+getKeyboard().toString()+".");
    }



    public PortableComp(String maker,String model,String CPU,String RAM,String HDD, Display display,Keyboard keyboard){
        super(maker,model,CPU,RAM,HDD);
        this.setKeyboard(keyboard);
        this.setDisplay(display);
    }






    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }
}
