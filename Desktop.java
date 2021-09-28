public class Desktop extends TableComputer{
    private String Video;

    @Override
    public String toString(){
        return(getMaker()+" "+getModel()+"; "+getCPU()+", "+getRAM()+", "+getHDD()+"; "+getVideo()+".");
    }



    public Desktop(String maker,String model,String CPU,String RAM,String HDD,String video){
        super(maker, model, CPU, RAM, HDD);
        this.setVideo(video);

    }



    public String getVideo() {return Video;}
    public void setVideo(String video) {this.Video = video;}
}
