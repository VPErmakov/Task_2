public class Display {
    private String lenDiagonal;
    private String resolution;

    public Display(String lenDiagonal,String resolution){
        this.lenDiagonal = lenDiagonal;
        this.resolution = resolution;
    }

    @Override
    public String toString(){
        return(getLenDiagonal()+","+getResolution());
    }




    public String getLenDiagonal() {
        return lenDiagonal;
    }

    public void setLenDiagonal(String lenDiagonal) {
        this.lenDiagonal = lenDiagonal;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }
}
