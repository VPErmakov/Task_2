import java.util.Scanner;

public class TaskVec {
    public static void main(String[] args){

        Scanner fVectorX = new Scanner(System.in);
        double x1 = fVectorX.nextDouble();

        Scanner fVectorY = new Scanner(System.in);
        double y1 = fVectorY.nextDouble();

        Scanner fVectorZ = new Scanner(System.in);
        double z1 = fVectorZ.nextDouble();

        Scanner sVectorX = new Scanner(System.in);
        double x2 = sVectorX.nextDouble();

        Scanner sVectorY = new Scanner(System.in);
        double y2 = sVectorY.nextDouble();

        Scanner sVectorZ = new Scanner(System.in);
        double z2 = sVectorZ.nextDouble();


        Vector vector1 = new Vector(x1,y1,z1);
        Vector vector2 = new Vector(x2,y2,z2);
        Vector vectorCP = vector1.crossProduct(vector2);
        Vector vectorSum = vector1.add(vector2);
        Vector vectorSub = vector1.subtract(vector2);

        System.out.println("Length 1 ="+ vector1.length());
        System.out.println("Length 2 ="+ vector2.length());
        System.out.println("Scalar product ="+vector1.scalarProduct(vector2));
        System.out.println("Cross product=("+vectorCP.x+","+vectorCP.y+","+vectorCP.z+")");
        System.out.println("Cosinus ="+vector1.cos(vector2));
        System.out.println("Sum of vectors=("+vectorSum.x+","+vectorSum.y+","+vectorSum.z+")");
        System.out.println("Dif of vectors=("+vectorSub.x+","+vectorSub.y+","+vectorSub.z+")");





    }
}
