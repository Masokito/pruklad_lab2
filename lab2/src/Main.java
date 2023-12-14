import java.util.*;

public class Main {


    public static void getTrainіByArrlPoint(List<Train> trains,String arrpoint){
        for(Train train: trains){
            if(train.getArrPoint() == arrpoint){
                System.out.print(train.toString());
            }
        }
    }

    public static void getTrainіByArrlPointAndHour(List<Train> trains,String arrpoint,int hour){
        for(Train train: trains){
            if(train.getArrPoint() == arrpoint && hour == train.getTime().getHours()){
                System.out.print(train.toString());
            }
        }
    }

    public static void getTrainіBySameArrPointSameSeats(List<Train> trains,String arrpoint) {
        for (Train train : trains) {
            if (train.getArrPoint() == arrpoint && 0 < train.getgenSeats()) {
                System.out.print(train.toString());
            }
        }
    }
    public static List<Train> createTrainArray(){
        List<Train> trainArr = new ArrayList<Train>();
        Train train1 = new Train("Santa Monica","24B",888888,24,34);
        Train train2 = new Train("Los Angeles","22AB",888999,50,34);
        Train train3 = new Train("New York","19AB",877777,65,34);
        Train train4 = new Train("New York","29AB",888843,0,74);
        Train train5 = new Train("New York","18AB",901999,71,334);
        trainArr.add(train1);
        trainArr.add(train2);
        trainArr.add(train3);
        trainArr.add(train4);
        trainArr.add(train5);
        return trainArr;
    }
    public static void main(String[] args){
        List<Train> trainArr= createTrainArray();
        System.out.println("a) Trains with arrival point 'New York':");
        getTrainіByArrlPoint(trainArr,"New York");

        System.out.println("b)Trains with arrival point 'New York':");
        getTrainіByArrlPointAndHour(trainArr,"New York",16);

        System.out.println("c):Trains with arrival point 'New York' and has general seats");
        getTrainіBySameArrPointSameSeats(trainArr,"New York");

        System.out.println();

    }
}
