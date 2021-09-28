import java.security.Key;
public class Main {
    public static void main(String[] args){
        ComputerImpl computer[] = new ComputerImpl[6];
        computer[0] = new Desktop("MSI","DRAGON","Intel Core i3-10105F 3,7 МГц","8ГБ DDR4","480ГБ SSD","GeForce GTX 1650");
        computer[1] = new Laptop("DIGMA","DIGMA Eve 14 C411","Intel Celeron N3350 2x1,1МГц","4Гб","SSD 128Гб",new Display("14'","1920x1080"),new Keyboard("membran",113,"Russian,English,French"));
        computer[2] = new Netbook("DIGMA","DIGMA EVE 11 C409","Intel Celeron N3350 2x1100 МГц","4Гб","SSD 64 Гб",new Display("11.6'","1920x1080"),new Keyboard("membran",109,"Russian,English,French,Deutsch"));
        computer[3] = new Monoblock("ACER","Acer Aspire C24-963","Intel Core i3-1005G1,Intel Core i5-1035G1","4Гб,8Гб","256Гб",new Display("23.4'","1920x1080") );
        computer[4] = new Server("HPE","HPE Synergy","6 Cores","4-32 Гб","SSD");
        computer[5] = new Nettop("ASUS","Mini PC PN62S-B7621MV","Intel Core i5 4 Cores","4 Гб","256 Гб");
        for(int i=0;i<6;i++){
            System.out.println(computer[i].turnOn());
            System.out.println(computer[i].connect());
            System.out.println(computer[i].turnOff());
            System.out.println();
        }
    }
}
