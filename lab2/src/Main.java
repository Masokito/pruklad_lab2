import java.util.*;

public class Main {

    public static void getTrainBySeats(List<Train> trains, int seats){
        for(Train train: trains){
            if(train.getSeats() == seats){
                System.out.print(train.toString());
            }
        }
    }
    public static void getTrainInSeatsRange(List<Train> trains, int min,int max){
        for(Train train: trains){
            if(train.getSeats() >= min && train.getSeats() <= max){
                System.out.print(train.toString());
            }
        }
    }

    public static List<Train> createTrainArray(){
        List<Train> trainArr = new ArrayList<Train>();
        Train train1 = new Train("Santa Monica","24B",888888,24);
        Train train2 = new Train("Los Angeles","22AB",888999,50);
        Train train3 = new Train("New York","19AB",877777,65);
        Train train4 = new Train("New York","19AB",901999,71);
        trainArr.add(train1);
        trainArr.add(train2);
        trainArr.add(train3);
        trainArr.add(train4);
        return trainArr;
    }
    public static void main(String[] args){
        List<Train> trainArr= createTrainArray();
        getTrainBySeats(trainArr,24);
        getTrainInSeatsRange(trainArr,25,66);

    }
}
