import java.util.Date;

    public class Train {
        private String arr_point, num;
        private Date time;
        private int genSeats;
        private int luxSeats;

        String getArrPoint(){
            return arr_point;
        }

        String getNum(){
            return num;
        }

        Date getTime(){
            return time;
        }

        int getgenSeats(){
            return genSeats;
        }
        int getluxSeats(){
            return luxSeats;
        }
        void setArrPoint(String a_p){
            this.arr_point = a_p;
        }

        void setNum(String num){
            this.num = num;
        }
        void setTime(int time){
            this.time.setTime(time);
        }

        void setgenSeats(int seats){
            this.genSeats = seats;
        }
        void setgluxSeats(int seats){
            this.luxSeats = seats;
        }

        public Train(String arr_point,String num , int time, int genseats,int luxseats){
            this.arr_point = arr_point;
            this.num = num;
            this.time = new Date(time);
            this.genSeats = genseats;
            this.luxSeats = luxseats;
        }

        @Override
        public String toString(){
        return  "\n------------------------------------------\n"+
                "Arrival point: " + this.arr_point + "\n"+
                "Train number: " + this.num + "\n" +
                "Departure time: " + this.time + "\n"+
                "Num of general seats: " + this.genSeats+ "\n" +
                "Num of lux seats: " + this.luxSeats+ "\n" +
                "------------------------------------------\n";
        }


    }


